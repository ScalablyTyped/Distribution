package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachVolumeRequest extends js.Object {
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var Device: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The ID of the EBS volume. The volume and instance must be within the same Availability Zone.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}

object AttachVolumeRequest {
  @scala.inline
  def apply(Device: String, InstanceId: InstanceId, VolumeId: VolumeId): AttachVolumeRequest = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachVolumeRequest]
  }
  @scala.inline
  implicit class AttachVolumeRequestOps[Self <: AttachVolumeRequest] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeId(value: VolumeId): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

