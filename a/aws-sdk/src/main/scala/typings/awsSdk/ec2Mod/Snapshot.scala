package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends js.Object {
  
  /**
    * The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to the data encryption key that was used to encrypt the original volume or snapshot copy. Because data encryption keys are inherited by volumes created from snapshots, and vice versa, if snapshots share the same data encryption key identifier, then they belong to the same volume/snapshot lineage. This parameter is only returned by DescribeSnapshots.
    */
  var DataEncryptionKeyId: js.UndefOr[String] = js.native
  
  /**
    * The description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume encryption key for the parent volume.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The AWS owner alias, from an Amazon-maintained list (amazon). This is not the user-configured AWS account alias set using the IAM console.
    */
  var OwnerAlias: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The progress of the snapshot, as a percentage.
    */
  var Progress: js.UndefOr[String] = js.native
  
  /**
    * The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  
  /**
    * The time stamp when the snapshot was initiated.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The snapshot state.
    */
  var State: js.UndefOr[SnapshotState] = js.native
  
  /**
    * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example, if the proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error state details to help you diagnose why the error occurred. This parameter is only returned by DescribeSnapshots.
    */
  var StateMessage: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the volume that was used to create the snapshot. Snapshots created by the CopySnapshot action have an arbitrary volume ID that should not be used for any purpose.
    */
  var VolumeId: js.UndefOr[String] = js.native
  
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    
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
    def setDataEncryptionKeyId(value: String): Self = this.set("DataEncryptionKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataEncryptionKeyId: Self = this.set("DataEncryptionKeyId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: String): Self = this.set("OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAlias: Self = this.set("OwnerAlias", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = this.set("Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setState(value: SnapshotState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateMessage(value: String): Self = this.set("StateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateMessage: Self = this.set("StateMessage", js.undefined)
    
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
    def setVolumeSize(value: Integer): Self = this.set("VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSize: Self = this.set("VolumeSize", js.undefined)
  }
}
