package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootWorkspacesRequest extends js.Object {
  
  /**
    * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
    */
  var RebootWorkspaceRequests: typings.awsSdk.workspacesMod.RebootWorkspaceRequests = js.native
}
object RebootWorkspacesRequest {
  
  @scala.inline
  def apply(RebootWorkspaceRequests: RebootWorkspaceRequests): RebootWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebootWorkspaceRequests = RebootWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootWorkspacesRequest]
  }
  
  @scala.inline
  implicit class RebootWorkspacesRequestOps[Self <: RebootWorkspacesRequest] (val x: Self) extends AnyVal {
    
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
    def setRebootWorkspaceRequestsVarargs(value: RebootRequest*): Self = this.set("RebootWorkspaceRequests", js.Array(value :_*))
    
    @scala.inline
    def setRebootWorkspaceRequests(value: RebootWorkspaceRequests): Self = this.set("RebootWorkspaceRequests", value.asInstanceOf[js.Any])
  }
}
