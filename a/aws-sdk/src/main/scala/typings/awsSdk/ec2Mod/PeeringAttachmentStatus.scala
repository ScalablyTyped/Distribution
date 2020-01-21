package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeeringAttachmentStatus extends js.Object {
  /**
    * The status code.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The status message, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}

object PeeringAttachmentStatus {
  @scala.inline
  def apply(Code: String = null, Message: String = null): PeeringAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeeringAttachmentStatus]
  }
}

