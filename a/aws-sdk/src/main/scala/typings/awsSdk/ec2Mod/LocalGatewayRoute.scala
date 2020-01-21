package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRoute extends js.Object {
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[String] = js.native
  /**
    * The state of the route.
    */
  var State: js.UndefOr[LocalGatewayRouteState] = js.native
  /**
    * The route type.
    */
  var Type: js.UndefOr[LocalGatewayRouteType] = js.native
}

object LocalGatewayRoute {
  @scala.inline
  def apply(
    DestinationCidrBlock: String = null,
    LocalGatewayRouteTableId: String = null,
    LocalGatewayVirtualInterfaceGroupId: String = null,
    State: LocalGatewayRouteState = null,
    Type: LocalGatewayRouteType = null
  ): LocalGatewayRoute = {
    val __obj = js.Dynamic.literal()
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableId != null) __obj.updateDynamic("LocalGatewayRouteTableId")(LocalGatewayRouteTableId.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceGroupId != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceGroupId")(LocalGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayRoute]
  }
}

