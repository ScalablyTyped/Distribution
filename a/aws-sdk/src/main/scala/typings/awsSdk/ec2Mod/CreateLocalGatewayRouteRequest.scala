package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteRequest extends js.Object {
  /**
    * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId = js.native
}

object CreateLocalGatewayRouteRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    LocalGatewayRouteTableId: LocalGatewayRoutetableId,
    LocalGatewayVirtualInterfaceGroupId: LocalGatewayVirtualInterfaceGroupId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): CreateLocalGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any], LocalGatewayVirtualInterfaceGroupId = LocalGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteRequest]
  }
}

