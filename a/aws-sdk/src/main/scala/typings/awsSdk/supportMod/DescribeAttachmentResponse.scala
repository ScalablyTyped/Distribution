package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttachmentResponse extends js.Object {
  /**
    * This object includes the attachment content and file name. In the previous response syntax, the value for the data parameter appears as blob, which is represented as a base64-encoded string. The value for fileName is the name of the attachment, such as troubleshoot-screenshot.png.
    */
  var attachment: js.UndefOr[Attachment] = js.native
}

object DescribeAttachmentResponse {
  @scala.inline
  def apply(): DescribeAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAttachmentResponse]
  }
  @scala.inline
  implicit class DescribeAttachmentResponseOps[Self <: DescribeAttachmentResponse] (val x: Self) extends AnyVal {
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
    def setAttachment(value: Attachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
  }
  
}

