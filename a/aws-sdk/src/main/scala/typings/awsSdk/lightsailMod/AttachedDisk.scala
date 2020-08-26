package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedDisk extends js.Object {
  /**
    * The path of the disk (e.g., /dev/xvdf).
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
}

object AttachedDisk {
  @scala.inline
  def apply(): AttachedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedDisk]
  }
  @scala.inline
  implicit class AttachedDiskOps[Self <: AttachedDisk] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSizeInGb(value: integer): Self = this.set("sizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInGb: Self = this.set("sizeInGb", js.undefined)
  }
  
}

