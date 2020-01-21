package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskSnapshotInfo extends js.Object {
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.native
}

object DiskSnapshotInfo {
  @scala.inline
  def apply(sizeInGb: Int | Double = null): DiskSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskSnapshotInfo]
  }
}

