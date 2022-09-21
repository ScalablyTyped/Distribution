package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerInfo extends StObject {
  
  /**
    * An array that contains information about the load balancer to use for load balancing in a deployment. In Elastic Load Balancing, load balancers are used with Classic Load Balancers.   Adding more than one load balancer to the array is not supported.  
    */
  var elbInfoList: js.UndefOr[ELBInfoList] = js.undefined
  
  /**
    * An array that contains information about the target group to use for load balancing in a deployment. In Elastic Load Balancing, target groups are used with Application Load Balancers.   Adding more than one target group to the array is not supported.  
    */
  var targetGroupInfoList: js.UndefOr[TargetGroupInfoList] = js.undefined
  
  /**
    *  The target group pair information. This is an array of TargeGroupPairInfo objects with a maximum size of one. 
    */
  var targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList] = js.undefined
}
object LoadBalancerInfo {
  
  inline def apply(): LoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerInfo]
  }
  
  extension [Self <: LoadBalancerInfo](x: Self) {
    
    inline def setElbInfoList(value: ELBInfoList): Self = StObject.set(x, "elbInfoList", value.asInstanceOf[js.Any])
    
    inline def setElbInfoListUndefined: Self = StObject.set(x, "elbInfoList", js.undefined)
    
    inline def setElbInfoListVarargs(value: ELBInfo*): Self = StObject.set(x, "elbInfoList", js.Array(value*))
    
    inline def setTargetGroupInfoList(value: TargetGroupInfoList): Self = StObject.set(x, "targetGroupInfoList", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupInfoListUndefined: Self = StObject.set(x, "targetGroupInfoList", js.undefined)
    
    inline def setTargetGroupInfoListVarargs(value: TargetGroupInfo*): Self = StObject.set(x, "targetGroupInfoList", js.Array(value*))
    
    inline def setTargetGroupPairInfoList(value: TargetGroupPairInfoList): Self = StObject.set(x, "targetGroupPairInfoList", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupPairInfoListUndefined: Self = StObject.set(x, "targetGroupPairInfoList", js.undefined)
    
    inline def setTargetGroupPairInfoListVarargs(value: TargetGroupPairInfo*): Self = StObject.set(x, "targetGroupPairInfoList", js.Array(value*))
  }
}
