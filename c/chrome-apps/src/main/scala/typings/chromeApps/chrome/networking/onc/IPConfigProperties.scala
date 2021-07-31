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
  var Type: js.UndefOr[IPConfigurationType | ManagedType[IPConfigurationType]] = js.undefined
  
  /** The URL for WEb Proxy Auto-Discovery, as reported over DHCP. */
  var WebProxyAutoDiscoveryUrl: js.UndefOr[S] = js.undefined
}
object IPConfigProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, B, S, SL, L](): IPConfigProperties[M, B, S, SL, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPConfigProperties[M, B, S, SL, L]]
  }
  
  @scala.inline
  implicit class IPConfigPropertiesMutableBuilder[Self <: IPConfigProperties[?, ?, ?, ?, ?], M /* <: ManagedObject */, B, S, SL, L] (val x: Self & (IPConfigProperties[M, B, S, SL, L])) extends AnyVal {
    
    @scala.inline
    def setGateway(value: S): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
    
    @scala.inline
    def setIPAddress(value: S): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    @scala.inline
    def setNameServers(value: SL): Self = StObject.set(x, "NameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServersUndefined: Self = StObject.set(x, "NameServers", js.undefined)
    
    @scala.inline
    def setRoutingPrefix(value: L): Self = StObject.set(x, "RoutingPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingPrefixUndefined: Self = StObject.set(x, "RoutingPrefix", js.undefined)
    
    @scala.inline
    def setType(value: IPConfigurationType | ManagedType[IPConfigurationType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setWebProxyAutoDiscoveryUrl(value: S): Self = StObject.set(x, "WebProxyAutoDiscoveryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebProxyAutoDiscoveryUrlUndefined: Self = StObject.set(x, "WebProxyAutoDiscoveryUrl", js.undefined)
  }
}
