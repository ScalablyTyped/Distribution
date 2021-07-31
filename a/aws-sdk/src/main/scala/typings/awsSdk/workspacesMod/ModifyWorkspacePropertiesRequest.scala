package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyWorkspacePropertiesRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsSdk.workspacesMod.WorkspaceId
  
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: typings.awsSdk.workspacesMod.WorkspaceProperties
}
object ModifyWorkspacePropertiesRequest {
  
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, WorkspaceProperties: WorkspaceProperties): ModifyWorkspacePropertiesRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any], WorkspaceProperties = WorkspaceProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspacePropertiesRequest]
  }
  
  @scala.inline
  implicit class ModifyWorkspacePropertiesRequestMutableBuilder[Self <: ModifyWorkspacePropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceProperties(value: WorkspaceProperties): Self = StObject.set(x, "WorkspaceProperties", value.asInstanceOf[js.Any])
  }
}
