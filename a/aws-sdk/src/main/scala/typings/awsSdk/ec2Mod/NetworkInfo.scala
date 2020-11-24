package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends js.Object {
  
  /**
    * The index of the default network card, starting at 0.
    */
  var DefaultNetworkCardIndex: js.UndefOr[typings.awsSdk.ec2Mod.DefaultNetworkCardIndex] = js.native
  
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
    * The maximum number of physical network cards that can be allocated to the instance.
    */
  var MaximumNetworkCards: js.UndefOr[typings.awsSdk.ec2Mod.MaximumNetworkCards] = js.native
  
  /**
    * The maximum number of network interfaces for the instance type.
    */
  var MaximumNetworkInterfaces: js.UndefOr[MaxNetworkInterfaces] = js.native
  
  /**
    * Describes the network cards for the instance type.
    */
  var NetworkCards: js.UndefOr[NetworkCardInfoList] = js.native
  
  /**
    * The network performance.
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
    def setDefaultNetworkCardIndex(value: DefaultNetworkCardIndex): Self = this.set("DefaultNetworkCardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNetworkCardIndex: Self = this.set("DefaultNetworkCardIndex", js.undefined)
    
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
    def setMaximumNetworkCards(value: MaximumNetworkCards): Self = this.set("MaximumNetworkCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumNetworkCards: Self = this.set("MaximumNetworkCards", js.undefined)
    
    @scala.inline
    def setMaximumNetworkInterfaces(value: MaxNetworkInterfaces): Self = this.set("MaximumNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumNetworkInterfaces: Self = this.set("MaximumNetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkCardsVarargs(value: NetworkCardInfo*): Self = this.set("NetworkCards", js.Array(value :_*))
    
    @scala.inline
    def setNetworkCards(value: NetworkCardInfoList): Self = this.set("NetworkCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkCards: Self = this.set("NetworkCards", js.undefined)
    
    @scala.inline
    def setNetworkPerformance(value: NetworkPerformance): Self = this.set("NetworkPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPerformance: Self = this.set("NetworkPerformance", js.undefined)
  }
}
