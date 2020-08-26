package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotFromVolumeRecoveryPointInput extends js.Object {
  /**
    * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the AWS Storage Gateway snapshot Details pane, Description field.
    */
  var SnapshotDescription: typings.awsSdk.storagegatewayMod.SnapshotDescription = js.native
  /**
    * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN = js.native
}

object CreateSnapshotFromVolumeRecoveryPointInput {
  @scala.inline
  def apply(SnapshotDescription: SnapshotDescription, VolumeARN: VolumeARN): CreateSnapshotFromVolumeRecoveryPointInput = {
    val __obj = js.Dynamic.literal(SnapshotDescription = SnapshotDescription.asInstanceOf[js.Any], VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointInput]
  }
  @scala.inline
  implicit class CreateSnapshotFromVolumeRecoveryPointInputOps[Self <: CreateSnapshotFromVolumeRecoveryPointInput] (val x: Self) extends AnyVal {
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
    def setSnapshotDescription(value: SnapshotDescription): Self = this.set("SnapshotDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = this.set("VolumeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

