package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayRouteRequest extends js.Object {
  /**
    * Indicates whether to drop traffic that matches this route.
    */
  var Blackhole: js.UndefOr[Boolean] = js.native
  /**
    * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayAttachmentId] = js.native
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: typings.awsSdk.ec2Mod.TransitGatewayRouteTableId = js.native
}

object CreateTransitGatewayRouteRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    TransitGatewayRouteTableId: TransitGatewayRouteTableId,
    Blackhole: js.UndefOr[Boolean] = js.undefined,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TransitGatewayAttachmentId: TransitGatewayAttachmentId = null
  ): CreateTransitGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(Blackhole)) __obj.updateDynamic("Blackhole")(Blackhole.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayRouteRequest]
  }
}

