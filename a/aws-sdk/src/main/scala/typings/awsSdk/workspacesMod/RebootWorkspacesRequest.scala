package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
    */
  var RebootWorkspaceRequests: typings.awsSdk.workspacesMod.RebootWorkspaceRequests
}
object RebootWorkspacesRequest {
  
  @scala.inline
  def apply(RebootWorkspaceRequests: RebootWorkspaceRequests): RebootWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebootWorkspaceRequests = RebootWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootWorkspacesRequest]
  }
  
  @scala.inline
  implicit class RebootWorkspacesRequestMutableBuilder[Self <: RebootWorkspacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRebootWorkspaceRequests(value: RebootWorkspaceRequests): Self = StObject.set(x, "RebootWorkspaceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootWorkspaceRequestsVarargs(value: RebootRequest*): Self = StObject.set(x, "RebootWorkspaceRequests", js.Array(value :_*))
  }
}
