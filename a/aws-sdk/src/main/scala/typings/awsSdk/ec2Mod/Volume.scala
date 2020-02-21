package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  /**
    * Information about the volume attachments.
    */
  var Attachments: js.UndefOr[VolumeAttachmentList] = js.native
  /**
    * The Availability Zone for the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The time stamp when volume creation was initiated.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether the volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the volume was created using fast snapshot restore.
    */
  var FastRestored: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. Constraints: Range is 100-16,000 IOPS for gp2 volumes and 100 to 64,000IOPS for io1 volumes, in most Regions. The maximum IOPS for io1 of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume encryption key for the volume.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Indicates whether Amazon EBS Multi-Attach is enabled.
    */
  var MultiAttachEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The size of the volume, in GiBs.
    */
  var Size: js.UndefOr[Integer] = js.native
  /**
    * The snapshot from which the volume was created, if applicable.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * The volume state.
    */
  var State: js.UndefOr[VolumeState] = js.native
  /**
    * Any tags assigned to the volume.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
  /**
    * The volume type. This can be gp2 for General Purpose SSD, io1 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.native
}

object Volume {
  @scala.inline
  def apply(
    Attachments: VolumeAttachmentList = null,
    AvailabilityZone: String = null,
    CreateTime: DateTime = null,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    FastRestored: js.UndefOr[scala.Boolean] = js.undefined,
    Iops: Int | scala.Double = null,
    KmsKeyId: String = null,
    MultiAttachEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    OutpostArn: String = null,
    Size: Int | scala.Double = null,
    SnapshotId: String = null,
    State: VolumeState = null,
    Tags: TagList = null,
    VolumeId: String = null,
    VolumeType: VolumeType = null
  ): Volume = {
    val __obj = js.Dynamic.literal()
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (!js.isUndefined(FastRestored)) __obj.updateDynamic("FastRestored")(FastRestored.asInstanceOf[js.Any])
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAttachEnabled)) __obj.updateDynamic("MultiAttachEnabled")(MultiAttachEnabled.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

