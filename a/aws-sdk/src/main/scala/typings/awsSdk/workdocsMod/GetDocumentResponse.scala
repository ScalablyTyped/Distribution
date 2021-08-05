package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentResponse extends StObject {
  
  /**
    * The custom metadata on the document.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
  
  /**
    * The metadata details of the document.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.undefined
}
object GetDocumentResponse {
  
  inline def apply(): GetDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentResponse]
  }
  
  extension [Self <: GetDocumentResponse](x: Self) {
    
    inline def setCustomMetadata(value: CustomMetadataMap): Self = StObject.set(x, "CustomMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataUndefined: Self = StObject.set(x, "CustomMetadata", js.undefined)
    
    inline def setMetadata(value: DocumentMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
