package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * Information about the volume attachments.
    */
  var Attachments: js.UndefOr[VolumeAttachmentList] = js.undefined
  
  /**
    * The Availability Zone for the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The time stamp when volume creation was initiated.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Indicates whether the volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the volume was created using fast snapshot restore.
    */
  var FastRestored: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more information, see Amazon EBS volume types in the Amazon Elastic Compute Cloud User Guide. Constraints: Range is 100-16,000 IOPS for gp2 volumes and 100 to 64,000 IOPS for io1 and io2 volumes, in most Regions. The maximum IOPS for io1 and io2 of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. Condition: This parameter is required for requests to create io1 and io2 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume encryption key for the volume.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether Amazon EBS Multi-Attach is enabled.
    */
  var MultiAttachEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the volume, in GiBs.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The snapshot from which the volume was created, if applicable.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume state.
    */
  var State: js.UndefOr[VolumeState] = js.undefined
  
  /**
    * Any tags assigned to the volume.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume type. This can be gp2 for General Purpose SSD, io1 or io2 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.undefined
}
object Volume {
  
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeMutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: VolumeAttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: VolumeAttachment*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setFastRestored(value: Boolean): Self = StObject.set(x, "FastRestored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastRestoredUndefined: Self = StObject.set(x, "FastRestored", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMultiAttachEnabled(value: Boolean): Self = StObject.set(x, "MultiAttachEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAttachEnabledUndefined: Self = StObject.set(x, "MultiAttachEnabled", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setState(value: VolumeState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
