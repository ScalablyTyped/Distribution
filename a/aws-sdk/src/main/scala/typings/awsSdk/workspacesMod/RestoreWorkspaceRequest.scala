package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreWorkspaceRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.workspacesMod.WorkspaceId = js.native
}

object RestoreWorkspaceRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): RestoreWorkspaceRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreWorkspaceRequest]
  }
  @scala.inline
  implicit class RestoreWorkspaceRequestOps[Self <: RestoreWorkspaceRequest] (val x: Self) extends AnyVal {
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
    def setWorkspaceId(value: WorkspaceId): Self = this.set("WorkspaceId", value.asInstanceOf[js.Any])
  }
  
}

