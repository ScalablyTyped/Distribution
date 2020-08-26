package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsVolume extends js.Object {
  /**
    * The device name that is exposed to the instance, such as /dev/sdh.
    */
  var Device: js.UndefOr[String] = js.native
  /**
    * The volume identifier of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object EbsVolume {
  @scala.inline
  def apply(): EbsVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsVolume]
  }
  @scala.inline
  implicit class EbsVolumeOps[Self <: EbsVolume] (val x: Self) extends AnyVal {
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
    def setDevice(value: String): Self = this.set("Device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("Device", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
  }
  
}

