package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  
  /**
    * Set this to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
}
object GetDocumentRequest {
  
  inline def apply(DocumentId: ResourceIdType): GetDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentRequest]
  }
  
  extension [Self <: GetDocumentRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setIncludeCustomMetadata(value: BooleanType): Self = StObject.set(x, "IncludeCustomMetadata", value.asInstanceOf[js.Any])
    
    inline def setIncludeCustomMetadataUndefined: Self = StObject.set(x, "IncludeCustomMetadata", js.undefined)
  }
}
