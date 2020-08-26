package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfo extends js.Object {
  /**
    * Indicates whether Elastic Fabric Adapter (EFA) is supported.
    */
  var EfaSupported: js.UndefOr[EfaSupportedFlag] = js.native
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
  def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEfaSupported(value: EfaSupportedFlag): Self = this.set("EfaSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEfaSupported: Self = this.set("EfaSupported", js.undefined)
    @scala.inline
    def setEnaSupport(value: EnaSupport): Self = this.set("EnaSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnaSupport: Self = this.set("EnaSupport", js.undefined)
    @scala.inline
    def setIpv4AddressesPerInterface(value: MaxIpv4AddrPerInterface): Self = this.set("Ipv4AddressesPerInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv4AddressesPerInterface: Self = this.set("Ipv4AddressesPerInterface", js.undefined)
    @scala.inline
    def setIpv6AddressesPerInterface(value: MaxIpv6AddrPerInterface): Self = this.set("Ipv6AddressesPerInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6AddressesPerInterface: Self = this.set("Ipv6AddressesPerInterface", js.undefined)
    @scala.inline
    def setIpv6Supported(value: Ipv6Flag): Self = this.set("Ipv6Supported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Supported: Self = this.set("Ipv6Supported", js.undefined)
    @scala.inline
    def setMaximumNetworkInterfaces(value: MaxNetworkInterfaces): Self = this.set("MaximumNetworkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNetworkInterfaces: Self = this.set("MaximumNetworkInterfaces", js.undefined)
    @scala.inline
    def setNetworkPerformance(value: NetworkPerformance): Self = this.set("NetworkPerformance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPerformance: Self = this.set("NetworkPerformance", js.undefined)
  }
  
}

