package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerRequest extends StObject {
  
  /**
    * Sets the number of automated backups that you want to keep. 
    */
  var BackupRetentionCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Setting DisableAutomatedBackup to true disables automated or scheduled backups. Automated backups are enabled by default. 
    */
  var DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined
  
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
  
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
  
  /**
    * The name of the server to update. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName
}
object UpdateServerRequest {
  
  inline def apply(ServerName: ServerName): UpdateServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerRequest]
  }
  
  extension [Self <: UpdateServerRequest](x: Self) {
    
    inline def setBackupRetentionCount(value: Integer): Self = StObject.set(x, "BackupRetentionCount", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionCountUndefined: Self = StObject.set(x, "BackupRetentionCount", js.undefined)
    
    inline def setDisableAutomatedBackup(value: Boolean): Self = StObject.set(x, "DisableAutomatedBackup", value.asInstanceOf[js.Any])
    
    inline def setDisableAutomatedBackupUndefined: Self = StObject.set(x, "DisableAutomatedBackup", js.undefined)
    
    inline def setPreferredBackupWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
