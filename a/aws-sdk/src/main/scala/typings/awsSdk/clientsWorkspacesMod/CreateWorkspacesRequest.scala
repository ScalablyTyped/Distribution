package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
    */
  var Workspaces: WorkspaceRequestList
}
object CreateWorkspacesRequest {
  
  inline def apply(Workspaces: WorkspaceRequestList): CreateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(Workspaces = Workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspacesRequest]
  }
  
  extension [Self <: CreateWorkspacesRequest](x: Self) {
    
    inline def setWorkspaces(value: WorkspaceRequestList): Self = StObject.set(x, "Workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesVarargs(value: WorkspaceRequest*): Self = StObject.set(x, "Workspaces", js.Array(value*))
  }
}
