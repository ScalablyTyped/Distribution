package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
    */
  var TerminateWorkspaceRequests: typings.awsSdk.workspacesMod.TerminateWorkspaceRequests = js.native
}

object TerminateWorkspacesRequest {
  @scala.inline
  def apply(TerminateWorkspaceRequests: TerminateWorkspaceRequests): TerminateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(TerminateWorkspaceRequests = TerminateWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateWorkspacesRequest]
  }
  @scala.inline
  implicit class TerminateWorkspacesRequestOps[Self <: TerminateWorkspacesRequest] (val x: Self) extends AnyVal {
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
    def setTerminateWorkspaceRequestsVarargs(value: TerminateRequest*): Self = this.set("TerminateWorkspaceRequests", js.Array(value :_*))
    @scala.inline
    def setTerminateWorkspaceRequests(value: TerminateWorkspaceRequests): Self = this.set("TerminateWorkspaceRequests", value.asInstanceOf[js.Any])
  }
  
}

