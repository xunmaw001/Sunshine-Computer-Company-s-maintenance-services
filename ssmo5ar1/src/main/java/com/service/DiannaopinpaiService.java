package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiannaopinpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiannaopinpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiannaopinpaiView;


/**
 * 电脑品牌
 *
 * @author 
 * @email 
 * @date 2021-04-27 14:05:12
 */
public interface DiannaopinpaiService extends IService<DiannaopinpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiannaopinpaiVO> selectListVO(Wrapper<DiannaopinpaiEntity> wrapper);
   	
   	DiannaopinpaiVO selectVO(@Param("ew") Wrapper<DiannaopinpaiEntity> wrapper);
   	
   	List<DiannaopinpaiView> selectListView(Wrapper<DiannaopinpaiEntity> wrapper);
   	
   	DiannaopinpaiView selectView(@Param("ew") Wrapper<DiannaopinpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiannaopinpaiEntity> wrapper);
   	
}

