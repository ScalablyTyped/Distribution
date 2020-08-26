package typings.awsSdkClientDynamodbBrowser.typesBackupSummaryMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.AVAILABLE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.SYSTEM
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.USER
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSummary extends js.Object {
  /**
    * <p>ARN associated with the backup.</p>
    */
  var BackupArn: js.UndefOr[String] = js.native
  /**
    * <p>Time at which the backup was created.</p>
    */
  var BackupCreationDateTime: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  var BackupExpiryDateTime: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>Name of the specified backup.</p>
    */
  var BackupName: js.UndefOr[String] = js.native
  /**
    * <p>Size of the backup in bytes.</p>
    */
  var BackupSizeBytes: js.UndefOr[Double] = js.native
  /**
    * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED.</p>
    */
  var BackupStatus: js.UndefOr[CREATING | DELETED | AVAILABLE | String] = js.native
  /**
    * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
    */
  var BackupType: js.UndefOr[USER | SYSTEM | String] = js.native
  /**
    * <p>ARN associated with the table.</p>
    */
  var TableArn: js.UndefOr[String] = js.native
  /**
    * <p>Unique identifier for the table.</p>
    */
  var TableId: js.UndefOr[String] = js.native
  /**
    * <p>Name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupArn(value: String): Self = this.set("BackupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupArn: Self = this.set("BackupArn", js.undefined)
    @scala.inline
    def setBackupCreationDateTime(value: Date | String | Double): Self = this.set("BackupCreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupCreationDateTime: Self = this.set("BackupCreationDateTime", js.undefined)
    @scala.inline
    def setBackupExpiryDateTime(value: Date | String | Double): Self = this.set("BackupExpiryDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupExpiryDateTime: Self = this.set("BackupExpiryDateTime", js.undefined)
    @scala.inline
    def setBackupName(value: String): Self = this.set("BackupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupName: Self = this.set("BackupName", js.undefined)
    @scala.inline
    def setBackupSizeBytes(value: Double): Self = this.set("BackupSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupSizeBytes: Self = this.set("BackupSizeBytes", js.undefined)
    @scala.inline
    def setBackupStatus(value: CREATING | DELETED | AVAILABLE | String): Self = this.set("BackupStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupStatus: Self = this.set("BackupStatus", js.undefined)
    @scala.inline
    def setBackupType(value: USER | SYSTEM | String): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupType: Self = this.set("BackupType", js.undefined)
    @scala.inline
    def setTableArn(value: String): Self = this.set("TableArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableArn: Self = this.set("TableArn", js.undefined)
    @scala.inline
    def setTableId(value: String): Self = this.set("TableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("TableId", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
  
}

