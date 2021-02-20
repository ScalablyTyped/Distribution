package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupConfigInfo extends StObject {
  
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
  implicit class BackupConfigInfoMutableBuilder[Self <: BackupConfigInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultBackupFolder(value: String): Self = StObject.set(x, "defaultBackupFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryModel(value: String): Self = StObject.set(x, "recoveryModel", value.asInstanceOf[js.Any])
  }
}
