package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemDescription extends js.Object {
  
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * The opaque string specified in the request.
    */
  var CreationToken: typings.awsSdk.efsMod.CreationToken = js.native
  
  /**
    * A Boolean value that, if true, indicates that the file system is encrypted.
    */
  var Encrypted: js.UndefOr[typings.awsSdk.efsMod.Encrypted] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the EFS file system, in the format arn:aws:elasticfilesystem:region:account-id:file-system/file-system-id . Example with sample data: arn:aws:elasticfilesystem:us-west-2:1111333322228888:file-system/fs-01234567 
    */
  var FileSystemArn: js.UndefOr[typings.awsSdk.efsMod.FileSystemArn] = js.native
  
  /**
    * The ID of the file system, assigned by Amazon EFS.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  
  /**
    * The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the encrypted file system.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.efsMod.KmsKeyId] = js.native
  
  /**
    * The lifecycle phase of the file system.
    */
  var LifeCycleState: typings.awsSdk.efsMod.LifeCycleState = js.native
  
  /**
    * You can add tags to a file system, including a Name tag. For more information, see CreateFileSystem. If the file system has a Name tag, Amazon EFS returns the value in this field. 
    */
  var Name: js.UndefOr[TagValue] = js.native
  
  /**
    * The current number of mount targets that the file system has. For more information, see CreateMountTarget.
    */
  var NumberOfMountTargets: MountTargetCount = js.native
  
  /**
    * The AWS account that created the file system. If the file system was created by an IAM user, the parent account to which the user belongs is the owner.
    */
  var OwnerId: AwsAccountId = js.native
  
  /**
    * The performance mode of the file system.
    */
  var PerformanceMode: typings.awsSdk.efsMod.PerformanceMode = js.native
  
  /**
    * The throughput, measured in MiB/s, that you want to provision for a file system. Valid values are 1-1024. Required if ThroughputMode is set to provisioned. The limit on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information, see Amazon EFS Limits That You Can Increase in the Amazon EFS User Guide. 
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typings.awsSdk.efsMod.ProvisionedThroughputInMibps] = js.native
  
  /**
    * The latest known metered size (in bytes) of data stored in the file system, in its Value field, and the time at which that size was determined in its Timestamp field. The Timestamp value is the integer number of seconds since 1970-01-01T00:00:00Z. The SizeInBytes value doesn't represent the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system. That is, SizeInBytes represents actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise, the value is not the exact size that the file system was at any point in time. 
    */
  var SizeInBytes: FileSystemSize = js.native
  
  /**
    * The tags associated with the file system, presented as an array of Tag objects.
    */
  var Tags: typings.awsSdk.efsMod.Tags = js.native
  
  /**
    * The throughput mode for a file system. There are two throughput modes to choose from for your file system: bursting and provisioned. If you set ThroughputMode to provisioned, you must also set a value for ProvisionedThroughPutInMibps. You can decrease your file system's throughput in Provisioned Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode change. 
    */
  var ThroughputMode: js.UndefOr[typings.awsSdk.efsMod.ThroughputMode] = js.native
}
object FileSystemDescription {
  
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    CreationToken: CreationToken,
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    NumberOfMountTargets: MountTargetCount,
    OwnerId: AwsAccountId,
    PerformanceMode: PerformanceMode,
    SizeInBytes: FileSystemSize,
    Tags: Tags
  ): FileSystemDescription = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], CreationToken = CreationToken.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], NumberOfMountTargets = NumberOfMountTargets.asInstanceOf[js.Any], OwnerId = OwnerId.asInstanceOf[js.Any], PerformanceMode = PerformanceMode.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDescription]
  }
  
  @scala.inline
  implicit class FileSystemDescriptionOps[Self <: FileSystemDescription] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationToken(value: CreationToken): Self = this.set("CreationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifeCycleState(value: LifeCycleState): Self = this.set("LifeCycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMountTargets(value: MountTargetCount): Self = this.set("NumberOfMountTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: AwsAccountId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceMode(value: PerformanceMode): Self = this.set("PerformanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytes(value: FileSystemSize): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Encrypted): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    
    @scala.inline
    def setFileSystemArn(value: FileSystemArn): Self = this.set("FileSystemArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemArn: Self = this.set("FileSystemArn", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: TagValue): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProvisionedThroughputInMibps(value: ProvisionedThroughputInMibps): Self = this.set("ProvisionedThroughputInMibps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughputInMibps: Self = this.set("ProvisionedThroughputInMibps", js.undefined)
    
    @scala.inline
    def setThroughputMode(value: ThroughputMode): Self = this.set("ThroughputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThroughputMode: Self = this.set("ThroughputMode", js.undefined)
  }
}
