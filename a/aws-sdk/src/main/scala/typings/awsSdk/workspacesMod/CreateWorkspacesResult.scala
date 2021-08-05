package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be created.
    */
  var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.undefined
  
  /**
    * Information about the WorkSpaces that were created. Because this operation is asynchronous, the identifier returned is not immediately available for use with other operations. For example, if you call DescribeWorkspaces before the WorkSpace is created, the information returned can be incomplete.
    */
  var PendingRequests: js.UndefOr[WorkspaceList] = js.undefined
}
object CreateWorkspacesResult {
  
  inline def apply(): CreateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspacesResult]
  }
  
  extension [Self <: CreateWorkspacesResult](x: Self) {
    
    inline def setFailedRequests(value: FailedCreateWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedCreateWorkspaceRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value :_*))
    
    inline def setPendingRequests(value: WorkspaceList): Self = StObject.set(x, "PendingRequests", value.asInstanceOf[js.Any])
    
    inline def setPendingRequestsUndefined: Self = StObject.set(x, "PendingRequests", js.undefined)
    
    inline def setPendingRequestsVarargs(value: Workspace*): Self = StObject.set(x, "PendingRequests", js.Array(value :_*))
  }
}
