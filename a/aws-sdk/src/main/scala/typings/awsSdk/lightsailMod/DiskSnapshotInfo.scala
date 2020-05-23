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
  def apply(sizeInGb: js.UndefOr[integer] = js.undefined): DiskSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sizeInGb)) __obj.updateDynamic("sizeInGb")(sizeInGb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskSnapshotInfo]
  }
}

