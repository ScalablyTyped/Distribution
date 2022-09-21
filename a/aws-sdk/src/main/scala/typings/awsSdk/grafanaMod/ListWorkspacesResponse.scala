package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesResponse extends StObject {
  
  /**
    * The token to use when requesting the next set of workspaces.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of structures that contain some information about the workspaces in the account.
    */
  var workspaces: WorkspaceList
}
object ListWorkspacesResponse {
  
  inline def apply(workspaces: WorkspaceList): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal(workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  extension [Self <: ListWorkspacesResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkspaces(value: WorkspaceList): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesVarargs(value: WorkspaceSummary*): Self = StObject.set(x, "workspaces", js.Array(value*))
  }
}
