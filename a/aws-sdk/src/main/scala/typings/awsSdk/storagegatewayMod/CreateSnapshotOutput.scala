package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotOutput extends js.Object {
  /**
    * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon Elastic Compute Cloud API DescribeSnapshots) or creating a volume from a snapshot (CreateStorediSCSIVolume).
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.storagegatewayMod.SnapshotId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object CreateSnapshotOutput {
  @scala.inline
  def apply(): CreateSnapshotOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotOutput]
  }
  @scala.inline
  implicit class CreateSnapshotOutputOps[Self <: CreateSnapshotOutput] (val x: Self) extends AnyVal {
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
  }
  
}

