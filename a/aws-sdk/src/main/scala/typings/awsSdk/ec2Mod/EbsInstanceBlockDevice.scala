package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsInstanceBlockDevice extends js.Object {
  /**
    * The time stamp when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.native
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object EbsInstanceBlockDevice {
  @scala.inline
  def apply(): EbsInstanceBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDevice]
  }
  @scala.inline
  implicit class EbsInstanceBlockDeviceOps[Self <: EbsInstanceBlockDevice] (val x: Self) extends AnyVal {
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
    def setAttachTime(value: DateTime): Self = this.set("AttachTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachTime: Self = this.set("AttachTime", js.undefined)
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("DeleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("DeleteOnTermination", js.undefined)
    @scala.inline
    def setStatus(value: AttachmentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
  }
  
}

