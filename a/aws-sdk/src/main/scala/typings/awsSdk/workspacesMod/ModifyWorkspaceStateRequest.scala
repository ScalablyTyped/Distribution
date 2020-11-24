package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class ModifyWorkspaceStateRequestOps[Self <: ModifyWorkspaceStateRequest] (val x: Self) extends AnyVal {
    
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
    def setWorkspaceState(value: TargetWorkspaceState): Self = this.set("WorkspaceState", value.asInstanceOf[js.Any])
  }
}
