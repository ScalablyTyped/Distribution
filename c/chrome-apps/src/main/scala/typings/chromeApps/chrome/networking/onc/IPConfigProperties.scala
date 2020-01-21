package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPConfigProperties[M /* <: ManagedObject */, B, S, SL, L] extends js.Object {
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
  def apply[M /* <: ManagedObject */, B, S, SL, L](
    Gateway: S = null,
    IPAddress: S = null,
    NameServers: SL = null,
    RoutingPrefix: L = null,
    Type: IPConfigurationType | ManagedType[IPConfigurationType] = null,
    WebProxyAutoDiscoveryUrl: S = null
  ): IPConfigProperties[M, B, S, SL, L] = {
    val __obj = js.Dynamic.literal()
    if (Gateway != null) __obj.updateDynamic("Gateway")(Gateway.asInstanceOf[js.Any])
    if (IPAddress != null) __obj.updateDynamic("IPAddress")(IPAddress.asInstanceOf[js.Any])
    if (NameServers != null) __obj.updateDynamic("NameServers")(NameServers.asInstanceOf[js.Any])
    if (RoutingPrefix != null) __obj.updateDynamic("RoutingPrefix")(RoutingPrefix.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WebProxyAutoDiscoveryUrl != null) __obj.updateDynamic("WebProxyAutoDiscoveryUrl")(WebProxyAutoDiscoveryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPConfigProperties[M, B, S, SL, L]]
  }
}

