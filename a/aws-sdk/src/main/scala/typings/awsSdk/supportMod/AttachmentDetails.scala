package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentDetails extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var attachmentId: js.UndefOr[AttachmentId] = js.undefined
  
  /**
    * The file name of the attachment.
    */
  var fileName: js.UndefOr[FileName] = js.undefined
}
object AttachmentDetails {
  
  inline def apply(): AttachmentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentDetails]
  }
  
  extension [Self <: AttachmentDetails](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setFileName(value: FileName): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}
