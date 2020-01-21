package typings.awsSdkClientDynamodbNode.typesBackupSummaryMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AVAILABLE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledBackupSummary extends BackupSummary {
  /**
    * <p>Time at which the backup was created.</p>
    */
  @JSName("BackupCreationDateTime")
  var BackupCreationDateTime_UnmarshalledBackupSummary: js.UndefOr[Date] = js.undefined
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  @JSName("BackupExpiryDateTime")
  var BackupExpiryDateTime_UnmarshalledBackupSummary: js.UndefOr[Date] = js.undefined
}

object UnmarshalledBackupSummary {
  @scala.inline
  def apply(
    BackupArn: String = null,
    BackupCreationDateTime: Date = null,
    BackupExpiryDateTime: Date = null,
    BackupName: String = null,
    BackupSizeBytes: Int | Double = null,
    BackupStatus: CREATING | DELETED | AVAILABLE | String = null,
    BackupType: USER | SYSTEM | String = null,
    TableArn: String = null,
    TableId: String = null,
    TableName: String = null
  ): UnmarshalledBackupSummary = {
    val __obj = js.Dynamic.literal()
    if (BackupArn != null) __obj.updateDynamic("BackupArn")(BackupArn.asInstanceOf[js.Any])
    if (BackupCreationDateTime != null) __obj.updateDynamic("BackupCreationDateTime")(BackupCreationDateTime.asInstanceOf[js.Any])
    if (BackupExpiryDateTime != null) __obj.updateDynamic("BackupExpiryDateTime")(BackupExpiryDateTime.asInstanceOf[js.Any])
    if (BackupName != null) __obj.updateDynamic("BackupName")(BackupName.asInstanceOf[js.Any])
    if (BackupSizeBytes != null) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.asInstanceOf[js.Any])
    if (BackupStatus != null) __obj.updateDynamic("BackupStatus")(BackupStatus.asInstanceOf[js.Any])
    if (BackupType != null) __obj.updateDynamic("BackupType")(BackupType.asInstanceOf[js.Any])
    if (TableArn != null) __obj.updateDynamic("TableArn")(TableArn.asInstanceOf[js.Any])
    if (TableId != null) __obj.updateDynamic("TableId")(TableId.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBackupSummary]
  }
}

