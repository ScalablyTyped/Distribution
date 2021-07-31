package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFolderRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType
  
  /**
    * Set to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
}
object GetFolderRequest {
  
  @scala.inline
  def apply(FolderId: ResourceIdType): GetFolderRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderRequest]
  }
  
  @scala.inline
  implicit class GetFolderRequestMutableBuilder[Self <: GetFolderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setFolderId(value: ResourceIdType): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCustomMetadata(value: BooleanType): Self = StObject.set(x, "IncludeCustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCustomMetadataUndefined: Self = StObject.set(x, "IncludeCustomMetadata", js.undefined)
  }
}
