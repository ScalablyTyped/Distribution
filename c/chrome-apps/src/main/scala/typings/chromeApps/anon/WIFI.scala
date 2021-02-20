package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.WiFi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WIFI extends StObject {
  
  var WI_FI: WiFi = js.native
}
object WIFI {
  
  @scala.inline
  def apply(WI_FI: WiFi): WIFI = {
    val __obj = js.Dynamic.literal(WI_FI = WI_FI.asInstanceOf[js.Any])
    __obj.asInstanceOf[WIFI]
  }
  
  @scala.inline
  implicit class WIFIMutableBuilder[Self <: WIFI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWI_FI(value: WiFi): Self = StObject.set(x, "WI_FI", value.asInstanceOf[js.Any])
  }
}
