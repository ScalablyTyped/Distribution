package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceApiKeyRequest extends StObject {
  
  /**
    * The name of the API key to delete.
    */
  var keyName: ApiKeyName
  
  /**
    * The ID of the workspace to delete.
    */
  var workspaceId: WorkspaceId
}
object DeleteWorkspaceApiKeyRequest {
  
  inline def apply(keyName: ApiKeyName, workspaceId: WorkspaceId): DeleteWorkspaceApiKeyRequest = {
    val __obj = js.Dynamic.literal(keyName = keyName.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceApiKeyRequest]
  }
  
  extension [Self <: DeleteWorkspaceApiKeyRequest](x: Self) {
    
    inline def setKeyName(value: ApiKeyName): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
