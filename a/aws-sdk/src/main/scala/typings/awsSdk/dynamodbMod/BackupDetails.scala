package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupDetails extends StObject {
  
  /**
    * ARN associated with the backup.
    */
  var BackupArn: typings.awsSdk.dynamodbMod.BackupArn
  
  /**
    * Time at which the backup was created. This is the request time of the backup. 
    */
  var BackupCreationDateTime: typings.awsSdk.dynamodbMod.BackupCreationDateTime
  
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * Name of the requested backup.
    */
  var BackupName: typings.awsSdk.dynamodbMod.BackupName
  
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typings.awsSdk.dynamodbMod.BackupSizeBytes] = js.undefined
  
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
    */
  var BackupStatus: typings.awsSdk.dynamodbMod.BackupStatus
  
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: typings.awsSdk.dynamodbMod.BackupType
}
object BackupDetails {
  
  inline def apply(
    BackupArn: BackupArn,
    BackupCreationDateTime: BackupCreationDateTime,
    BackupName: BackupName,
    BackupStatus: BackupStatus,
    BackupType: BackupType
  ): BackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupDetails]
  }
  
  extension [Self <: BackupDetails](x: Self) {
    
    inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBackupCreationDateTime(value: BackupCreationDateTime): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setBackupExpiryDateTime(value: Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
    
    inline def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeBytes(value: BackupSizeBytes): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
    
    inline def setBackupStatus(value: BackupStatus): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
    
    inline def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
  }
}
