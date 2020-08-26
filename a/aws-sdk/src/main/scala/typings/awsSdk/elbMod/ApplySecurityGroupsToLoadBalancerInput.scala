package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToLoadBalancerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The IDs of the security groups to associate with the load balancer. Note that you cannot specify the name of the security group.
    */
  var SecurityGroups: typings.awsSdk.elbMod.SecurityGroups = js.native
}

object ApplySecurityGroupsToLoadBalancerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, SecurityGroups: SecurityGroups): ApplySecurityGroupsToLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerInput]
  }
  @scala.inline
  implicit class ApplySecurityGroupsToLoadBalancerInputOps[Self <: ApplySecurityGroupsToLoadBalancerInput] (val x: Self) extends AnyVal {
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
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
  }
  
}

