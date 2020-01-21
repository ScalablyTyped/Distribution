package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVolumePermissionModifications extends js.Object {
  /**
    * Adds the specified AWS account ID or group to the list.
    */
  var Add: js.UndefOr[CreateVolumePermissionList] = js.native
  /**
    * Removes the specified AWS account ID or group from the list.
    */
  var Remove: js.UndefOr[CreateVolumePermissionList] = js.native
}

object CreateVolumePermissionModifications {
  @scala.inline
  def apply(Add: CreateVolumePermissionList = null, Remove: CreateVolumePermissionList = null): CreateVolumePermissionModifications = {
    val __obj = js.Dynamic.literal()
    if (Add != null) __obj.updateDynamic("Add")(Add.asInstanceOf[js.Any])
    if (Remove != null) __obj.updateDynamic("Remove")(Remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVolumePermissionModifications]
  }
}

