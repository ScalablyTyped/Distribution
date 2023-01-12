package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyWorkspaceStateRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.clientsWorkspacesMod.WorkspaceId
  
  /**
    * The WorkSpace state.
    */
  var WorkspaceState: TargetWorkspaceState
}
object ModifyWorkspaceStateRequest {
  
  inline def apply(WorkspaceId: WorkspaceId, WorkspaceState: TargetWorkspaceState): ModifyWorkspaceStateRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any], WorkspaceState = WorkspaceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyWorkspaceStateRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceState(value: TargetWorkspaceState): Self = StObject.set(x, "WorkspaceState", value.asInstanceOf[js.Any])
  }
}
