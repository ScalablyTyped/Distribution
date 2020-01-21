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
  def apply(
    Category: String = null,
    CustomerGatewayConfiguration: String = null,
    CustomerGatewayId: String = null,
    Options: VpnConnectionOptions = null,
    Routes: VpnStaticRouteList = null,
    State: VpnState = null,
    Tags: TagList = null,
    TransitGatewayId: String = null,
    Type: GatewayType = null,
    VgwTelemetry: VgwTelemetryList = null,
    VpnConnectionId: String = null,
    VpnGatewayId: String = null
  ): VpnConnection = {
    val __obj = js.Dynamic.literal()
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (CustomerGatewayConfiguration != null) __obj.updateDynamic("CustomerGatewayConfiguration")(CustomerGatewayConfiguration.asInstanceOf[js.Any])
    if (CustomerGatewayId != null) __obj.updateDynamic("CustomerGatewayId")(CustomerGatewayId.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (Routes != null) __obj.updateDynamic("Routes")(Routes.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VgwTelemetry != null) __obj.updateDynamic("VgwTelemetry")(VgwTelemetry.asInstanceOf[js.Any])
    if (VpnConnectionId != null) __obj.updateDynamic("VpnConnectionId")(VpnConnectionId.asInstanceOf[js.Any])
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnection]
  }
}

