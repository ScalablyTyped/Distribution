package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRunWith extends StObject {
  
  /**
    * The POSIX system user and, optionally, group to use to run this component on Linux core devices. The user, and group if specified, must exist on each Linux core device. Specify the user and group separated by a colon (:) in the following format: user:group. The group is optional. If you don't specify a group, the IoT Greengrass Core software uses the primary user for the group. If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that you configure on the Greengrass nucleus component. For more information, see Configure the user and group that run components.
    */
  var posixUser: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The system resource limits to apply to this component's process on the core device. IoT Greengrass currently supports this feature on only Linux core devices. If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that you configure on the Greengrass nucleus component. For more information, see Configure system resource limits for components.
    */
  var systemResourceLimits: js.UndefOr[SystemResourceLimits] = js.undefined
  
  /**
    * The Windows user to use to run this component on Windows core devices. The user must exist on each Windows core device, and its name and password must be in the LocalSystem account's Credentials Manager instance. If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you configure on the Greengrass nucleus component. For more information, see Configure the user and group that run components.
    */
  var windowsUser: js.UndefOr[NonEmptyString] = js.undefined
}
object ComponentRunWith {
  
  inline def apply(): ComponentRunWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRunWith]
  }
  
  extension [Self <: ComponentRunWith](x: Self) {
    
    inline def setPosixUser(value: NonEmptyString): Self = StObject.set(x, "posixUser", value.asInstanceOf[js.Any])
    
    inline def setPosixUserUndefined: Self = StObject.set(x, "posixUser", js.undefined)
    
    inline def setSystemResourceLimits(value: SystemResourceLimits): Self = StObject.set(x, "systemResourceLimits", value.asInstanceOf[js.Any])
    
    inline def setSystemResourceLimitsUndefined: Self = StObject.set(x, "systemResourceLimits", js.undefined)
    
    inline def setWindowsUser(value: NonEmptyString): Self = StObject.set(x, "windowsUser", value.asInstanceOf[js.Any])
    
    inline def setWindowsUserUndefined: Self = StObject.set(x, "windowsUser", js.undefined)
  }
}
