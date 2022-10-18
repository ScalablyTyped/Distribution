package typings.awsSdk.clientsWorkdocsMod

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
  
  inline def apply(FolderId: ResourceIdType): DeleteFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFolderContentsRequest]
  }
  
  extension [Self <: DeleteFolderContentsRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setFolderId(value: ResourceIdType): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
  }
}
