package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType = js.native
  
  /**
    * Set this to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.native
}
object GetDocumentRequest {
  
  @scala.inline
  def apply(DocumentId: ResourceIdType): GetDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentRequest]
  }
  
  @scala.inline
  implicit class GetDocumentRequestMutableBuilder[Self <: GetDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCustomMetadata(value: BooleanType): Self = StObject.set(x, "IncludeCustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCustomMetadataUndefined: Self = StObject.set(x, "IncludeCustomMetadata", js.undefined)
  }
}
