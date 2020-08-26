package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskInfo extends js.Object {
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.native
  /**
    * The disk name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The disk path.
    */
  var path: js.UndefOr[NonEmptyString] = js.native
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsSystemDisk(value: Boolean): Self = this.set("isSystemDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSystemDisk: Self = this.set("isSystemDisk", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSizeInGb(value: integer): Self = this.set("sizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInGb: Self = this.set("sizeInGb", js.undefined)
  }
  
}

