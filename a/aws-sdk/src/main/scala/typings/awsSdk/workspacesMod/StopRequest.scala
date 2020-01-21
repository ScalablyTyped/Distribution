package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceId] = js.native
}

object StopRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId = null): StopRequest = {
    val __obj = js.Dynamic.literal()
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequest]
  }
}

