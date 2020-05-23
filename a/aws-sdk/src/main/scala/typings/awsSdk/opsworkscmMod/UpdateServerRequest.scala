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
  def apply(
    ServerName: ServerName,
    BackupRetentionCount: js.UndefOr[Integer] = js.undefined,
    DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
    PreferredBackupWindow: TimeWindowDefinition = null,
    PreferredMaintenanceWindow: TimeWindowDefinition = null
  ): UpdateServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    if (!js.isUndefined(BackupRetentionCount)) __obj.updateDynamic("BackupRetentionCount")(BackupRetentionCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableAutomatedBackup)) __obj.updateDynamic("DisableAutomatedBackup")(DisableAutomatedBackup.get.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerRequest]
  }
}

