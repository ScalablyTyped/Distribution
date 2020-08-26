package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceId] = js.native
}

object StartRequest {
  @scala.inline
  def apply(): StartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRequest]
  }
  @scala.inline
  implicit class StartRequestOps[Self <: StartRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteWorkspaceId: Self = this.set("WorkspaceId", js.undefined)
  }
  
}

