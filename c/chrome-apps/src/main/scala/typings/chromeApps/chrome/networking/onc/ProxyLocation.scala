package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyLocation extends StObject {
  
  /** The proxy IP address host. */
  var Host: js.UndefOr[String] = js.undefined
  
  /** The port to use for the proxy */
  var Port: js.UndefOr[integer] = js.undefined
}
object ProxyLocation {
  
  inline def apply(): ProxyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyLocation]
  }
  
  extension [Self <: ProxyLocation](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
