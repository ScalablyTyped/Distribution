package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnConnectionRequest extends js.Object {
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.CustomerGatewayId] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayId] = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId = js.native
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.VpnGatewayId] = js.native
}

object ModifyVpnConnectionRequest {
  @scala.inline
  def apply(VpnConnectionId: VpnConnectionId): ModifyVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnConnectionRequest]
  }
  @scala.inline
  implicit class ModifyVpnConnectionRequestOps[Self <: ModifyVpnConnectionRequest] (val x: Self) extends AnyVal {
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
    def setVpnConnectionId(value: VpnConnectionId): Self = this.set("VpnConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerGatewayId(value: CustomerGatewayId): Self = this.set("CustomerGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayId: Self = this.set("CustomerGatewayId", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
    @scala.inline
    def setVpnGatewayId(value: VpnGatewayId): Self = this.set("VpnGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("VpnGatewayId", js.undefined)
  }
  
}

