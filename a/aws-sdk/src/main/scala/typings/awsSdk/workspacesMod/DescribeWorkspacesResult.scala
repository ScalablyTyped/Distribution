package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspacesResult extends StObject {
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the WorkSpaces. Because CreateWorkspaces is an asynchronous operation, some of the returned information could be incomplete.
    */
  var Workspaces: js.UndefOr[WorkspaceList] = js.native
}
object DescribeWorkspacesResult {
  
  @scala.inline
  def apply(): DescribeWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesResult]
  }
  
  @scala.inline
  implicit class DescribeWorkspacesResultMutableBuilder[Self <: DescribeWorkspacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWorkspaces(value: WorkspaceList): Self = StObject.set(x, "Workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesUndefined: Self = StObject.set(x, "Workspaces", js.undefined)
    
    @scala.inline
    def setWorkspacesVarargs(value: Workspace*): Self = StObject.set(x, "Workspaces", js.Array(value :_*))
  }
}
