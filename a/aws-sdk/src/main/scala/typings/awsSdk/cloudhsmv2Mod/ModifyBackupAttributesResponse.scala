package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyBackupAttributesResponse extends StObject {
  
  var Backup: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Backup] = js.undefined
}
object ModifyBackupAttributesResponse {
  
  @scala.inline
  def apply(): ModifyBackupAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyBackupAttributesResponse]
  }
  
  @scala.inline
  implicit class ModifyBackupAttributesResponseMutableBuilder[Self <: ModifyBackupAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
