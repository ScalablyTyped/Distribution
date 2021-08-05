package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.WiFi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WIFI extends StObject {
  
  var WI_FI: WiFi
}
object WIFI {
  
  inline def apply(): WIFI = {
    val __obj = js.Dynamic.literal(WI_FI = "WiFi")
    __obj.asInstanceOf[WIFI]
  }
  
  extension [Self <: WIFI](x: Self) {
    
    inline def setWI_FI(value: WiFi): Self = StObject.set(x, "WI_FI", value.asInstanceOf[js.Any])
  }
}
