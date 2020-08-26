package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeClientVpnIngressRequest extends js.Object {
  /**
    * The ID of the Active Directory group for which to revoke access. 
    */
  var AccessGroupId: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether access should be revoked for all clients.
    */
  var RevokeAllGroups: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
    */
  var TargetNetworkCidr: String = js.native
}

object RevokeClientVpnIngressRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, TargetNetworkCidr: String): RevokeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClientVpnIngressRequest]
  }
  @scala.inline
  implicit class RevokeClientVpnIngressRequestOps[Self <: RevokeClientVpnIngressRequest] (val x: Self) extends AnyVal {
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
    def setTargetNetworkCidr(value: String): Self = this.set("TargetNetworkCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessGroupId(value: String): Self = this.set("AccessGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessGroupId: Self = this.set("AccessGroupId", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setRevokeAllGroups(value: Boolean): Self = this.set("RevokeAllGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevokeAllGroups: Self = this.set("RevokeAllGroups", js.undefined)
  }
  
}

