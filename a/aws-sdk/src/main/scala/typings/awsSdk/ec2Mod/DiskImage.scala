package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskImage extends js.Object {
  /**
    * A description of the disk image.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the disk image.
    */
  var Image: js.UndefOr[DiskImageDetail] = js.native
  /**
    * Information about the volume.
    */
  var Volume: js.UndefOr[VolumeDetail] = js.native
}

object DiskImage {
  @scala.inline
  def apply(): DiskImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImage]
  }
  @scala.inline
  implicit class DiskImageOps[Self <: DiskImage] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setImage(value: DiskImageDetail): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("Image", js.undefined)
    @scala.inline
    def setVolume(value: VolumeDetail): Self = this.set("Volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("Volume", js.undefined)
  }
  
}

