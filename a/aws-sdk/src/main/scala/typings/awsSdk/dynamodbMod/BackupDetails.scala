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
    BackupType: BackupType,
    BackupExpiryDateTime: Date = null,
    BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined
  ): BackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    if (BackupExpiryDateTime != null) __obj.updateDynamic("BackupExpiryDateTime")(BackupExpiryDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(BackupSizeBytes)) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupDetails]
  }
}

