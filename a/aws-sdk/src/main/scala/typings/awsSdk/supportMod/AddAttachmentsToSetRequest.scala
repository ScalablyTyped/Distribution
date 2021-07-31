package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAttachmentsToSetRequest extends StObject {
  
  /**
    * The ID of the attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
  
  /**
    * One or more attachments to add to the set. You can add up to three attachments per set. The size limit is 5 MB per attachment. In the Attachment object, use the data parameter to specify the contents of the attachment file. In the previous request syntax, the value for data appear as blob, which is represented as a base64-encoded string. The value for fileName is the name of the attachment, such as troubleshoot-screenshot.png.
    */
  var attachments: Attachments
}
object AddAttachmentsToSetRequest {
  
  @scala.inline
  def apply(attachments: Attachments): AddAttachmentsToSetRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttachmentsToSetRequest]
  }
  
  @scala.inline
  implicit class AddAttachmentsToSetRequestMutableBuilder[Self <: AddAttachmentsToSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentSetId(value: AttachmentSetId): Self = StObject.set(x, "attachmentSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentSetIdUndefined: Self = StObject.set(x, "attachmentSetId", js.undefined)
    
    @scala.inline
    def setAttachments(value: Attachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
  }
}
