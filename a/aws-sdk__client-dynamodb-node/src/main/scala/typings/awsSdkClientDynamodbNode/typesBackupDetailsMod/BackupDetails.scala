package typings.awsSdkClientDynamodbNode.typesBackupDetailsMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AVAILABLE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupDetails extends js.Object {
  /**
    * <p>ARN associated with the backup.</p>
    */
  var BackupArn: String = js.native
  /**
    * <p>Time at which the backup was created. This is the request time of the backup. </p>
    */
  var BackupCreationDateTime: Date | String | Double = js.native
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  var BackupExpiryDateTime: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>Name of the requested backup.</p>
    */
  var BackupName: String = js.native
  /**
    * <p>Size of the backup in bytes.</p>
    */
  var BackupSizeBytes: js.UndefOr[Double] = js.native
  /**
    * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED. </p>
    */
  var BackupStatus: CREATING | DELETED | AVAILABLE | String = js.native
  /**
    * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
    */
  var BackupType: USER | SYSTEM | String = js.native
}

object BackupDetails {
  @scala.inline
  def apply(
    BackupArn: String,
    BackupCreationDateTime: Date | String | Double,
    BackupName: String,
    BackupStatus: CREATING | DELETED | AVAILABLE | String,
    BackupType: USER | SYSTEM | String
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupArn(value: String): Self = this.set("BackupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupCreationDateTime(value: Date | String | Double): Self = this.set("BackupCreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupName(value: String): Self = this.set("BackupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupStatus(value: CREATING | DELETED | AVAILABLE | String): Self = this.set("BackupStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupType(value: USER | SYSTEM | String): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupExpiryDateTime(value: Date | String | Double): Self = this.set("BackupExpiryDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupExpiryDateTime: Self = this.set("BackupExpiryDateTime", js.undefined)
    @scala.inline
    def setBackupSizeBytes(value: Double): Self = this.set("BackupSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupSizeBytes: Self = this.set("BackupSizeBytes", js.undefined)
  }
  
}

