package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.Disconnected_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CONNECTED extends StObject {
  
  var CONNECTED: Connected_
  
  var CONNECTING: Connecting_
  
  var DISCONNECTED: Disconnected_
}
object CONNECTED {
  
  inline def apply(): CONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = "Connected", CONNECTING = "Connecting", DISCONNECTED = "Disconnected")
    __obj.asInstanceOf[CONNECTED]
  }
  
  extension [Self <: CONNECTED](x: Self) {
    
    inline def setCONNECTED(value: Connected_): Self = StObject.set(x, "CONNECTED", value.asInstanceOf[js.Any])
    
    inline def setCONNECTING(value: Connecting_): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
    
    inline def setDISCONNECTED(value: Disconnected_): Self = StObject.set(x, "DISCONNECTED", value.asInstanceOf[js.Any])
  }
}
