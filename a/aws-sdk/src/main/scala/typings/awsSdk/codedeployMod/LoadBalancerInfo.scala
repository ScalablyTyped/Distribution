package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerInfo extends js.Object {
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
  def apply(
    elbInfoList: ELBInfoList = null,
    targetGroupInfoList: TargetGroupInfoList = null,
    targetGroupPairInfoList: TargetGroupPairInfoList = null
  ): LoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    if (elbInfoList != null) __obj.updateDynamic("elbInfoList")(elbInfoList.asInstanceOf[js.Any])
    if (targetGroupInfoList != null) __obj.updateDynamic("targetGroupInfoList")(targetGroupInfoList.asInstanceOf[js.Any])
    if (targetGroupPairInfoList != null) __obj.updateDynamic("targetGroupPairInfoList")(targetGroupPairInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerInfo]
  }
}

