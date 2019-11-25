package typings.chromeDashApps.chrome.vpnProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnSessionParameters extends js.Object {
  /**
    * IP address for the VPN interface in CIDR notation.
    * IPv4 is currently the only supported mode.
    */
  var address: String
  /**
    * Broadcast address for the VPN interface.
    * (default: deduced from IP address and mask)
    */
  var broadcastAddress: js.UndefOr[String] = js.undefined
  /** A list of IPs for the DNS servers. */
  var dnsServers: js.Array[String]
  /** A list of search domains. (default: no search domain) */
  var domainSearch: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Exclude network traffic to the list of IP blocks in CIDR notation from the tunnel.
    * This can be used to bypass traffic to and from the VPN server.
    * When many rules match a destination, the rule with the longest matching prefix wins.
    * Entries that correspond to the same CIDR block are treated as duplicates.
    * Such duplicates in the collated (exclusionList + inclusionList) list
    * are eliminated and the exact duplicate entry that will be eliminated is undefined.
    */
  var exclusionList: js.Array[String]
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
  var inclusionList: js.Array[String]
  /**
    * MTU setting for the VPN interface (default 1500 bytes).
    * @default '1500'
    */
  var mtu: js.UndefOr[String] = js.undefined
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
  var reconnect: Boolean
}

object VpnSessionParameters {
  @scala.inline
  def apply(
    address: String,
    dnsServers: js.Array[String],
    exclusionList: js.Array[String],
    inclusionList: js.Array[String],
    reconnect: Boolean,
    broadcastAddress: String = null,
    domainSearch: js.Array[String] = null,
    mtu: String = null
  ): VpnSessionParameters = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dnsServers = dnsServers.asInstanceOf[js.Any], exclusionList = exclusionList.asInstanceOf[js.Any], inclusionList = inclusionList.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any])
    if (broadcastAddress != null) __obj.updateDynamic("broadcastAddress")(broadcastAddress.asInstanceOf[js.Any])
    if (domainSearch != null) __obj.updateDynamic("domainSearch")(domainSearch.asInstanceOf[js.Any])
    if (mtu != null) __obj.updateDynamic("mtu")(mtu.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnSessionParameters]
  }
}

