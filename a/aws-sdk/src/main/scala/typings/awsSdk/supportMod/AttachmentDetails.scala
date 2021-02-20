package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentDetails extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var attachmentId: js.UndefOr[AttachmentId] = js.native
  
  /**
    * The file name of the attachment.
    */
  var fileName: js.UndefOr[FileName] = js.native
}
object AttachmentDetails {
  
  @scala.inline
  def apply(): AttachmentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentDetails]
  }
  
  @scala.inline
  implicit class AttachmentDetailsMutableBuilder[Self <: AttachmentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    @scala.inline
    def setFileName(value: FileName): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}
