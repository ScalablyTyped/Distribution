package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyWorkspaceAccessPropertiesRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  
  /**
    * The device types and operating systems to enable or disable for access.
    */
  var WorkspaceAccessProperties: typings.awsSdk.workspacesMod.WorkspaceAccessProperties = js.native
}
object ModifyWorkspaceAccessPropertiesRequest {
  
  @scala.inline
  def apply(ResourceId: DirectoryId, WorkspaceAccessProperties: WorkspaceAccessProperties): ModifyWorkspaceAccessPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceAccessProperties = WorkspaceAccessProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceAccessPropertiesRequest]
  }
  
  @scala.inline
  implicit class ModifyWorkspaceAccessPropertiesRequestMutableBuilder[Self <: ModifyWorkspaceAccessPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceAccessProperties(value: WorkspaceAccessProperties): Self = StObject.set(x, "WorkspaceAccessProperties", value.asInstanceOf[js.Any])
  }
}
