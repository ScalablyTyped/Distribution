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
  def apply(SnapshotId: SnapshotId = null, VolumeARN: VolumeARN = null, VolumeRecoveryPointTime: String = null): CreateSnapshotFromVolumeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    if (VolumeRecoveryPointTime != null) __obj.updateDynamic("VolumeRecoveryPointTime")(VolumeRecoveryPointTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
  }
}

