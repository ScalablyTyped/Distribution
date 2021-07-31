package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceAutomatedBackupResult extends StObject {
  
  var DBInstanceAutomatedBackup: js.UndefOr[typings.awsSdk.rdsMod.DBInstanceAutomatedBackup] = js.undefined
}
object DeleteDBInstanceAutomatedBackupResult {
  
  @scala.inline
  def apply(): DeleteDBInstanceAutomatedBackupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
  }
  
  @scala.inline
  implicit class DeleteDBInstanceAutomatedBackupResultMutableBuilder[Self <: DeleteDBInstanceAutomatedBackupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceAutomatedBackup(value: DBInstanceAutomatedBackup): Self = StObject.set(x, "DBInstanceAutomatedBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceAutomatedBackupUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackup", js.undefined)
  }
}
