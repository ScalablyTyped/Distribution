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
}

