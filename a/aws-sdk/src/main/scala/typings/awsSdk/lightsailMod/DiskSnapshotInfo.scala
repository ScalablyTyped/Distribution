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
  def apply(): DiskSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskSnapshotInfo]
  }
  @scala.inline
  implicit class DiskSnapshotInfoOps[Self <: DiskSnapshotInfo] (val x: Self) extends AnyVal {
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
    def setSizeInGb(value: integer): Self = this.set("sizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInGb: Self = this.set("sizeInGb", js.undefined)
  }
  
}

