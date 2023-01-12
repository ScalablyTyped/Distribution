package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedProxyLocation extends StObject {
  
  /** The proxy IP address host. */
  var Host: js.UndefOr[ManagedDOMString] = js.undefined
  
  /** The port to use for the proxy */
  var Port: js.UndefOr[ManagedLong] = js.undefined
}
object ManagedProxyLocation {
  
  inline def apply(): ManagedProxyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedProxyLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedProxyLocation] (val x: Self) extends AnyVal {
    
    inline def setHost(value: ManagedDOMString): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setPort(value: ManagedLong): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
