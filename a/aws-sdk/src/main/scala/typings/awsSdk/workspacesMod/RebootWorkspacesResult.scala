package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootWorkspacesResult extends StObject {
  
  /**
    * Information about the WorkSpaces that could not be rebooted.
    */
  var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.undefined
}
object RebootWorkspacesResult {
  
  @scala.inline
  def apply(): RebootWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootWorkspacesResult]
  }
  
  @scala.inline
  implicit class RebootWorkspacesResultMutableBuilder[Self <: RebootWorkspacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedRequests(value: FailedRebootWorkspaceRequests): Self = StObject.set(x, "FailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRequestsUndefined: Self = StObject.set(x, "FailedRequests", js.undefined)
    
    @scala.inline
    def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = StObject.set(x, "FailedRequests", js.Array(value :_*))
  }
}
