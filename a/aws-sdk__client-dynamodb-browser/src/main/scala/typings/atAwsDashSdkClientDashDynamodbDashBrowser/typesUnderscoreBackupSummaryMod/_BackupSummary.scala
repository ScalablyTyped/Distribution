package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreBackupSummaryMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.AVAILABLE
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.DELETED
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.SYSTEM
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.USER
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BackupSummary extends js.Object {
  /**
    * <p>ARN associated with the backup.</p>
    */
  var BackupArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Time at which the backup was created.</p>
    */
  var BackupCreationDateTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  var BackupExpiryDateTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Name of the specified backup.</p>
    */
  var BackupName: js.UndefOr[String] = js.undefined
  /**
    * <p>Size of the backup in bytes.</p>
    */
  var BackupSizeBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED.</p>
    */
  var BackupStatus: js.UndefOr[CREATING | DELETED | AVAILABLE | String] = js.undefined
  /**
    * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
    */
  var BackupType: js.UndefOr[USER | SYSTEM | String] = js.undefined
  /**
    * <p>ARN associated with the table.</p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Unique identifier for the table.</p>
    */
  var TableId: js.UndefOr[String] = js.undefined
  /**
    * <p>Name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}

object _BackupSummary {
  @scala.inline
  def apply(
    BackupArn: String = null,
    BackupCreationDateTime: Date | String | Double = null,
    BackupExpiryDateTime: Date | String | Double = null,
    BackupName: String = null,
    BackupSizeBytes: Int | Double = null,
    BackupStatus: CREATING | DELETED | AVAILABLE | String = null,
    BackupType: USER | SYSTEM | String = null,
    TableArn: String = null,
    TableId: String = null,
    TableName: String = null
  ): _BackupSummary = {
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
    __obj.asInstanceOf[_BackupSummary]
  }
}

