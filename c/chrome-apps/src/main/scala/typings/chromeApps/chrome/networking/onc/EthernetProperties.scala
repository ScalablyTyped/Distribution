package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthernetProperties[M /* <: ManagedObject */] extends StObject {
  
  /** The authentication used by the Ethernet network. Possible values are None and 8021X. */
  var Authentication: js.UndefOr[EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]] = js.undefined
  
  /** Whether the Ethernet network should be connected automatically. */
  var AutoConnect: js.UndefOr[Boolean | ManagedBoolean] = js.undefined
  
  /** Network's EAP settings. Required for 8021X authentication. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
}
object EthernetProperties {
  
  inline def apply[M /* <: ManagedObject */](): EthernetProperties[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EthernetProperties[M]]
  }
  
  extension [Self <: EthernetProperties[?], M /* <: ManagedObject */](x: Self & EthernetProperties[M]) {
    
    inline def setAuthentication(value: EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setAutoConnect(value: Boolean | ManagedBoolean): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    inline def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    inline def setEAP(value: EAPProperties): Self = StObject.set(x, "EAP", value.asInstanceOf[js.Any])
    
    inline def setEAPUndefined: Self = StObject.set(x, "EAP", js.undefined)
  }
}
