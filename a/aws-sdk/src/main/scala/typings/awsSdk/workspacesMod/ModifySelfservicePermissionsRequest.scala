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
}

