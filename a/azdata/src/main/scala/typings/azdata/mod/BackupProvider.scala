package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupProvider
  extends StObject
     with DataProvider {
  
  def backup(connectionUri: String, backupInfo: StringDictionary[Any], taskExecutionMode: TaskExecutionMode): Thenable[BackupResponse]
  
  def getBackupConfigInfo(connectionUri: String): Thenable[BackupConfigInfo]
}
object BackupProvider {
  
  inline def apply(
    backup: (String, StringDictionary[Any], TaskExecutionMode) => Thenable[BackupResponse],
    getBackupConfigInfo: String => Thenable[BackupConfigInfo],
    providerId: String
  ): BackupProvider = {
    val __obj = js.Dynamic.literal(backup = js.Any.fromFunction3(backup), getBackupConfigInfo = js.Any.fromFunction1(getBackupConfigInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupProvider] (val x: Self) extends AnyVal {
    
    inline def setBackup(value: (String, StringDictionary[Any], TaskExecutionMode) => Thenable[BackupResponse]): Self = StObject.set(x, "backup", js.Any.fromFunction3(value))
    
    inline def setGetBackupConfigInfo(value: String => Thenable[BackupConfigInfo]): Self = StObject.set(x, "getBackupConfigInfo", js.Any.fromFunction1(value))
  }
}
