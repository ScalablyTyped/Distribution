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
  def apply(): LoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerInfo]
  }
  @scala.inline
  implicit class LoadBalancerInfoOps[Self <: LoadBalancerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElbInfoListVarargs(value: ELBInfo*): Self = this.set("elbInfoList", js.Array(value :_*))
    @scala.inline
    def setElbInfoList(value: ELBInfoList): Self = this.set("elbInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElbInfoList: Self = this.set("elbInfoList", js.undefined)
    @scala.inline
    def setTargetGroupInfoListVarargs(value: TargetGroupInfo*): Self = this.set("targetGroupInfoList", js.Array(value :_*))
    @scala.inline
    def setTargetGroupInfoList(value: TargetGroupInfoList): Self = this.set("targetGroupInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupInfoList: Self = this.set("targetGroupInfoList", js.undefined)
    @scala.inline
    def setTargetGroupPairInfoListVarargs(value: TargetGroupPairInfo*): Self = this.set("targetGroupPairInfoList", js.Array(value :_*))
    @scala.inline
    def setTargetGroupPairInfoList(value: TargetGroupPairInfoList): Self = this.set("targetGroupPairInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupPairInfoList: Self = this.set("targetGroupPairInfoList", js.undefined)
  }
  
}

