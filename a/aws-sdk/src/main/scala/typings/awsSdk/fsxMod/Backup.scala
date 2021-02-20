package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends StObject {
  
  /**
    * The ID of the backup.
    */
  var BackupId: typings.awsSdk.fsxMod.BackupId = js.native
  
  /**
    * The time when a particular backup was created.
    */
  var CreationTime: typings.awsSdk.fsxMod.CreationTime = js.native
  
  /**
    * The configuration of the self-managed Microsoft Active Directory (AD) to which the Windows File Server instance is joined.
    */
  var DirectoryInformation: js.UndefOr[ActiveDirectoryBackupAttributes] = js.native
  
  /**
    * Details explaining any failures that occur when creating a backup.
    */
  var FailureDetails: js.UndefOr[BackupFailureDetails] = js.native
  
  /**
    * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is deleted.
    */
  var FileSystem: typings.awsSdk.fsxMod.FileSystem = js.native
  
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the backup of the Amazon FSx file system's data at rest. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.fsxMod.KmsKeyId] = js.native
  
  /**
    * The lifecycle status of the backup.    AVAILABLE - The backup is fully available.    CREATING - FSx is creating the backup.    TRANSFERRING - For Lustre file systems only; FSx is transferring the backup to S3.    DELETED - The backup was deleted is no longer available.    FAILED - Amazon FSx could not complete the backup.  
    */
  var Lifecycle: BackupLifecycle = js.native
  
  var ProgressPercent: js.UndefOr[typings.awsSdk.fsxMod.ProgressPercent] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the backup resource.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.fsxMod.ResourceARN] = js.native
  
  /**
    * Tags associated with a particular file system.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.native
  
  /**
    * The type of the file system backup.
    */
  var Type: BackupType = js.native
}
object Backup {
  
  @scala.inline
  def apply(
    BackupId: BackupId,
    CreationTime: CreationTime,
    FileSystem: FileSystem,
    Lifecycle: BackupLifecycle,
    Type: BackupType
  ): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FileSystem = FileSystem.asInstanceOf[js.Any], Lifecycle = Lifecycle.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  
  @scala.inline
  implicit class BackupMutableBuilder[Self <: Backup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryInformation(value: ActiveDirectoryBackupAttributes): Self = StObject.set(x, "DirectoryInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryInformationUndefined: Self = StObject.set(x, "DirectoryInformation", js.undefined)
    
    @scala.inline
    def setFailureDetails(value: BackupFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    @scala.inline
    def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLifecycle(value: BackupLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: BackupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
