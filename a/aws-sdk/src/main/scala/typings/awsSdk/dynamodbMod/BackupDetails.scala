package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupDetails extends js.Object {
  /**
    * ARN associated with the backup.
    */
  var BackupArn: typings.awsSdk.dynamodbMod.BackupArn = js.native
  /**
    * Time at which the backup was created. This is the request time of the backup. 
    */
  var BackupCreationDateTime: typings.awsSdk.dynamodbMod.BackupCreationDateTime = js.native
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[Date] = js.native
  /**
    * Name of the requested backup.
    */
  var BackupName: typings.awsSdk.dynamodbMod.BackupName = js.native
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typings.awsSdk.dynamodbMod.BackupSizeBytes] = js.native
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
    */
  var BackupStatus: typings.awsSdk.dynamodbMod.BackupStatus = js.native
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: typings.awsSdk.dynamodbMod.BackupType = js.native
}

object BackupDetails {
  @scala.inline
  def apply(
    BackupArn: BackupArn,
    BackupCreationDateTime: BackupCreationDateTime,
    BackupName: BackupName,
    BackupStatus: BackupStatus,
    BackupType: BackupType
  ): BackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupDetails]
  }
  @scala.inline
  implicit class BackupDetailsOps[Self <: BackupDetails] (val x: Self) extends AnyVal {
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
    def setBackupCreationDateTime(value: BackupCreationDateTime): Self = this.set("BackupCreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupName(value: BackupName): Self = this.set("BackupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupStatus(value: BackupStatus): Self = this.set("BackupStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupType(value: BackupType): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupExpiryDateTime(value: Date): Self = this.set("BackupExpiryDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupExpiryDateTime: Self = this.set("BackupExpiryDateTime", js.undefined)
    @scala.inline
    def setBackupSizeBytes(value: BackupSizeBytes): Self = this.set("BackupSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupSizeBytes: Self = this.set("BackupSizeBytes", js.undefined)
  }
  
}

