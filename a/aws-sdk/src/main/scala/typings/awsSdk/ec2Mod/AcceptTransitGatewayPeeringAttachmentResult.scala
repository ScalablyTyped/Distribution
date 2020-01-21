package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptTransitGatewayPeeringAttachmentResult extends js.Object {
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayPeeringAttachment] = js.native
}

object AcceptTransitGatewayPeeringAttachmentResult {
  @scala.inline
  def apply(TransitGatewayPeeringAttachment: TransitGatewayPeeringAttachment = null): AcceptTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayPeeringAttachment != null) __obj.updateDynamic("TransitGatewayPeeringAttachment")(TransitGatewayPeeringAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptTransitGatewayPeeringAttachmentResult]
  }
}

