package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnRoute extends js.Object {
  /**
    * The ID of the Client VPN endpoint with which the route is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * A brief description of the route.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the route destination.
    */
  var DestinationCidr: js.UndefOr[String] = js.native
  /**
    * Indicates how the route was associated with the Client VPN endpoint. associate indicates that the route was automatically added when the target network was associated with the Client VPN endpoint. add-route indicates that the route was manually added using the CreateClientVpnRoute action.
    */
  var Origin: js.UndefOr[String] = js.native
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.native
  /**
    * The ID of the subnet through which traffic is routed.
    */
  var TargetSubnet: js.UndefOr[String] = js.native
  /**
    * The route type.
    */
  var Type: js.UndefOr[String] = js.native
}

object ClientVpnRoute {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String = null,
    Description: String = null,
    DestinationCidr: String = null,
    Origin: String = null,
    Status: ClientVpnRouteStatus = null,
    TargetSubnet: String = null,
    Type: String = null
  ): ClientVpnRoute = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DestinationCidr != null) __obj.updateDynamic("DestinationCidr")(DestinationCidr.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetSubnet != null) __obj.updateDynamic("TargetSubnet")(TargetSubnet.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpnRoute]
  }
}

