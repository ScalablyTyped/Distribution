package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSnapshotResponse extends js.Object {
  
  /**
    * The size of the blocks in the snapshot, in bytes.
    */
  var BlockSize: js.UndefOr[typings.awsSdk.ebsMod.BlockSize] = js.native
  
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[typings.awsSdk.ebsMod.Description] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the snapshot.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.ebsMod.KmsKeyArn] = js.native
  
  /**
    * The AWS account ID of the snapshot owner.
    */
  var OwnerId: js.UndefOr[typings.awsSdk.ebsMod.OwnerId] = js.native
  
  /**
    * The ID of the parent snapshot.
    */
  var ParentSnapshotId: js.UndefOr[SnapshotId] = js.native
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ebsMod.SnapshotId] = js.native
  
  /**
    * The timestamp when the snapshot was created.
    */
  var StartTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The status of the snapshot.
    */
  var Status: js.UndefOr[typings.awsSdk.ebsMod.Status] = js.native
  
  /**
    * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see  Tagging your Amazon EC2 resources in the Amazon Elastic Compute Cloud User Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.ebsMod.Tags] = js.native
  
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[typings.awsSdk.ebsMod.VolumeSize] = js.native
}
object StartSnapshotResponse {
  
  @scala.inline
  def apply(): StartSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSnapshotResponse]
  }
  
  @scala.inline
  implicit class StartSnapshotResponseOps[Self <: StartSnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setBlockSize(value: BlockSize): Self = this.set("BlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockSize: Self = this.set("BlockSize", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: OwnerId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setParentSnapshotId(value: SnapshotId): Self = this.set("ParentSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSnapshotId: Self = this.set("ParentSnapshotId", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: VolumeSize): Self = this.set("VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSize: Self = this.set("VolumeSize", js.undefined)
  }
}
