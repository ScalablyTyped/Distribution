package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToClientVpnTargetNetworkResult extends js.Object {
  /**
    * The IDs of the applied security groups.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
}

object ApplySecurityGroupsToClientVpnTargetNetworkResult {
  @scala.inline
  def apply(SecurityGroupIds: ClientVpnSecurityGroupIdSet = null): ApplySecurityGroupsToClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkResult]
  }
}

