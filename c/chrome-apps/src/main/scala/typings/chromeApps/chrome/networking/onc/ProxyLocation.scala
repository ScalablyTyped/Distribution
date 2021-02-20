package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyLocation extends StObject {
  
  /** The proxy IP address host. */
  var Host: js.UndefOr[String] = js.native
  
  /** The port to use for the proxy */
  var Port: js.UndefOr[integer] = js.native
}
object ProxyLocation {
  
  @scala.inline
  def apply(): ProxyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyLocation]
  }
  
  @scala.inline
  implicit class ProxyLocationMutableBuilder[Self <: ProxyLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    @scala.inline
    def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
