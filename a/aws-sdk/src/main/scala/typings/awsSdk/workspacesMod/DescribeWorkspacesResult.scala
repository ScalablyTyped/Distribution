package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspacesResult extends StObject {
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the WorkSpaces. Because CreateWorkspaces is an asynchronous operation, some of the returned information could be incomplete.
    */
  var Workspaces: js.UndefOr[WorkspaceList] = js.undefined
}
object DescribeWorkspacesResult {
  
  inline def apply(): DescribeWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesResult]
  }
  
  extension [Self <: DescribeWorkspacesResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkspaces(value: WorkspaceList): Self = StObject.set(x, "Workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesUndefined: Self = StObject.set(x, "Workspaces", js.undefined)
    
    inline def setWorkspacesVarargs(value: Workspace*): Self = StObject.set(x, "Workspaces", js.Array(value :_*))
  }
}
