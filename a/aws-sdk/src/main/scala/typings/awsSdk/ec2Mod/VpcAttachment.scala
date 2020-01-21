package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcAttachment extends js.Object {
  /**
    * The current state of the attachment.
    */
  var State: js.UndefOr[AttachmentStatus] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object VpcAttachment {
  @scala.inline
  def apply(State: AttachmentStatus = null, VpcId: String = null): VpcAttachment = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachment]
  }
}

