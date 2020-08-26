package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupRequest extends js.Object {
  /**
    * The ID of the backup to delete. Run the DescribeBackups command to get a list of backup IDs. Backup IDs are in the format ServerName-yyyyMMddHHmmssSSS. 
    */
  var BackupId: typings.awsSdk.opsworkscmMod.BackupId = js.native
}

object DeleteBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupRequest]
  }
  @scala.inline
  implicit class DeleteBackupRequestOps[Self <: DeleteBackupRequest] (val x: Self) extends AnyVal {
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
    def setBackupId(value: BackupId): Self = this.set("BackupId", value.asInstanceOf[js.Any])
  }
  
}

