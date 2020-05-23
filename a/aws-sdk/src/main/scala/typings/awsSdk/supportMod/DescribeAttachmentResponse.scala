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
  def apply(attachment: Attachment = null): DescribeAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttachmentResponse]
  }
}

