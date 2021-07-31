package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyWorkspaceStateRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.workspacesMod.WorkspaceId
  
  /**
    * The WorkSpace state.
    */
  var WorkspaceState: TargetWorkspaceState
}
object ModifyWorkspaceStateRequest {
  
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, WorkspaceState: TargetWorkspaceState): ModifyWorkspaceStateRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any], WorkspaceState = WorkspaceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceStateRequest]
  }
  
  @scala.inline
  implicit class ModifyWorkspaceStateRequestMutableBuilder[Self <: ModifyWorkspaceStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceState(value: TargetWorkspaceState): Self = StObject.set(x, "WorkspaceState", value.asInstanceOf[js.Any])
  }
}
