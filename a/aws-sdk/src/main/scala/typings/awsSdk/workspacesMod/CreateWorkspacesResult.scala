package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be created.
    */
  var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.native
  
  /**
    * Information about the WorkSpaces that were created. Because this operation is asynchronous, the identifier returned is not immediately available for use with other operations. For example, if you call DescribeWorkspaces before the WorkSpace is created, the information returned can be incomplete.
    */
  var PendingRequests: js.UndefOr[WorkspaceList] = js.native
}
object CreateWorkspacesResult {
  
  @scala.inline
  def apply(): CreateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspacesResult]
  }
  
  @scala.inline
  implicit class CreateWorkspacesResultMutableBuilder[Self <: CreateWorkspacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedRequests(value: FailedCreateWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    @scala.inline
    def setFailedRequestsVarargs(value: FailedCreateWorkspaceRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value :_*))
    
    @scala.inline
    def setPendingRequests(value: WorkspaceList): Self = StObject.set(x, "PendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingRequestsUndefined: Self = StObject.set(x, "PendingRequests", js.undefined)
    
    @scala.inline
    def setPendingRequestsVarargs(value: Workspace*): Self = StObject.set(x, "PendingRequests", js.Array(value :_*))
  }
}
