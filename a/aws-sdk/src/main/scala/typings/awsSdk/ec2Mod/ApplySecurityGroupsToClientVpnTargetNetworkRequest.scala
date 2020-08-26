package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToClientVpnTargetNetworkRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied to an associated target network.
    */
  var SecurityGroupIds: ClientVpnSecurityGroupIdSet = js.native
  /**
    * The ID of the VPC in which the associated target network is located.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object ApplySecurityGroupsToClientVpnTargetNetworkRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    SecurityGroupIds: ClientVpnSecurityGroupIdSet,
    VpcId: VpcId
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkRequest]
  }
  @scala.inline
  implicit class ApplySecurityGroupsToClientVpnTargetNetworkRequestOps[Self <: ApplySecurityGroupsToClientVpnTargetNetworkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

