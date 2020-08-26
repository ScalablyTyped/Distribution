package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerRequest extends js.Object {
  /**
    * Sets the number of automated backups that you want to keep. 
    */
  var BackupRetentionCount: js.UndefOr[Integer] = js.native
  /**
    * Setting DisableAutomatedBackup to true disables automated or scheduled backups. Automated backups are enabled by default. 
    */
  var DisableAutomatedBackup: js.UndefOr[Boolean] = js.native
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.native
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.native
  /**
    * The name of the server to update. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}

object UpdateServerRequest {
  @scala.inline
  def apply(ServerName: ServerName): UpdateServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerRequest]
  }
  @scala.inline
  implicit class UpdateServerRequestOps[Self <: UpdateServerRequest] (val x: Self) extends AnyVal {
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
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupRetentionCount(value: Integer): Self = this.set("BackupRetentionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionCount: Self = this.set("BackupRetentionCount", js.undefined)
    @scala.inline
    def setDisableAutomatedBackup(value: Boolean): Self = this.set("DisableAutomatedBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutomatedBackup: Self = this.set("DisableAutomatedBackup", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: TimeWindowDefinition): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
  }
  
}

