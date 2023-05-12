package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentDefaultVersionRequest extends StObject {
  
  /**
    * The version of a custom document that you want to set as the default version.
    */
  var DocumentVersion: DocumentVersionNumber
  
  /**
    * The name of a custom document that you want to set as the default version.
    */
  var Name: DocumentName
}
object UpdateDocumentDefaultVersionRequest {
  
  inline def apply(DocumentVersion: DocumentVersionNumber, Name: DocumentName): UpdateDocumentDefaultVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentDefaultVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDocumentDefaultVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setDocumentVersion(value: DocumentVersionNumber): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
