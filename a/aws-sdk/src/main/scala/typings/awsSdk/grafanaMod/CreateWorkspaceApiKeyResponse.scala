package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceApiKeyResponse extends StObject {
  
  /**
    * The key token that was created. Use this value as a bearer token to authenticate HTTP requests to the workspace.
    */
  var key: ApiKeyToken
  
  /**
    * The name of the key that was created.
    */
  var keyName: ApiKeyName
  
  /**
    * The ID of the workspace that the key is valid for.
    */
  var workspaceId: WorkspaceId
}
object CreateWorkspaceApiKeyResponse {
  
  inline def apply(key: ApiKeyToken, keyName: ApiKeyName, workspaceId: WorkspaceId): CreateWorkspaceApiKeyResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceApiKeyResponse]
  }
  
  extension [Self <: CreateWorkspaceApiKeyResponse](x: Self) {
    
    inline def setKey(value: ApiKeyToken): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: ApiKeyName): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
