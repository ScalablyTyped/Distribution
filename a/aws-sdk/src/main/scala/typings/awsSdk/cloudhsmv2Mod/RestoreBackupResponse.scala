package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreBackupResponse extends StObject {
  
  /**
    * Information on the Backup object created.
    */
  var Backup: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Backup] = js.native
}
object RestoreBackupResponse {
  
  @scala.inline
  def apply(): RestoreBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreBackupResponse]
  }
  
  @scala.inline
  implicit class RestoreBackupResponseMutableBuilder[Self <: RestoreBackupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
