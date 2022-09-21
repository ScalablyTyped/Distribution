package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backup extends StObject {
  
  /**
    * The ID of the backup.
    */
  var BackupId: typings.awsSdk.fsxMod.BackupId
  
  /**
    * The time when a particular backup was created.
    */
  var CreationTime: js.Date
  
  /**
    * The configuration of the self-managed Microsoft Active Directory directory to which the Windows File Server instance is joined.
    */
  var DirectoryInformation: js.UndefOr[ActiveDirectoryBackupAttributes] = js.undefined
  
  /**
    * Details explaining any failures that occurred when creating a backup.
    */
  var FailureDetails: js.UndefOr[BackupFailureDetails] = js.undefined
  
  /**
    * The metadata of the file system associated with the backup. This metadata is persisted even if the file system is deleted.
    */
  var FileSystem: typings.awsSdk.fsxMod.FileSystem
  
  /**
    * The ID of the Key Management Service (KMS) key used to encrypt the backup of the Amazon FSx file system's data at rest. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.fsxMod.KmsKeyId] = js.undefined
  
  /**
    * The lifecycle status of the backup.    AVAILABLE - The backup is fully available.    PENDING - For user-initiated backups on Lustre file systems only; Amazon FSx hasn't started creating the backup.    CREATING - Amazon FSx is creating the backup.    TRANSFERRING - For user-initiated backups on Lustre file systems only; Amazon FSx is transferring the backup to Amazon S3.    COPYING - Amazon FSx is copying the backup.    DELETED - Amazon FSx deleted the backup and it's no longer available.    FAILED - Amazon FSx couldn't finish the backup.  
    */
  var Lifecycle: BackupLifecycle
  
  var OwnerId: js.UndefOr[AWSAccountId] = js.undefined
  
  var ProgressPercent: js.UndefOr[typings.awsSdk.fsxMod.ProgressPercent] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the backup resource.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.fsxMod.ResourceARN] = js.undefined
  
  /**
    * Specifies the resource type that's backed up.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.fsxMod.ResourceType] = js.undefined
  
  var SourceBackupId: js.UndefOr[BackupId] = js.undefined
  
  /**
    * The source Region of the backup. Specifies the Region from where this backup is copied.
    */
  var SourceBackupRegion: js.UndefOr[Region] = js.undefined
  
  /**
    * The tags associated with a particular file system.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
  
  /**
    * The type of the file-system backup.
    */
  var Type: BackupType
  
  var Volume: js.UndefOr[typings.awsSdk.fsxMod.Volume] = js.undefined
}
object Backup {
  
  inline def apply(
    BackupId: BackupId,
    CreationTime: js.Date,
    FileSystem: FileSystem,
    Lifecycle: BackupLifecycle,
    Type: BackupType
  ): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FileSystem = FileSystem.asInstanceOf[js.Any], Lifecycle = Lifecycle.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  
  extension [Self <: Backup](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDirectoryInformation(value: ActiveDirectoryBackupAttributes): Self = StObject.set(x, "DirectoryInformation", value.asInstanceOf[js.Any])
    
    inline def setDirectoryInformationUndefined: Self = StObject.set(x, "DirectoryInformation", js.undefined)
    
    inline def setFailureDetails(value: BackupFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLifecycle(value: BackupLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: AWSAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSourceBackupId(value: BackupId): Self = StObject.set(x, "SourceBackupId", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupIdUndefined: Self = StObject.set(x, "SourceBackupId", js.undefined)
    
    inline def setSourceBackupRegion(value: Region): Self = StObject.set(x, "SourceBackupRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupRegionUndefined: Self = StObject.set(x, "SourceBackupRegion", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: BackupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
