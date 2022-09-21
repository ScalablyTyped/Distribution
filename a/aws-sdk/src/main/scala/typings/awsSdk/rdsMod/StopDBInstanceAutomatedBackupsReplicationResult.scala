package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDBInstanceAutomatedBackupsReplicationResult extends StObject {
  
  var DBInstanceAutomatedBackup: js.UndefOr[typings.awsSdk.rdsMod.DBInstanceAutomatedBackup] = js.undefined
}
object StopDBInstanceAutomatedBackupsReplicationResult {
  
  inline def apply(): StopDBInstanceAutomatedBackupsReplicationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDBInstanceAutomatedBackupsReplicationResult]
  }
  
  extension [Self <: StopDBInstanceAutomatedBackupsReplicationResult](x: Self) {
    
    inline def setDBInstanceAutomatedBackup(value: DBInstanceAutomatedBackup): Self = StObject.set(x, "DBInstanceAutomatedBackup", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackup", js.undefined)
  }
}
