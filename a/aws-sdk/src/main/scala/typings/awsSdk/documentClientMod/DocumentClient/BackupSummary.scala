package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSummary extends js.Object {
  /**
    * ARN associated with the backup.
    */
  var BackupArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupArn] = js.native
  /**
    * Time at which the backup was created.
    */
  var BackupCreationDateTime: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupCreationDateTime] = js.native
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[Date] = js.native
  /**
    * Name of the specified backup.
    */
  var BackupName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupName] = js.native
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupSizeBytes] = js.native
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  var BackupStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupStatus] = js.native
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupType] = js.native
  /**
    * ARN associated with the table.
    */
  var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
  /**
    * Unique identifier for the table.
    */
  var TableId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableId] = js.native
  /**
    * Name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}

object BackupSummary {
  @scala.inline
  def apply(): BackupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupSummary]
  }
  @scala.inline
  implicit class BackupSummaryOps[Self <: BackupSummary] (val x: Self) extends AnyVal {
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
    def setBackupArn(value: BackupArn): Self = this.set("BackupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupArn: Self = this.set("BackupArn", js.undefined)
    @scala.inline
    def setBackupCreationDateTime(value: BackupCreationDateTime): Self = this.set("BackupCreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupCreationDateTime: Self = this.set("BackupCreationDateTime", js.undefined)
    @scala.inline
    def setBackupExpiryDateTime(value: Date): Self = this.set("BackupExpiryDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupExpiryDateTime: Self = this.set("BackupExpiryDateTime", js.undefined)
    @scala.inline
    def setBackupName(value: BackupName): Self = this.set("BackupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupName: Self = this.set("BackupName", js.undefined)
    @scala.inline
    def setBackupSizeBytes(value: BackupSizeBytes): Self = this.set("BackupSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupSizeBytes: Self = this.set("BackupSizeBytes", js.undefined)
    @scala.inline
    def setBackupStatus(value: BackupStatus): Self = this.set("BackupStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupStatus: Self = this.set("BackupStatus", js.undefined)
    @scala.inline
    def setBackupType(value: BackupType): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupType: Self = this.set("BackupType", js.undefined)
    @scala.inline
    def setTableArn(value: TableArn): Self = this.set("TableArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableArn: Self = this.set("TableArn", js.undefined)
    @scala.inline
    def setTableId(value: TableId): Self = this.set("TableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("TableId", js.undefined)
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
  
}

