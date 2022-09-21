package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupRecoveryPointDetails extends StObject {
  
  /**
    * The size, in bytes, of a backup. 
    */
  var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault. 
    */
  var BackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens. 
    */
  var BackupVaultName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps. 
    */
  var CalculatedLifecycle: js.UndefOr[AwsBackupRecoveryPointCalculatedLifecycleDetails] = js.undefined
  
  /**
    * The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM. 
    */
  var CompletionDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Contains identifying information about the creation of a recovery point, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan that is used to create it. 
    */
  var CreatedBy: js.UndefOr[AwsBackupRecoveryPointCreatedByDetails] = js.undefined
  
  /**
    * The date and time a recovery point is created, in Unix format and UTC. The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM. 
    */
  var CreationDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN for the server-side encryption key that is used to protect your backups. 
    */
  var EncryptionKeyArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the IAM role ARN used to create the target recovery point 
    */
  var IamRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A Boolean value that is returned as TRUE if the specified recovery point is encrypted, or FALSE if the recovery point is not encrypted. 
    */
  var IsEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time that a recovery point was last restored, in Unix format and UTC. The value of LastRestoreTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM. 
    */
  var LastRestoreTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and expires backups automatically according to the lifecycle that you define 
    */
  var Lifecycle: js.UndefOr[AwsBackupRecoveryPointLifecycleDetails] = js.undefined
  
  /**
    * An ARN that uniquely identifies a recovery point. 
    */
  var RecoveryPointArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type. 
    */
  var ResourceArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an Amazon RDS database. 
    */
  var ResourceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN for the backup vault where the recovery point was originally copied from. If the recovery point is restored to the same account, this value will be null. 
    */
  var SourceBackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A status code specifying the state of the recovery point. Valid values are as follows:    COMPLETED     DELETING     EXPIRED     PARTIAL   
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A message explaining the reason of the recovery point deletion failure. 
    */
  var StatusMessage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the storage class of the recovery point. Valid values are as follows:    COLD     DELETED     WARM   
    */
  var StorageClass: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsBackupRecoveryPointDetails {
  
  inline def apply(): AwsBackupRecoveryPointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupRecoveryPointDetails]
  }
  
  extension [Self <: AwsBackupRecoveryPointDetails](x: Self) {
    
    inline def setBackupSizeInBytes(value: Long): Self = StObject.set(x, "BackupSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeInBytesUndefined: Self = StObject.set(x, "BackupSizeInBytes", js.undefined)
    
    inline def setBackupVaultArn(value: NonEmptyString): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    inline def setBackupVaultName(value: NonEmptyString): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultNameUndefined: Self = StObject.set(x, "BackupVaultName", js.undefined)
    
    inline def setCalculatedLifecycle(value: AwsBackupRecoveryPointCalculatedLifecycleDetails): Self = StObject.set(x, "CalculatedLifecycle", value.asInstanceOf[js.Any])
    
    inline def setCalculatedLifecycleUndefined: Self = StObject.set(x, "CalculatedLifecycle", js.undefined)
    
    inline def setCompletionDate(value: NonEmptyString): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    inline def setCreatedBy(value: AwsBackupRecoveryPointCreatedByDetails): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationDate(value: NonEmptyString): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setEncryptionKeyArn(value: NonEmptyString): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    inline def setIamRoleArn(value: NonEmptyString): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setIsEncrypted(value: Boolean): Self = StObject.set(x, "IsEncrypted", value.asInstanceOf[js.Any])
    
    inline def setIsEncryptedUndefined: Self = StObject.set(x, "IsEncrypted", js.undefined)
    
    inline def setLastRestoreTime(value: NonEmptyString): Self = StObject.set(x, "LastRestoreTime", value.asInstanceOf[js.Any])
    
    inline def setLastRestoreTimeUndefined: Self = StObject.set(x, "LastRestoreTime", js.undefined)
    
    inline def setLifecycle(value: AwsBackupRecoveryPointLifecycleDetails): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setRecoveryPointArn(value: NonEmptyString): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    inline def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceType(value: NonEmptyString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSourceBackupVaultArn(value: NonEmptyString): Self = StObject.set(x, "SourceBackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupVaultArnUndefined: Self = StObject.set(x, "SourceBackupVaultArn", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: NonEmptyString): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageClass(value: NonEmptyString): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
