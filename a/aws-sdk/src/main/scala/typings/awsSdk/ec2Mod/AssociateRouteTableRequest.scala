package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRouteTableRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[RouteGatewayId] = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
}

object AssociateRouteTableRequest {
  @scala.inline
  def apply(
    RouteTableId: RouteTableId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    GatewayId: RouteGatewayId = null,
    SubnetId: SubnetId = null
  ): AssociateRouteTableRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRouteTableRequest]
  }
}

