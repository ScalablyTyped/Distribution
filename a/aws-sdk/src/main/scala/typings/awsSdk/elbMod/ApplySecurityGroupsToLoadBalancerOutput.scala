package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToLoadBalancerOutput extends js.Object {
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.elbMod.SecurityGroups] = js.native
}

object ApplySecurityGroupsToLoadBalancerOutput {
  @scala.inline
  def apply(SecurityGroups: SecurityGroups = null): ApplySecurityGroupsToLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
  }
}

