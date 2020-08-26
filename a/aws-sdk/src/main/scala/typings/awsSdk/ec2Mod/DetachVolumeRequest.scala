package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachVolumeRequest extends js.Object {
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file system check and repair procedures.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance. If you are detaching a Multi-Attach enabled volume, you must specify an instance ID.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}

object DetachVolumeRequest {
  @scala.inline
  def apply(VolumeId: VolumeId): DetachVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVolumeRequest]
  }
  @scala.inline
  implicit class DetachVolumeRequestOps[Self <: DetachVolumeRequest] (val x: Self) extends AnyVal {
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
    def setVolumeId(value: VolumeId): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: String): Self = this.set("Device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("Device", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("Force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("Force", js.undefined)
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
  
}

