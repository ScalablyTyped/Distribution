package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopWorkspacesRequest extends StObject {
  
  /**
    * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
    */
  var StopWorkspaceRequests: typings.awsSdk.workspacesMod.StopWorkspaceRequests = js.native
}
object StopWorkspacesRequest {
  
  @scala.inline
  def apply(StopWorkspaceRequests: StopWorkspaceRequests): StopWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StopWorkspaceRequests = StopWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkspacesRequest]
  }
  
  @scala.inline
  implicit class StopWorkspacesRequestMutableBuilder[Self <: StopWorkspacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStopWorkspaceRequests(value: StopWorkspaceRequests): Self = StObject.set(x, "StopWorkspaceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopWorkspaceRequestsVarargs(value: StopRequest*): Self = StObject.set(x, "StopWorkspaceRequests", js.Array(value :_*))
  }
}
