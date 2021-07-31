package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
    */
  var TerminateWorkspaceRequests: typings.awsSdk.workspacesMod.TerminateWorkspaceRequests
}
object TerminateWorkspacesRequest {
  
  @scala.inline
  def apply(TerminateWorkspaceRequests: TerminateWorkspaceRequests): TerminateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(TerminateWorkspaceRequests = TerminateWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateWorkspacesRequest]
  }
  
  @scala.inline
  implicit class TerminateWorkspacesRequestMutableBuilder[Self <: TerminateWorkspacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerminateWorkspaceRequests(value: TerminateWorkspaceRequests): Self = StObject.set(x, "TerminateWorkspaceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateWorkspaceRequestsVarargs(value: TerminateRequest*): Self = StObject.set(x, "TerminateWorkspaceRequests", js.Array(value :_*))
  }
}
