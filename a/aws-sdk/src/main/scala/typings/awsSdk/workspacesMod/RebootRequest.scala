package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.workspacesMod.WorkspaceId = js.native
}

object RebootRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): RebootRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootRequest]
  }
  @scala.inline
  implicit class RebootRequestOps[Self <: RebootRequest] (val x: Self) extends AnyVal {
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

