package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomMetadataRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * Flag to indicate removal of all custom metadata properties from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.native
  
  /**
    * List of properties to remove.
    */
  var Keys: js.UndefOr[CustomMetadataKeyList] = js.native
  
  /**
    * The ID of the resource, either a document or folder.
    */
  var ResourceId: ResourceIdType = js.native
  
  /**
    * The ID of the version, if the custom metadata is being deleted from a document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}
object DeleteCustomMetadataRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceIdType): DeleteCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomMetadataRequest]
  }
  
  @scala.inline
  implicit class DeleteCustomMetadataRequestMutableBuilder[Self <: DeleteCustomMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDeleteAll(value: BooleanType): Self = StObject.set(x, "DeleteAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAllUndefined: Self = StObject.set(x, "DeleteAll", js.undefined)
    
    @scala.inline
    def setKeys(value: CustomMetadataKeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: CustomMetadataKeyType*): Self = StObject.set(x, "Keys", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
