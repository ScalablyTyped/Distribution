package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeIDResponse extends StObject {
  
  /**
    * The version of the AnalyzeIdentity API being used to process documents.
    */
  var AnalyzeIDModelVersion: js.UndefOr[String] = js.undefined
  
  var DocumentMetadata: js.UndefOr[typings.awsSdk.textractMod.DocumentMetadata] = js.undefined
  
  /**
    * The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the response structure for the document.
    */
  var IdentityDocuments: js.UndefOr[IdentityDocumentList] = js.undefined
}
object AnalyzeIDResponse {
  
  inline def apply(): AnalyzeIDResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeIDResponse]
  }
  
  extension [Self <: AnalyzeIDResponse](x: Self) {
    
    inline def setAnalyzeIDModelVersion(value: String): Self = StObject.set(x, "AnalyzeIDModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeIDModelVersionUndefined: Self = StObject.set(x, "AnalyzeIDModelVersion", js.undefined)
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setIdentityDocuments(value: IdentityDocumentList): Self = StObject.set(x, "IdentityDocuments", value.asInstanceOf[js.Any])
    
    inline def setIdentityDocumentsUndefined: Self = StObject.set(x, "IdentityDocuments", js.undefined)
    
    inline def setIdentityDocumentsVarargs(value: IdentityDocument*): Self = StObject.set(x, "IdentityDocuments", js.Array(value*))
  }
}
