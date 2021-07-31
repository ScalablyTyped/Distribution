package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be stopped.
    */
  var FailedRequests: js.UndefOr[FailedStopWorkspaceRequests] = js.undefined
}
object StopWorkspacesResult {
  
  @scala.inline
  def apply(): StopWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopWorkspacesResult]
  }
  
  @scala.inline
  implicit class StopWorkspacesResultMutableBuilder[Self <: StopWorkspacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedRequests(value: FailedStopWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    @scala.inline
    def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value :_*))
  }
}
