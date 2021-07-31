package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFolderContentsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType
}
object DeleteFolderContentsRequest {
  
  @scala.inline
  def apply(FolderId: ResourceIdType): DeleteFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFolderContentsRequest]
  }
  
  @scala.inline
  implicit class DeleteFolderContentsRequestMutableBuilder[Self <: DeleteFolderContentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setFolderId(value: ResourceIdType): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
  }
}
