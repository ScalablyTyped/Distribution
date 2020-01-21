package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayPeeringAttachmentRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the transit gateway peering attachment.
    */
  var TransitGatewayAttachmentId: String = js.native
}

object DeleteTransitGatewayPeeringAttachmentRequest {
  @scala.inline
  def apply(TransitGatewayAttachmentId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteTransitGatewayPeeringAttachmentRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayPeeringAttachmentRequest]
  }
}

