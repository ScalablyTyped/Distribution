package typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.AVAILABLE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.SYSTEM
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.USER
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledBackupDetails extends BackupDetails {
  /**
    * <p>Time at which the backup was created. This is the request time of the backup. </p>
    */
  @JSName("BackupCreationDateTime")
  var BackupCreationDateTime_UnmarshalledBackupDetails: Date
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  @JSName("BackupExpiryDateTime")
  var BackupExpiryDateTime_UnmarshalledBackupDetails: js.UndefOr[Date] = js.undefined
}

object UnmarshalledBackupDetails {
  @scala.inline
  def apply(
    BackupArn: String,
    BackupCreationDateTime: Date,
    BackupName: String,
    BackupStatus: CREATING | DELETED | AVAILABLE | String,
    BackupType: USER | SYSTEM | String,
    BackupExpiryDateTime: Date = null,
    BackupSizeBytes: js.UndefOr[Double] = js.undefined
  ): UnmarshalledBackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    if (BackupExpiryDateTime != null) __obj.updateDynamic("BackupExpiryDateTime")(BackupExpiryDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(BackupSizeBytes)) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBackupDetails]
  }
}

