package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteRequest extends js.Object {
  /**
    * The IPv4 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId = js.native
}

object DeleteRouteRequest {
  @scala.inline
  def apply(
    RouteTableId: RouteTableId,
    DestinationCidrBlock: String = null,
    DestinationIpv6CidrBlock: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock.asInstanceOf[js.Any])
    if (DestinationIpv6CidrBlock != null) __obj.updateDynamic("DestinationIpv6CidrBlock")(DestinationIpv6CidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequest]
  }
}

