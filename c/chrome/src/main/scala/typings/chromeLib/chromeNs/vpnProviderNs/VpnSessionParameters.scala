package typings
package chromeLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnSessionParameters extends js.Object {
  /** IP address for the VPN interface in CIDR notation. IPv4 is currently the only supported mode. */
  var address: java.lang.String
  /** Optional. Broadcast address for the VPN interface. (default: deduced from IP address and mask) */
  var broadcastAddress: js.UndefOr[java.lang.String] = js.undefined
  /** A list of IPs for the DNS servers. */
  var dnsServer: js.Array[java.lang.String]
  /** Optional. A list of search domains. (default: no search domain) */
  var domainSearch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Exclude network traffic to the list of IP blocks in CIDR notation from the tunnel. This can be used to bypass traffic to and from the VPN server. When many rules match a destination, the rule with the longest matching prefix wins. Entries that correspond to the same CIDR block are treated as duplicates. Such duplicates in the collated (exclusionList + inclusionList) list are eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var exclusionList: js.Array[java.lang.String]
  /**
    * Include network traffic to the list of IP blocks in CIDR notation to the tunnel. This parameter can be used to set up a split tunnel. By default no traffic is directed to the tunnel. Adding the entry "0.0.0.0/0" to this list gets all the user traffic redirected to the tunnel. When many rules match a destination, the rule with the longest matching prefix wins. Entries that correspond to the same CIDR block are treated as duplicates. Such duplicates in the collated (exclusionList + inclusionList) list are eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var inclusionList: js.Array[java.lang.String]
  /** Optional. MTU setting for the VPN interface. (default: 1500 bytes) */
  var mtu: js.UndefOr[java.lang.String] = js.undefined
}

