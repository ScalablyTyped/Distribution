package typings.chrome.anon

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
  
  @scala.inline
  def apply(): Chromeos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chromeos]
  }
  
  @scala.inline
  implicit class ChromeosMutableBuilder[Self <: Chromeos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChromeos(value: String): Self = StObject.set(x, "chromeos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeosUndefined: Self = StObject.set(x, "chromeos", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setLinux(value: String): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    @scala.inline
    def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    @scala.inline
    def setWindows(value: String): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
  }
}
