package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusAttachmentStatus extends js.Object {
  /**
    * The ID of the attached instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The maximum IOPS supported by the attached instance.
    */
  var IoPerformance: js.UndefOr[String] = js.native
}

object VolumeStatusAttachmentStatus {
  @scala.inline
  def apply(): VolumeStatusAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusAttachmentStatus]
  }
  @scala.inline
  implicit class VolumeStatusAttachmentStatusOps[Self <: VolumeStatusAttachmentStatus] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setIoPerformance(value: String): Self = this.set("IoPerformance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIoPerformance: Self = this.set("IoPerformance", js.undefined)
  }
  
}

