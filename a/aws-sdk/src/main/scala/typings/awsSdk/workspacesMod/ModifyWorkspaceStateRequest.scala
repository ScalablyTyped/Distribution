package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyWorkspaceStateRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.workspacesMod.WorkspaceId = js.native
  /**
    * The WorkSpace state.
    */
  var WorkspaceState: TargetWorkspaceState = js.native
}

object ModifyWorkspaceStateRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, WorkspaceState: TargetWorkspaceState): ModifyWorkspaceStateRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any], WorkspaceState = WorkspaceState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyWorkspaceStateRequest]
  }
}

