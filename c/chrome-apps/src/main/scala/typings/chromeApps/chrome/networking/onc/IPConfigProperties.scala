package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPConfigProperties[M /* <: ManagedObject */, B, S, SL, L] extends js.Object {
  
  /** Gateway address used for the IP configuration. */
  var Gateway: js.UndefOr[S] = js.native
  
  /** The IP address for a connection. Can be IPv4 or IPv6 address, depending on value of Type. */
  var IPAddress: js.UndefOr[S] = js.native
  
  /** Array of addresses used for name servers. */
  var NameServers: js.UndefOr[SL] = js.native
  
  /** The routing prefix. */
  var RoutingPrefix: js.UndefOr[L] = js.native
  
  /** The IP configuration type. Can be IPv4 or IPv6. */
  var Type: js.UndefOr[IPConfigurationType | ManagedType[IPConfigurationType]] = js.native
  
  /** The URL for WEb Proxy Auto-Discovery, as reported over DHCP. */
  var WebProxyAutoDiscoveryUrl: js.UndefOr[S] = js.native
}
object IPConfigProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, B, S, SL, L](): IPConfigProperties[M, B, S, SL, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPConfigProperties[M, B, S, SL, L]]
  }
  
  @scala.inline
  implicit class IPConfigPropertiesOps[Self <: IPConfigProperties[_, _, _, _, _], M /* <: ManagedObject */, B, S, SL, L] (val x: Self with (IPConfigProperties[M, B, S, SL, L])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGateway(value: S): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGateway: Self = this.set("Gateway", js.undefined)
    
    @scala.inline
    def setIPAddress(value: S): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAddress: Self = this.set("IPAddress", js.undefined)
    
    @scala.inline
    def setNameServers(value: SL): Self = this.set("NameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServers: Self = this.set("NameServers", js.undefined)
    
    @scala.inline
    def setRoutingPrefix(value: L): Self = this.set("RoutingPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingPrefix: Self = this.set("RoutingPrefix", js.undefined)
    
    @scala.inline
    def setType(value: IPConfigurationType | ManagedType[IPConfigurationType]): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setWebProxyAutoDiscoveryUrl(value: S): Self = this.set("WebProxyAutoDiscoveryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebProxyAutoDiscoveryUrl: Self = this.set("WebProxyAutoDiscoveryUrl", js.undefined)
  }
}
