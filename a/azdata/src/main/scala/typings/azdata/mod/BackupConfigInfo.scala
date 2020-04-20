package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupConfigInfo extends js.Object {
  var defaultBackupFolder: String
  var recoveryModel: String
}

object BackupConfigInfo {
  @scala.inline
  def apply(defaultBackupFolder: String, recoveryModel: String): BackupConfigInfo = {
    val __obj = js.Dynamic.literal(defaultBackupFolder = defaultBackupFolder.asInstanceOf[js.Any], recoveryModel = recoveryModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupConfigInfo]
  }
}

