package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAttachmentRequest extends StObject {
  
  /**
    * The ID of the attachment to return. Attachment IDs are returned by the DescribeCommunications operation.
    */
  var attachmentId: AttachmentId
}
object DescribeAttachmentRequest {
  
  @scala.inline
  def apply(attachmentId: AttachmentId): DescribeAttachmentRequest = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttachmentRequest]
  }
  
  @scala.inline
  implicit class DescribeAttachmentRequestMutableBuilder[Self <: DescribeAttachmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
  }
}
