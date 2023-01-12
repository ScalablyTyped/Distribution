package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chromeos extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var chromeos: js.UndefOr[String] = js.undefined
  
  var linux: js.UndefOr[String] = js.undefined
  
  var mac: js.UndefOr[String] = js.undefined
  
  var windows: js.UndefOr[String] = js.undefined
}
object Chromeos {
  
  inline def apply(): Chromeos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chromeos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chromeos] (val x: Self) extends AnyVal {
    
    inline def setChromeos(value: String): Self = StObject.set(x, "chromeos", value.asInstanceOf[js.Any])
    
    inline def setChromeosUndefined: Self = StObject.set(x, "chromeos", js.undefined)
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setLinux(value: String): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setWindows(value: String): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
  }
}
