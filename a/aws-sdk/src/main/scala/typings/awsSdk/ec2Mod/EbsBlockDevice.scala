package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsBlockDevice extends js.Object {
  /**
    * Indicates whether the EBS volume is deleted on instance termination. For more information, see Preserving Amazon EBS volumes on instance termination in the Amazon Elastic Compute Cloud User Guide.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the encryption state of an EBS volume is changed while being restored from a backing snapshot. The effect of setting the encryption state to true depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. In no case can you remove encryption from an encrypted volume. Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more information, see Supported instance types. This parameter is not returned by .
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more information, see Amazon EBS volume types in the Amazon Elastic Compute Cloud User Guide. Constraints: Range is 100-16,000 IOPS for gp2 volumes and 100 to 64,000IOPS for io1 volumes in most Regions. Maximum io1 IOPS of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is encrypted. This parameter is only supported on BlockDeviceMapping objects called by RunInstances, RequestSpotFleet, and RequestSpotInstances.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * The size of the volume, in GiB. Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size. Constraints: 1-16384 for General Purpose SSD (gp2), 4-16384 for Provisioned IOPS SSD (io1), 500-16384 for Throughput Optimized HDD (st1), 500-16384 for Cold HDD (sc1), and 1-1024 for Magnetic (standard) volumes. If you specify a snapshot, the volume size must be equal to or larger than the snapshot size.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
  /**
    * The volume type. If you set the type to io1, you must also specify the Iops parameter. If you set the type to gp2, st1, sc1, or standard, you must omit the Iops parameter. Default: gp2 
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.native
}

object EbsBlockDevice {
  @scala.inline
  def apply(): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsBlockDevice]
  }
  @scala.inline
  implicit class EbsBlockDeviceOps[Self <: EbsBlockDevice] (val x: Self) extends AnyVal {
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
    def setDeleteOnTermination(value: Boolean): Self = this.set("DeleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("DeleteOnTermination", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setVolumeSize(value: Integer): Self = this.set("VolumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSize: Self = this.set("VolumeSize", js.undefined)
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
  
}

