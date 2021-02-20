package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupSummary extends StObject {
  
  /**
    * ARN associated with the backup.
    */
  var BackupArn: js.UndefOr[typings.awsSdk.dynamodbMod.BackupArn] = js.native
  
  /**
    * Time at which the backup was created.
    */
  var BackupCreationDateTime: js.UndefOr[typings.awsSdk.dynamodbMod.BackupCreationDateTime] = js.native
  
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[Date] = js.native
  
  /**
    * Name of the specified backup.
    */
  var BackupName: js.UndefOr[typings.awsSdk.dynamodbMod.BackupName] = js.native
  
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typings.awsSdk.dynamodbMod.BackupSizeBytes] = js.native
  
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  var BackupStatus: js.UndefOr[typings.awsSdk.dynamodbMod.BackupStatus] = js.native
  
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: js.UndefOr[typings.awsSdk.dynamodbMod.BackupType] = js.native
  
  /**
    * ARN associated with the table.
    */
  var TableArn: js.UndefOr[typings.awsSdk.dynamodbMod.TableArn] = js.native
  
  /**
    * Unique identifier for the table.
    */
  var TableId: js.UndefOr[typings.awsSdk.dynamodbMod.TableId] = js.native
  
  /**
    * Name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.native
}
object BackupSummary {
  
  @scala.inline
  def apply(): BackupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupSummary]
  }
  
  @scala.inline
  implicit class BackupSummaryMutableBuilder[Self <: BackupSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
    
    @scala.inline
    def setBackupCreationDateTime(value: BackupCreationDateTime): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupCreationDateTimeUndefined: Self = StObject.set(x, "BackupCreationDateTime", js.undefined)
    
    @scala.inline
    def setBackupExpiryDateTime(value: Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
    
    @scala.inline
    def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupNameUndefined: Self = StObject.set(x, "BackupName", js.undefined)
    
    @scala.inline
    def setBackupSizeBytes(value: BackupSizeBytes): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
    
    @scala.inline
    def setBackupStatus(value: BackupStatus): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupStatusUndefined: Self = StObject.set(x, "BackupStatus", js.undefined)
    
    @scala.inline
    def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
    
    @scala.inline
    def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    @scala.inline
    def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
