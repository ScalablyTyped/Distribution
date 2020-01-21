package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVolumePermission extends js.Object {
  /**
    * The group to be added or removed. The possible value is all.
    */
  var Group: js.UndefOr[PermissionGroup] = js.native
  /**
    * The AWS account ID to be added or removed.
    */
  var UserId: js.UndefOr[String] = js.native
}

object CreateVolumePermission {
  @scala.inline
  def apply(Group: PermissionGroup = null, UserId: String = null): CreateVolumePermission = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVolumePermission]
  }
}

