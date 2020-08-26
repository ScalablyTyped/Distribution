package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnection extends js.Object {
  /**
    * The category of the VPN connection. A value of VPN indicates an AWS VPN connection. A value of VPN-Classic indicates an AWS Classic VPN connection.
    */
  var Category: js.UndefOr[String] = js.native
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format). This element is always present in the CreateVpnConnection response; however, it's present in the DescribeVpnConnections response only if the VPN connection is in the pending or available state.
    */
  var CustomerGatewayConfiguration: js.UndefOr[String] = js.native
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.native
  /**
    * The VPN connection options.
    */
  var Options: js.UndefOr[VpnConnectionOptions] = js.native
  /**
    * The static routes associated with the VPN connection.
    */
  var Routes: js.UndefOr[VpnStaticRouteList] = js.native
  /**
    * The current state of the VPN connection.
    */
  var State: js.UndefOr[VpnState] = js.native
  /**
    * Any tags assigned to the VPN connection.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the transit gateway associated with the VPN connection.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The type of VPN connection.
    */
  var Type: js.UndefOr[GatewayType] = js.native
  /**
    * Information about the VPN tunnel.
    */
  var VgwTelemetry: js.UndefOr[VgwTelemetryList] = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[String] = js.native
}

object VpnConnection {
  @scala.inline
  def apply(): VpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnection]
  }
  @scala.inline
  implicit class VpnConnectionOps[Self <: VpnConnection] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    @scala.inline
    def setCustomerGatewayConfiguration(value: String): Self = this.set("CustomerGatewayConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayConfiguration: Self = this.set("CustomerGatewayConfiguration", js.undefined)
    @scala.inline
    def setCustomerGatewayId(value: String): Self = this.set("CustomerGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayId: Self = this.set("CustomerGatewayId", js.undefined)
    @scala.inline
    def setOptions(value: VpnConnectionOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: VpnStaticRoute*): Self = this.set("Routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: VpnStaticRouteList): Self = this.set("Routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("Routes", js.undefined)
    @scala.inline
    def setState(value: VpnState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
    @scala.inline
    def setType(value: GatewayType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVgwTelemetryVarargs(value: VgwTelemetry*): Self = this.set("VgwTelemetry", js.Array(value :_*))
    @scala.inline
    def setVgwTelemetry(value: VgwTelemetryList): Self = this.set("VgwTelemetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVgwTelemetry: Self = this.set("VgwTelemetry", js.undefined)
    @scala.inline
    def setVpnConnectionId(value: String): Self = this.set("VpnConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnConnectionId: Self = this.set("VpnConnectionId", js.undefined)
    @scala.inline
    def setVpnGatewayId(value: String): Self = this.set("VpnGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("VpnGatewayId", js.undefined)
  }
  
}

