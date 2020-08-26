package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class BackupProviderOps[Self <: BackupProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackup(value: (String, StringDictionary[js.Any], TaskExecutionMode) => Thenable[BackupResponse]): Self = this.set("backup", js.Any.fromFunction3(value))
    @scala.inline
    def setGetBackupConfigInfo(value: String => Thenable[BackupConfigInfo]): Self = this.set("getBackupConfigInfo", js.Any.fromFunction1(value))
  }
  
}

