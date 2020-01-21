package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * Information about the attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.native
}

object RejectTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(TransitGatewayVpcAttachment: TransitGatewayVpcAttachment = null): RejectTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayVpcAttachment != null) __obj.updateDynamic("TransitGatewayVpcAttachment")(TransitGatewayVpcAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectTransitGatewayVpcAttachmentResult]
  }
}

