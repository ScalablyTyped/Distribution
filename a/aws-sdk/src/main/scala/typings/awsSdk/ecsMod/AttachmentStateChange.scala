package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentStateChange extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the attachment.
    */
  var attachmentArn: String = js.native
  /**
    * The status of the attachment.
    */
  var status: String = js.native
}

object AttachmentStateChange {
  @scala.inline
  def apply(attachmentArn: String, status: String): AttachmentStateChange = {
    val __obj = js.Dynamic.literal(attachmentArn = attachmentArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachmentStateChange]
  }
}

