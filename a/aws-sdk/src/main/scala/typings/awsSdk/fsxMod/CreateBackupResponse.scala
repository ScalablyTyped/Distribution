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
  
  @scala.inline
  def apply(): CreateBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupResponse]
  }
  
  @scala.inline
  implicit class CreateBackupResponseMutableBuilder[Self <: CreateBackupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
