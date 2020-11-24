package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyWorkspaceCreationPropertiesRequest extends js.Object {
  
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
  implicit class ModifyWorkspaceCreationPropertiesRequestOps[Self <: ModifyWorkspaceCreationPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: DirectoryId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceCreationProperties(value: WorkspaceCreationProperties): Self = this.set("WorkspaceCreationProperties", value.asInstanceOf[js.Any])
  }
}
