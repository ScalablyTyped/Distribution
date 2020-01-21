package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchivalSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason. If you wish to restore this backup to the same table name, you will need to delete the original table.
    */
  var ArchivalBackupArn: js.UndefOr[BackupArn] = js.native
  /**
    * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
    */
  var ArchivalDateTime: js.UndefOr[Date] = js.native
  /**
    * The reason DynamoDB archived the table. Currently, the only possible value is:    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The table was archived due to the table's AWS KMS key being inaccessible for more than seven days. An On-Demand backup was created at the archival time.  
    */
  var ArchivalReason: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ArchivalReason] = js.native
}

object ArchivalSummary {
  @scala.inline
  def apply(
    ArchivalBackupArn: BackupArn = null,
    ArchivalDateTime: Date = null,
    ArchivalReason: ArchivalReason = null
  ): ArchivalSummary = {
    val __obj = js.Dynamic.literal()
    if (ArchivalBackupArn != null) __obj.updateDynamic("ArchivalBackupArn")(ArchivalBackupArn.asInstanceOf[js.Any])
    if (ArchivalDateTime != null) __obj.updateDynamic("ArchivalDateTime")(ArchivalDateTime.asInstanceOf[js.Any])
    if (ArchivalReason != null) __obj.updateDynamic("ArchivalReason")(ArchivalReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchivalSummary]
  }
}

