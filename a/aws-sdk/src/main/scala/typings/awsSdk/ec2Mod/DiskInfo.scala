package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskInfo extends js.Object {
  /**
    * The number of disks with this configuration.
    */
  var Count: js.UndefOr[DiskCount] = js.native
  /**
    * The size of the disk in GB.
    */
  var SizeInGB: js.UndefOr[DiskSize] = js.native
  /**
    * The type of disk.
    */
  var Type: js.UndefOr[DiskType] = js.native
}

object DiskInfo {
  @scala.inline
  def apply(): DiskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskInfo]
  }
  @scala.inline
  implicit class DiskInfoOps[Self <: DiskInfo] (val x: Self) extends AnyVal {
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
    def setCount(value: DiskCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setSizeInGB(value: DiskSize): Self = this.set("SizeInGB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInGB: Self = this.set("SizeInGB", js.undefined)
    @scala.inline
    def setType(value: DiskType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

