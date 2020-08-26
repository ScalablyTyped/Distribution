package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyWorkspaceAccessPropertiesRequest extends js.Object {
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
  implicit class ModifyWorkspaceAccessPropertiesRequestOps[Self <: ModifyWorkspaceAccessPropertiesRequest] (val x: Self) extends AnyVal {
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
    def setWorkspaceAccessProperties(value: WorkspaceAccessProperties): Self = this.set("WorkspaceAccessProperties", value.asInstanceOf[js.Any])
  }
  
}

