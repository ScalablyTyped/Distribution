package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyWorkspaceCreationPropertiesRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  
  /**
    * The default properties for creating WorkSpaces.
    */
  var WorkspaceCreationProperties: typings.awsSdk.workspacesMod.WorkspaceCreationProperties = js.native
}
object ModifyWorkspaceCreationPropertiesRequest {
  
  @scala.inline
  def apply(ResourceId: DirectoryId, WorkspaceCreationProperties: WorkspaceCreationProperties): ModifyWorkspaceCreationPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceCreationProperties = WorkspaceCreationProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceCreationPropertiesRequest]
  }
  
  @scala.inline
  implicit class ModifyWorkspaceCreationPropertiesRequestMutableBuilder[Self <: ModifyWorkspaceCreationPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceCreationProperties(value: WorkspaceCreationProperties): Self = StObject.set(x, "WorkspaceCreationProperties", value.asInstanceOf[js.Any])
  }
}
