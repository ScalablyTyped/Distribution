package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStorageInfo extends js.Object {
  /**
    * Array describing the disks that are available for the instance type.
    */
  var Disks: js.UndefOr[DiskInfoList] = js.native
  /**
    * The total size of the disks, in GB.
    */
  var TotalSizeInGB: js.UndefOr[DiskSize] = js.native
}

object InstanceStorageInfo {
  @scala.inline
  def apply(): InstanceStorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStorageInfo]
  }
  @scala.inline
  implicit class InstanceStorageInfoOps[Self <: InstanceStorageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisksVarargs(value: DiskInfo*): Self = this.set("Disks", js.Array(value :_*))
    @scala.inline
    def setDisks(value: DiskInfoList): Self = this.set("Disks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisks: Self = this.set("Disks", js.undefined)
    @scala.inline
    def setTotalSizeInGB(value: DiskSize): Self = this.set("TotalSizeInGB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSizeInGB: Self = this.set("TotalSizeInGB", js.undefined)
  }
  
}

