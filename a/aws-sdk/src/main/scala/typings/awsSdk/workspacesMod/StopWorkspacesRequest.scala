package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopWorkspacesRequest extends js.Object {
  
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
  implicit class StopWorkspacesRequestOps[Self <: StopWorkspacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStopWorkspaceRequestsVarargs(value: StopRequest*): Self = this.set("StopWorkspaceRequests", js.Array(value :_*))
    
    @scala.inline
    def setStopWorkspaceRequests(value: StopWorkspaceRequests): Self = this.set("StopWorkspaceRequests", value.asInstanceOf[js.Any])
  }
}
