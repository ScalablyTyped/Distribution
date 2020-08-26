package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskImageVolumeDescription extends js.Object {
  /**
    * The volume identifier.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The size of the volume, in GiB.
    */
  var Size: js.UndefOr[Long] = js.native
}

object DiskImageVolumeDescription {
  @scala.inline
  def apply(): DiskImageVolumeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImageVolumeDescription]
  }
  @scala.inline
  implicit class DiskImageVolumeDescriptionOps[Self <: DiskImageVolumeDescription] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setSize(value: Long): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
  
}

