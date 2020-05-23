package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsInstanceBlockDeviceSpecification extends js.Object {
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.ec2Mod.VolumeId] = js.native
}

object EbsInstanceBlockDeviceSpecification {
  @scala.inline
  def apply(DeleteOnTermination: js.UndefOr[Boolean] = js.undefined, VolumeId: VolumeId = null): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.get.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
}

