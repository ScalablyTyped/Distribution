package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be started.
    */
  var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined
}
object StartWorkspacesResult {
  
  @scala.inline
  def apply(): StartWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartWorkspacesResult]
  }
  
  @scala.inline
  implicit class StartWorkspacesResultMutableBuilder[Self <: StartWorkspacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedRequests(value: FailedStartWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    @scala.inline
    def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value :_*))
  }
}
