package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnConnectionRequest extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: typings.awsSdk.ec2Mod.CustomerGatewayId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The options for the VPN connection.
    */
  var Options: js.UndefOr[VpnConnectionOptionsSpecification] = js.native
  /**
    * The tags to apply to the VPN connection.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayId] = js.native
  /**
    * The type of VPN connection (ipsec.1).
    */
  var Type: String = js.native
  /**
    * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit gateway.
    */
  var VpnGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.VpnGatewayId] = js.native
}

object CreateVpnConnectionRequest {
  @scala.inline
  def apply(CustomerGatewayId: CustomerGatewayId, Type: String): CreateVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnConnectionRequest]
  }
  @scala.inline
  implicit class CreateVpnConnectionRequestOps[Self <: CreateVpnConnectionRequest] (val x: Self) extends AnyVal {
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
    def setCustomerGatewayId(value: CustomerGatewayId): Self = this.set("CustomerGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setOptions(value: VpnConnectionOptionsSpecification): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
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

