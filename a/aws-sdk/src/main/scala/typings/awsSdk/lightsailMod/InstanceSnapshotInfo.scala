package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSnapshotInfo extends js.Object {
  /**
    * The blueprint ID from which the source instance (e.g., os_debian_8_3).
    */
  var fromBlueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The bundle ID from which the source instance was created (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * A list of objects describing the disks that were attached to the source instance.
    */
  var fromDiskInfo: js.UndefOr[DiskInfoList] = js.native
}

object InstanceSnapshotInfo {
  @scala.inline
  def apply(): InstanceSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSnapshotInfo]
  }
  @scala.inline
  implicit class InstanceSnapshotInfoOps[Self <: InstanceSnapshotInfo] (val x: Self) extends AnyVal {
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
    def setFromBlueprintId(value: NonEmptyString): Self = this.set("fromBlueprintId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromBlueprintId: Self = this.set("fromBlueprintId", js.undefined)
    @scala.inline
    def setFromBundleId(value: NonEmptyString): Self = this.set("fromBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromBundleId: Self = this.set("fromBundleId", js.undefined)
    @scala.inline
    def setFromDiskInfoVarargs(value: DiskInfo*): Self = this.set("fromDiskInfo", js.Array(value :_*))
    @scala.inline
    def setFromDiskInfo(value: DiskInfoList): Self = this.set("fromDiskInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDiskInfo: Self = this.set("fromDiskInfo", js.undefined)
  }
  
}

