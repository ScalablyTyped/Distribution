package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupProvider extends DataProvider {
  def backup(connectionUri: String, backupInfo: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): Thenable[BackupResponse]
  def getBackupConfigInfo(connectionUri: String): Thenable[BackupConfigInfo]
}

object BackupProvider {
  @scala.inline
  def apply(
    backup: (String, StringDictionary[js.Any], TaskExecutionMode) => Thenable[BackupResponse],
    getBackupConfigInfo: String => Thenable[BackupConfigInfo],
    providerId: String,
    handle: Int | Double = null
  ): BackupProvider = {
    val __obj = js.Dynamic.literal(backup = js.Any.fromFunction3(backup), getBackupConfigInfo = js.Any.fromFunction1(getBackupConfigInfo), providerId = providerId.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupProvider]
  }
}

