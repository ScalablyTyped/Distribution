package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupResponse extends StObject {
  
  /**
    * Information on the Backup object deleted.
    */
  var Backup: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Backup] = js.undefined
}
object DeleteBackupResponse {
  
  @scala.inline
  def apply(): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupResponse]
  }
  
  @scala.inline
  implicit class DeleteBackupResponseMutableBuilder[Self <: DeleteBackupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
