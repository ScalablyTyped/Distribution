package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupDescription] = js.native
}

object DescribeBackupOutput {
  @scala.inline
  def apply(BackupDescription: BackupDescription = null): DescribeBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupDescription != null) __obj.updateDynamic("BackupDescription")(BackupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupOutput]
  }
}

