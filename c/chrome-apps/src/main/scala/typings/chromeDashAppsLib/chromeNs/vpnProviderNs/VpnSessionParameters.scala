package typings
package chromeDashAppsLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnSessionParameters extends js.Object {
  /**
    * IP address for the VPN interface in CIDR notation.
    * IPv4 is currently the only supported mode.
    */
  var address: java.lang.String
  /**
    * Broadcast address for the VPN interface.
    * (default: deduced from IP address and mask)
    */
  var broadcastAddress: js.UndefOr[java.lang.String] = js.undefined
  /** A list of IPs for the DNS servers. */
  var dnsServers: js.Array[java.lang.String]
  /** A list of search domains. (default: no search domain) */
  var domainSearch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Exclude network traffic to the list of IP blocks in CIDR notation from the tunnel.
    * This can be used to bypass traffic to and from the VPN server.
    * When many rules match a destination, the rule with the longest matching prefix wins.
    * Entries that correspond to the same CIDR block are treated as duplicates.
    * Such duplicates in the collated (exclusionList + inclusionList) list
    * are eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var exclusionList: js.Array[java.lang.String]
  /**
    * Include network traffic to the list of IP blocks in CIDR notation to the tunnel.
    * This parameter can be used to set up a split tunnel.
    * By default no traffic is directed to the tunnel.
    * Adding the entry '0.0.0.0/0' to this list gets all the user traffic redirected to the tunnel.
    * When many rules match a destination, the rule with the longest matching prefix wins.
    * Entries that correspond to the same CIDR block are treated as duplicates.
    * Such duplicates in the collated (exclusionList + inclusionList) list are
    * eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var inclusionList: js.Array[java.lang.String]
  /**
    * MTU setting for the VPN interface (default 1500 bytes).
    * @default '1500'
    */
  var mtu: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @since Chrome 51.
    * Whether or not the VPN extension implements auto-reconnection.
    * If true, the *linkDown*, *linkUp*, *linkChanged*, *suspend*, and *resume*
    * platform messages will be used to signal the respective events.
    *
    * If false, the system will forcibly disconnect the VPN if the network
    * topology changes, and the user will need to reconnect manually.
    *
    * This property is new in Chrome 51; it will generate an exception in
    * earlier versions. try/catch can be used to conditionally enable the
    * feature based on browser support.
    * @default false
    */
  var reconnect: scala.Boolean
}

object VpnSessionParameters {
  @scala.inline
  def apply(
    address: java.lang.String,
    dnsServers: js.Array[java.lang.String],
    exclusionList: js.Array[java.lang.String],
    inclusionList: js.Array[java.lang.String],
    reconnect: scala.Boolean,
    broadcastAddress: java.lang.String = null,
    domainSearch: js.Array[java.lang.String] = null,
    mtu: java.lang.String = null
  ): VpnSessionParameters = {
    val __obj = js.Dynamic.literal(address = address, dnsServers = dnsServers, exclusionList = exclusionList, inclusionList = inclusionList, reconnect = reconnect)
    if (broadcastAddress != null) __obj.updateDynamic("broadcastAddress")(broadcastAddress)
    if (domainSearch != null) __obj.updateDynamic("domainSearch")(domainSearch)
    if (mtu != null) __obj.updateDynamic("mtu")(mtu)
    __obj.asInstanceOf[VpnSessionParameters]
  }
}

