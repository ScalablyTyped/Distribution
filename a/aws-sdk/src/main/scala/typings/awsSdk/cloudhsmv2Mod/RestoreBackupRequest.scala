package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreBackupRequest extends js.Object {
  /**
    * The ID of the backup to be restored. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typings.awsSdk.cloudhsmv2Mod.BackupId = js.native
}

object RestoreBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId): RestoreBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestoreBackupRequest]
  }
}

