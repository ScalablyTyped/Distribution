package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupResponse extends StObject {
  
  /**
    * A description of the backup.
    */
  var Backup: js.UndefOr[typings.awsSdk.fsxMod.Backup] = js.undefined
}
object CreateBackupResponse {
  
  inline def apply(): CreateBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupResponse]
  }
  
  extension [Self <: CreateBackupResponse](x: Self) {
    
    inline def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
