package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentVersionRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  
  /**
    * The version ID of the document.
    */
  var VersionId: DocumentVersionIdType
  
  /**
    * The status of the version.
    */
  var VersionStatus: js.UndefOr[DocumentVersionStatus] = js.undefined
}
object UpdateDocumentVersionRequest {
  
  inline def apply(DocumentId: ResourceIdType, VersionId: DocumentVersionIdType): UpdateDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentVersionRequest]
  }
  
  extension [Self <: UpdateDocumentVersionRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionStatus(value: DocumentVersionStatus): Self = StObject.set(x, "VersionStatus", value.asInstanceOf[js.Any])
    
    inline def setVersionStatusUndefined: Self = StObject.set(x, "VersionStatus", js.undefined)
  }
}
