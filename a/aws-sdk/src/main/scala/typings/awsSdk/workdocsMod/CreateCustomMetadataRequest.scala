package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomMetadataRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * Custom metadata in the form of name-value pairs.
    */
  var CustomMetadata: CustomMetadataMap = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
  
  /**
    * The ID of the version, if the custom metadata is being added to a document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}
object CreateCustomMetadataRequest {
  
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap, ResourceId: ResourceIdType): CreateCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(CustomMetadata = CustomMetadata.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomMetadataRequest]
  }
  
  @scala.inline
  implicit class CreateCustomMetadataRequestMutableBuilder[Self <: CreateCustomMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setCustomMetadata(value: CustomMetadataMap): Self = StObject.set(x, "CustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: DocumentVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
