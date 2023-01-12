package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPConfigProperties[M /* <: ManagedObject */, B, S, SL, L] extends StObject {
  
  /** Gateway address used for the IP configuration. */
  var Gateway: js.UndefOr[S] = js.undefined
  
  /** The IP address for a connection. Can be IPv4 or IPv6 address, depending on value of Type. */
  var IPAddress: js.UndefOr[S] = js.undefined
  
  /** Array of addresses used for name servers. */
  var NameServers: js.UndefOr[SL] = js.undefined
  
  /** The routing prefix. */
  var RoutingPrefix: js.UndefOr[L] = js.undefined
  
  /** The IP configuration type. Can be IPv4 or IPv6. */
  var Type: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedType<chrome-apps.chrome.networking.onc.IPConfigurationType> : chrome-apps.chrome.networking.onc.IPConfigurationType | undefined */ js.Any
  ] = js.undefined
  
  /** The URL for WEb Proxy Auto-Discovery, as reported over DHCP. */
  var WebProxyAutoDiscoveryUrl: js.UndefOr[S] = js.undefined
}
object IPConfigProperties {
  
  inline def apply[M /* <: ManagedObject */, B, S, SL, L](): IPConfigProperties[M, B, S, SL, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPConfigProperties[M, B, S, SL, L]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPConfigProperties[?, ?, ?, ?, ?], M /* <: ManagedObject */, B, S, SL, L] (val x: Self & (IPConfigProperties[M, B, S, SL, L])) extends AnyVal {
    
    inline def setGateway(value: S): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
    
    inline def setIPAddress(value: S): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    inline def setNameServers(value: SL): Self = StObject.set(x, "NameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersUndefined: Self = StObject.set(x, "NameServers", js.undefined)
    
    inline def setRoutingPrefix(value: L): Self = StObject.set(x, "RoutingPrefix", value.asInstanceOf[js.Any])
    
    inline def setRoutingPrefixUndefined: Self = StObject.set(x, "RoutingPrefix", js.undefined)
    
    inline def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedType<chrome-apps.chrome.networking.onc.IPConfigurationType> : chrome-apps.chrome.networking.onc.IPConfigurationType | undefined */ js.Any
    ): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setWebProxyAutoDiscoveryUrl(value: S): Self = StObject.set(x, "WebProxyAutoDiscoveryUrl", value.asInstanceOf[js.Any])
    
    inline def setWebProxyAutoDiscoveryUrlUndefined: Self = StObject.set(x, "WebProxyAutoDiscoveryUrl", js.undefined)
  }
}
