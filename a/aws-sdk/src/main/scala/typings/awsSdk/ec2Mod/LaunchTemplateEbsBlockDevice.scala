package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateEbsBlockDevice extends js.Object {
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the EBS volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. 
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.ec2Mod.KmsKeyId] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotId] = js.native
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
  /**
    * The volume type.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.native
}

object LaunchTemplateEbsBlockDevice {
  @scala.inline
  def apply(
    DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Iops: js.UndefOr[Integer] = js.undefined,
    KmsKeyId: KmsKeyId = null,
    SnapshotId: SnapshotId = null,
    VolumeSize: js.UndefOr[Integer] = js.undefined,
    VolumeType: VolumeType = null
  ): LaunchTemplateEbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops.get.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize.get.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateEbsBlockDevice]
  }
}

