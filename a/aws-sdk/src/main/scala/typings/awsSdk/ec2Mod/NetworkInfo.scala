package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfo extends js.Object {
  /**
    * Indicates whether Elastic Network Adapter (ENA) is supported.
    */
  var EnaSupport: js.UndefOr[typings.awsSdk.ec2Mod.EnaSupport] = js.native
  /**
    * The maximum number of IPv4 addresses per network interface.
    */
  var Ipv4AddressesPerInterface: js.UndefOr[MaxIpv4AddrPerInterface] = js.native
  /**
    * The maximum number of IPv6 addresses per network interface.
    */
  var Ipv6AddressesPerInterface: js.UndefOr[MaxIpv6AddrPerInterface] = js.native
  /**
    * Indicates whether IPv6 is supported.
    */
  var Ipv6Supported: js.UndefOr[Ipv6Flag] = js.native
  /**
    * The maximum number of network interfaces for the instance type.
    */
  var MaximumNetworkInterfaces: js.UndefOr[MaxNetworkInterfaces] = js.native
  /**
    * Describes the network performance.
    */
  var NetworkPerformance: js.UndefOr[typings.awsSdk.ec2Mod.NetworkPerformance] = js.native
}

object NetworkInfo {
  @scala.inline
  def apply(
    EnaSupport: EnaSupport = null,
    Ipv4AddressesPerInterface: Int | scala.Double = null,
    Ipv6AddressesPerInterface: Int | scala.Double = null,
    Ipv6Supported: js.UndefOr[scala.Boolean] = js.undefined,
    MaximumNetworkInterfaces: Int | scala.Double = null,
    NetworkPerformance: NetworkPerformance = null
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    if (EnaSupport != null) __obj.updateDynamic("EnaSupport")(EnaSupport.asInstanceOf[js.Any])
    if (Ipv4AddressesPerInterface != null) __obj.updateDynamic("Ipv4AddressesPerInterface")(Ipv4AddressesPerInterface.asInstanceOf[js.Any])
    if (Ipv6AddressesPerInterface != null) __obj.updateDynamic("Ipv6AddressesPerInterface")(Ipv6AddressesPerInterface.asInstanceOf[js.Any])
    if (!js.isUndefined(Ipv6Supported)) __obj.updateDynamic("Ipv6Supported")(Ipv6Supported.asInstanceOf[js.Any])
    if (MaximumNetworkInterfaces != null) __obj.updateDynamic("MaximumNetworkInterfaces")(MaximumNetworkInterfaces.asInstanceOf[js.Any])
    if (NetworkPerformance != null) __obj.updateDynamic("NetworkPerformance")(NetworkPerformance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
}

