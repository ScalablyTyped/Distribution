package typings.azdata.mod

import typings.azdata.anon.EncryptorName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupConfigInfo extends StObject {
  
  var backupEncryptors: js.Array[EncryptorName]
  
  var defaultBackupFolder: String
  
  var recoveryModel: String
}
object BackupConfigInfo {
  
  inline def apply(backupEncryptors: js.Array[EncryptorName], defaultBackupFolder: String, recoveryModel: String): BackupConfigInfo = {
    val __obj = js.Dynamic.literal(backupEncryptors = backupEncryptors.asInstanceOf[js.Any], defaultBackupFolder = defaultBackupFolder.asInstanceOf[js.Any], recoveryModel = recoveryModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupConfigInfo]
  }
  
  extension [Self <: BackupConfigInfo](x: Self) {
    
    inline def setBackupEncryptors(value: js.Array[EncryptorName]): Self = StObject.set(x, "backupEncryptors", value.asInstanceOf[js.Any])
    
    inline def setBackupEncryptorsVarargs(value: EncryptorName*): Self = StObject.set(x, "backupEncryptors", js.Array(value*))
    
    inline def setDefaultBackupFolder(value: String): Self = StObject.set(x, "defaultBackupFolder", value.asInstanceOf[js.Any])
    
    inline def setRecoveryModel(value: String): Self = StObject.set(x, "recoveryModel", value.asInstanceOf[js.Any])
  }
}
