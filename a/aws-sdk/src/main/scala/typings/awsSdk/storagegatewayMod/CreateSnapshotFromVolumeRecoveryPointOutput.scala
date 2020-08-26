package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.storagegatewayMod.SnapshotId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * The time the volume was created from the recovery point.
    */
  var VolumeRecoveryPointTime: js.UndefOr[String] = js.native
}

object CreateSnapshotFromVolumeRecoveryPointOutput {
  @scala.inline
  def apply(): CreateSnapshotFromVolumeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
  }
  @scala.inline
  implicit class CreateSnapshotFromVolumeRecoveryPointOutputOps[Self <: CreateSnapshotFromVolumeRecoveryPointOutput] (val x: Self) extends AnyVal {
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
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = this.set("VolumeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeARN: Self = this.set("VolumeARN", js.undefined)
    @scala.inline
    def setVolumeRecoveryPointTime(value: String): Self = this.set("VolumeRecoveryPointTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeRecoveryPointTime: Self = this.set("VolumeRecoveryPointTime", js.undefined)
  }
  
}

