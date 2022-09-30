package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformCommand extends StObject {
  
  /**
    * Command for Linux.
    */
  var linux: js.UndefOr[String] = js.undefined
  
  /**
    * Command for Windows.
    */
  var windows: js.UndefOr[String] = js.undefined
}
object PlatformCommand {
  
  inline def apply(): PlatformCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformCommand]
  }
  
  extension [Self <: PlatformCommand](x: Self) {
    
    inline def setLinux(value: String): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    inline def setWindows(value: String): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
  }
}
