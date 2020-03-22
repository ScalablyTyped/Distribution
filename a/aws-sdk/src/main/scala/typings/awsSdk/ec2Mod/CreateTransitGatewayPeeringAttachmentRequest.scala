package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayPeeringAttachmentRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The AWS account ID of the owner of the peer transit gateway.
    */
  var PeerAccountId: String = js.native
  /**
    * The Region where the peer transit gateway is located.
    */
  var PeerRegion: String = js.native
  /**
    * The ID of the peer transit gateway with which to create the peering attachment.
    */
  var PeerTransitGatewayId: String = js.native
  /**
    * The tags to apply to the transit gateway peering attachment.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typings.awsSdk.ec2Mod.TransitGatewayId = js.native
}

object CreateTransitGatewayPeeringAttachmentRequest {
  @scala.inline
  def apply(
    PeerAccountId: String,
    PeerRegion: String,
    PeerTransitGatewayId: String,
    TransitGatewayId: TransitGatewayId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null
  ): CreateTransitGatewayPeeringAttachmentRequest = {
    val __obj = js.Dynamic.literal(PeerAccountId = PeerAccountId.asInstanceOf[js.Any], PeerRegion = PeerRegion.asInstanceOf[js.Any], PeerTransitGatewayId = PeerTransitGatewayId.asInstanceOf[js.Any], TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentRequest]
  }
}

