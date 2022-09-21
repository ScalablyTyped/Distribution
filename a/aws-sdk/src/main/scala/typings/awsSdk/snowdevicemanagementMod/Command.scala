package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Reboots the device.
    */
  var reboot: js.UndefOr[Reboot] = js.undefined
  
  /**
    * Unlocks the device.
    */
  var unlock: js.UndefOr[Unlock] = js.undefined
}
object Command {
  
  inline def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setReboot(value: Reboot): Self = StObject.set(x, "reboot", value.asInstanceOf[js.Any])
    
    inline def setRebootUndefined: Self = StObject.set(x, "reboot", js.undefined)
    
    inline def setUnlock(value: Unlock): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
    
    inline def setUnlockUndefined: Self = StObject.set(x, "unlock", js.undefined)
  }
}
