package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
}
object DeleteDocumentRequest {
  
  @scala.inline
  def apply(DocumentId: ResourceIdType): DeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentRequest]
  }
  
  @scala.inline
  implicit class DeleteDocumentRequestMutableBuilder[Self <: DeleteDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
  }
}
