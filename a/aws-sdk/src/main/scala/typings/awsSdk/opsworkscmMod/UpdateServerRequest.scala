package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServerRequest extends StObject {
  
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
  implicit class UpdateServerRequestMutableBuilder[Self <: UpdateServerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupRetentionCount(value: Integer): Self = StObject.set(x, "BackupRetentionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionCountUndefined: Self = StObject.set(x, "BackupRetentionCount", js.undefined)
    
    @scala.inline
    def setDisableAutomatedBackup(value: Boolean): Self = StObject.set(x, "DisableAutomatedBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutomatedBackupUndefined: Self = StObject.set(x, "DisableAutomatedBackup", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
