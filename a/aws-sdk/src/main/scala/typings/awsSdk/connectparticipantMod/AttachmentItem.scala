package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentItem extends StObject {
  
  /**
    * A unique identifier for the attachment.
    */
  var AttachmentId: js.UndefOr[ArtifactId] = js.undefined
  
  /**
    * A case-sensitive name of the attachment being uploaded.
    */
  var AttachmentName: js.UndefOr[typings.awsSdk.connectparticipantMod.AttachmentName] = js.undefined
  
  /**
    * Describes the MIME file type of the attachment. For a list of supported file types, see Feature specifications in the Amazon Connect Administrator Guide.
    */
  var ContentType: js.UndefOr[typings.awsSdk.connectparticipantMod.ContentType] = js.undefined
  
  /**
    * Status of the attachment.
    */
  var Status: js.UndefOr[ArtifactStatus] = js.undefined
}
object AttachmentItem {
  
  inline def apply(): AttachmentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentItem]
  }
  
  extension [Self <: AttachmentItem](x: Self) {
    
    inline def setAttachmentId(value: ArtifactId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setAttachmentName(value: AttachmentName): Self = StObject.set(x, "AttachmentName", value.asInstanceOf[js.Any])
    
    inline def setAttachmentNameUndefined: Self = StObject.set(x, "AttachmentName", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setStatus(value: ArtifactStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
