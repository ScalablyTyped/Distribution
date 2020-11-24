package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more information, see Amazon EBS volume types in the Amazon Elastic Compute Cloud User Guide. Constraints: Range is 100-16,000 IOPS for gp2 volumes and 100 to 64,000 IOPS for io1 and io2 volumes, in most Regions. The maximum IOPS for io1 and io2 of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. Condition: This parameter is required for requests to create io1 and io2 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes.
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
    * The volume type. This can be gp2 for General Purpose SSD, io1 or io2 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.native
}
object Volume {
  
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: VolumeAttachment*): Self = this.set("Attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: VolumeAttachmentList): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("Attachments", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    
    @scala.inline
    def setFastRestored(value: Boolean): Self = this.set("FastRestored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastRestored: Self = this.set("FastRestored", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
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
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    
    @scala.inline
    def setState(value: VolumeState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
}
