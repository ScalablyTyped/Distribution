package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySelfservicePermissionsRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  var SelfservicePermissions: typings.awsSdk.workspacesMod.SelfservicePermissions = js.native
}

object ModifySelfservicePermissionsRequest {
  @scala.inline
  def apply(ResourceId: DirectoryId, SelfservicePermissions: SelfservicePermissions): ModifySelfservicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], SelfservicePermissions = SelfservicePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySelfservicePermissionsRequest]
  }
  @scala.inline
  implicit class ModifySelfservicePermissionsRequestOps[Self <: ModifySelfservicePermissionsRequest] (val x: Self) extends AnyVal {
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
    def setSelfservicePermissions(value: SelfservicePermissions): Self = this.set("SelfservicePermissions", value.asInstanceOf[js.Any])
  }
  
}

