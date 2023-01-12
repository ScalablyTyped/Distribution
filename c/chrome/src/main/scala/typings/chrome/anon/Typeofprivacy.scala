package typings.chrome.anon

import typings.chrome.chrome.privacy.Network
import typings.chrome.chrome.privacy.Services
import typings.chrome.chrome.privacy.Websites
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofprivacy extends StObject {
  
  var network: Network
  
  var services: Services
  
  var websites: Websites
}
object Typeofprivacy {
  
  inline def apply(network: Network, services: Services, websites: Websites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprivacy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofprivacy] (val x: Self) extends AnyVal {
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setServices(value: Services): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setWebsites(value: Websites): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
  }
}
