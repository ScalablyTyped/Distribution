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
  def apply(InstanceId: String = null, IoPerformance: String = null): VolumeStatusAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (IoPerformance != null) __obj.updateDynamic("IoPerformance")(IoPerformance.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeStatusAttachmentStatus]
  }
}

