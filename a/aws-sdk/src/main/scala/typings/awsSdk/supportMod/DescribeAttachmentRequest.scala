package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttachmentRequest extends js.Object {
  /**
    * The ID of the attachment to return. Attachment IDs are returned by the DescribeCommunications operation.
    */
  var attachmentId: AttachmentId = js.native
}

object DescribeAttachmentRequest {
  @scala.inline
  def apply(attachmentId: AttachmentId): DescribeAttachmentRequest = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAttachmentRequest]
  }
}

