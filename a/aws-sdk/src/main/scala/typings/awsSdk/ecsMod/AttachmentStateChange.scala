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
  @scala.inline
  implicit class AttachmentStateChangeOps[Self <: AttachmentStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachmentArn(value: String): Self = this.set("attachmentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

