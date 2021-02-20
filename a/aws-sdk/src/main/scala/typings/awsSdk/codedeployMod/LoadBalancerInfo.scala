package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerInfo extends StObject {
  
  /**
    * An array that contains information about the load balancer to use for load balancing in a deployment. In Elastic Load Balancing, load balancers are used with Classic Load Balancers.   Adding more than one load balancer to the array is not supported.  
    */
  var elbInfoList: js.UndefOr[ELBInfoList] = js.native
  
  /**
    * An array that contains information about the target group to use for load balancing in a deployment. In Elastic Load Balancing, target groups are used with Application Load Balancers.   Adding more than one target group to the array is not supported.  
    */
  var targetGroupInfoList: js.UndefOr[TargetGroupInfoList] = js.native
  
  /**
    *  The target group pair information. This is an array of TargeGroupPairInfo objects with a maximum size of one. 
    */
  var targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList] = js.native
}
object LoadBalancerInfo {
  
  @scala.inline
  def apply(): LoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerInfo]
  }
  
  @scala.inline
  implicit class LoadBalancerInfoMutableBuilder[Self <: LoadBalancerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElbInfoList(value: ELBInfoList): Self = StObject.set(x, "elbInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbInfoListUndefined: Self = StObject.set(x, "elbInfoList", js.undefined)
    
    @scala.inline
    def setElbInfoListVarargs(value: ELBInfo*): Self = StObject.set(x, "elbInfoList", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupInfoList(value: TargetGroupInfoList): Self = StObject.set(x, "targetGroupInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupInfoListUndefined: Self = StObject.set(x, "targetGroupInfoList", js.undefined)
    
    @scala.inline
    def setTargetGroupInfoListVarargs(value: TargetGroupInfo*): Self = StObject.set(x, "targetGroupInfoList", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupPairInfoList(value: TargetGroupPairInfoList): Self = StObject.set(x, "targetGroupPairInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupPairInfoListUndefined: Self = StObject.set(x, "targetGroupPairInfoList", js.undefined)
    
    @scala.inline
    def setTargetGroupPairInfoListVarargs(value: TargetGroupPairInfo*): Self = StObject.set(x, "targetGroupPairInfoList", js.Array(value :_*))
  }
}
