package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspacesConnectionStatusResult extends StObject {
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the connection status of the WorkSpace.
    */
  var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.native
}
object DescribeWorkspacesConnectionStatusResult {
  
  @scala.inline
  def apply(): DescribeWorkspacesConnectionStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusResult]
  }
  
  @scala.inline
  implicit class DescribeWorkspacesConnectionStatusResultMutableBuilder[Self <: DescribeWorkspacesConnectionStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWorkspacesConnectionStatus(value: WorkspaceConnectionStatusList): Self = StObject.set(x, "WorkspacesConnectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesConnectionStatusUndefined: Self = StObject.set(x, "WorkspacesConnectionStatus", js.undefined)
    
    @scala.inline
    def setWorkspacesConnectionStatusVarargs(value: WorkspaceConnectionStatus*): Self = StObject.set(x, "WorkspacesConnectionStatus", js.Array(value :_*))
  }
}
