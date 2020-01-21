package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttachmentResponse extends js.Object {
  /**
    * The attachment content and file name.
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

