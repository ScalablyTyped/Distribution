package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
    */
  var Workspaces: WorkspaceRequestList = js.native
}

object CreateWorkspacesRequest {
  @scala.inline
  def apply(Workspaces: WorkspaceRequestList): CreateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(Workspaces = Workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspacesRequest]
  }
  @scala.inline
  implicit class CreateWorkspacesRequestOps[Self <: CreateWorkspacesRequest] (val x: Self) extends AnyVal {
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
    def setWorkspacesVarargs(value: WorkspaceRequest*): Self = this.set("Workspaces", js.Array(value :_*))
    @scala.inline
    def setWorkspaces(value: WorkspaceRequestList): Self = this.set("Workspaces", value.asInstanceOf[js.Any])
  }
  
}

