package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVolumeRequest extends js.Object {
  /**
    * The new mount point.
    */
  var MountPoint: js.UndefOr[String] = js.native
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The volume ID.
    */
  var VolumeId: String = js.native
}

object UpdateVolumeRequest {
  @scala.inline
  def apply(VolumeId: String, MountPoint: String = null, Name: String = null): UpdateVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    if (MountPoint != null) __obj.updateDynamic("MountPoint")(MountPoint.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVolumeRequest]
  }
}

