package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAttachmentsToSetResponse extends StObject {
  
  /**
    * The ID of the attachment set. If an attachmentSetId was not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId was specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  
  /**
    * The time and date when the attachment set expires.
    */
  var expiryTime: js.UndefOr[ExpiryTime] = js.native
}
object AddAttachmentsToSetResponse {
  
  @scala.inline
  def apply(): AddAttachmentsToSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAttachmentsToSetResponse]
  }
  
  @scala.inline
  implicit class AddAttachmentsToSetResponseMutableBuilder[Self <: AddAttachmentsToSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentSetId(value: AttachmentSetId): Self = StObject.set(x, "attachmentSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentSetIdUndefined: Self = StObject.set(x, "attachmentSetId", js.undefined)
    
    @scala.inline
    def setExpiryTime(value: ExpiryTime): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
  }
}
