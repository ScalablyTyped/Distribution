package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartWorkspacesRequest extends js.Object {
  
  /**
    * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
    */
  var StartWorkspaceRequests: typings.awsSdk.workspacesMod.StartWorkspaceRequests = js.native
}
object StartWorkspacesRequest {
  
  @scala.inline
  def apply(StartWorkspaceRequests: StartWorkspaceRequests): StartWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StartWorkspaceRequests = StartWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWorkspacesRequest]
  }
  
  @scala.inline
  implicit class StartWorkspacesRequestOps[Self <: StartWorkspacesRequest] (val x: Self) extends AnyVal {
    
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
    def setStartWorkspaceRequestsVarargs(value: StartRequest*): Self = this.set("StartWorkspaceRequests", js.Array(value :_*))
    
    @scala.inline
    def setStartWorkspaceRequests(value: StartWorkspaceRequests): Self = this.set("StartWorkspaceRequests", value.asInstanceOf[js.Any])
  }
}
