package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupProvider extends DataProvider {
  
  def backup(connectionUri: String, backupInfo: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): Thenable[BackupResponse] = js.native
  
  def getBackupConfigInfo(connectionUri: String): Thenable[BackupConfigInfo] = js.native
}
object BackupProvider {
  
  @scala.inline
  def apply(
    backup: (String, StringDictionary[js.Any], TaskExecutionMode) => Thenable[BackupResponse],
    getBackupConfigInfo: String => Thenable[BackupConfigInfo],
    providerId: String
  ): BackupProvider = {
    val __obj = js.Dynamic.literal(backup = js.Any.fromFunction3(backup), getBackupConfigInfo = js.Any.fromFunction1(getBackupConfigInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupProvider]
  }
  
  @scala.inline
  implicit class BackupProviderMutableBuilder[Self <: BackupProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: (String, StringDictionary[js.Any], TaskExecutionMode) => Thenable[BackupResponse]): Self = StObject.set(x, "backup", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetBackupConfigInfo(value: String => Thenable[BackupConfigInfo]): Self = StObject.set(x, "getBackupConfigInfo", js.Any.fromFunction1(value))
  }
}
