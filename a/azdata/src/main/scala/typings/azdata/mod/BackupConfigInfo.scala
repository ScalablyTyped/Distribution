package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupConfigInfo extends js.Object {
  
  var defaultBackupFolder: String = js.native
  
  var recoveryModel: String = js.native
}
object BackupConfigInfo {
  
  @scala.inline
  def apply(defaultBackupFolder: String, recoveryModel: String): BackupConfigInfo = {
    val __obj = js.Dynamic.literal(defaultBackupFolder = defaultBackupFolder.asInstanceOf[js.Any], recoveryModel = recoveryModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupConfigInfo]
  }
  
  @scala.inline
  implicit class BackupConfigInfoOps[Self <: BackupConfigInfo] (val x: Self) extends AnyVal {
    
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
    def setDefaultBackupFolder(value: String): Self = this.set("defaultBackupFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryModel(value: String): Self = this.set("recoveryModel", value.asInstanceOf[js.Any])
  }
}
