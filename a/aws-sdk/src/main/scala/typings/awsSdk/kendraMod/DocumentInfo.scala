package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentInfo extends StObject {
  
  /**
    * Attributes that identify a specific version of a document to check. The only valid attributes are:   version   datasourceId   jobExecutionId   The attributes follow these rules:    dataSourceId and jobExecutionId must be used together.    version is ignored if dataSourceId and jobExecutionId are not provided.   If dataSourceId and jobExecutionId are provided, but version is not, the version defaults to "0".  
    */
  var Attributes: js.UndefOr[DocumentAttributeList] = js.undefined
  
  /**
    * The unique identifier of the document.
    */
  var DocumentId: typings.awsSdk.kendraMod.DocumentId
}
object DocumentInfo {
  
  inline def apply(DocumentId: DocumentId): DocumentInfo = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInfo]
  }
  
  extension [Self <: DocumentInfo](x: Self) {
    
    inline def setAttributes(value: DocumentAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: DocumentAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setDocumentId(value: DocumentId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
  }
}
