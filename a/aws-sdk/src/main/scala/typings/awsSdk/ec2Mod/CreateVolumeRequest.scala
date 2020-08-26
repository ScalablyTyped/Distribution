package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVolumeRequest extends js.Object {
  /**
    * The Availability Zone in which to create the volume.
    */
  var AvailabilityZone: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the volume should be encrypted. The effect of setting the encryption state to true depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more information, see Encryption by Default in the Amazon Elastic Compute Cloud User Guide. Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more information, see Supported Instance Types.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50 IOPS/GiB. Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If KmsKeyId is specified, the encrypted state must be true. You can specify the CMK using any of the following:   Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias. For example, alias/ExampleAlias.   Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.   Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the action can appear to complete, but eventually fails.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.ec2Mod.KmsKeyId] = js.native
  /**
    * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up to 16 Nitro-based instances in the same Availability Zone. For more information, see  Amazon EBS Multi-Attach in the Amazon Elastic Compute Cloud User Guide.
    */
  var MultiAttachEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. Constraints: 1-16,384 for gp2, 4-16,384 for io1, 500-16,384 for st1, 500-16,384 for sc1, and 1-1,024 for standard. If you specify a snapshot, the volume size must be equal to or larger than the snapshot size. Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size.
    */
  var Size: js.UndefOr[Integer] = js.native
  /**
    * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotId] = js.native
  /**
    * The tags to apply to the volume during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The volume type. This can be gp2 for General Purpose SSD, io1 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes. Default: gp2 
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.native
}

object CreateVolumeRequest {
  @scala.inline
  def apply(AvailabilityZone: String): CreateVolumeRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVolumeRequest]
  }
  @scala.inline
  implicit class CreateVolumeRequestOps[Self <: CreateVolumeRequest] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMultiAttachEnabled(value: Boolean): Self = this.set("MultiAttachEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAttachEnabled: Self = this.set("MultiAttachEnabled", js.undefined)
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setSize(value: Integer): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
  
}

