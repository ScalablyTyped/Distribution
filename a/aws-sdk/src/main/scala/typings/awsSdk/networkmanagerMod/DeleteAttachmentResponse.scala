package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttachmentResponse extends StObject {
  
  /**
    * Information about the deleted attachment.
    */
  var Attachment: js.UndefOr[typings.awsSdk.networkmanagerMod.Attachment] = js.undefined
}
object DeleteAttachmentResponse {
  
  inline def apply(): DeleteAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAttachmentResponse]
  }
  
  extension [Self <: DeleteAttachmentResponse](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
  }
}
