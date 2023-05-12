package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentVersionRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * Deletes all versions of a document prior to the current version.
    */
  var DeletePriorVersions: BooleanType
  
  /**
    * The ID of the document associated with the version being deleted.
    */
  var DocumentId: ResourceIdType
  
  /**
    * The ID of the version being deleted.
    */
  var VersionId: DocumentVersionIdType
}
object DeleteDocumentVersionRequest {
  
  inline def apply(DeletePriorVersions: BooleanType, DocumentId: ResourceIdType, VersionId: DocumentVersionIdType): DeleteDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DeletePriorVersions = DeletePriorVersions.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDocumentVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setDeletePriorVersions(value: BooleanType): Self = StObject.set(x, "DeletePriorVersions", value.asInstanceOf[js.Any])
    
    inline def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
  }
}
