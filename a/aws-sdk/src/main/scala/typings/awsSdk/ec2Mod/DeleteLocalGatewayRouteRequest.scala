package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLocalGatewayRouteRequest extends js.Object {
  /**
    * The CIDR range for the route. This must match the CIDR for the route exactly.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: String = js.native
}

object DeleteLocalGatewayRouteRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    LocalGatewayRouteTableId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteLocalGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocalGatewayRouteRequest]
  }
}

