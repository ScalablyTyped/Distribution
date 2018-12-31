package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

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

