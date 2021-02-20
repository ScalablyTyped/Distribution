package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends StObject {
  
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
  implicit class NetworkInfoMutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultNetworkCardIndex(value: DefaultNetworkCardIndex): Self = StObject.set(x, "DefaultNetworkCardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNetworkCardIndexUndefined: Self = StObject.set(x, "DefaultNetworkCardIndex", js.undefined)
    
    @scala.inline
    def setEfaSupported(value: EfaSupportedFlag): Self = StObject.set(x, "EfaSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEfaSupportedUndefined: Self = StObject.set(x, "EfaSupported", js.undefined)
    
    @scala.inline
    def setEnaSupport(value: EnaSupport): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    @scala.inline
    def setIpv4AddressesPerInterface(value: MaxIpv4AddrPerInterface): Self = StObject.set(x, "Ipv4AddressesPerInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressesPerInterfaceUndefined: Self = StObject.set(x, "Ipv4AddressesPerInterface", js.undefined)
    
    @scala.inline
    def setIpv6AddressesPerInterface(value: MaxIpv6AddrPerInterface): Self = StObject.set(x, "Ipv6AddressesPerInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesPerInterfaceUndefined: Self = StObject.set(x, "Ipv6AddressesPerInterface", js.undefined)
    
    @scala.inline
    def setIpv6Supported(value: Ipv6Flag): Self = StObject.set(x, "Ipv6Supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6SupportedUndefined: Self = StObject.set(x, "Ipv6Supported", js.undefined)
    
    @scala.inline
    def setMaximumNetworkCards(value: MaximumNetworkCards): Self = StObject.set(x, "MaximumNetworkCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNetworkCardsUndefined: Self = StObject.set(x, "MaximumNetworkCards", js.undefined)
    
    @scala.inline
    def setMaximumNetworkInterfaces(value: MaxNetworkInterfaces): Self = StObject.set(x, "MaximumNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNetworkInterfacesUndefined: Self = StObject.set(x, "MaximumNetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkCards(value: NetworkCardInfoList): Self = StObject.set(x, "NetworkCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCardsUndefined: Self = StObject.set(x, "NetworkCards", js.undefined)
    
    @scala.inline
    def setNetworkCardsVarargs(value: NetworkCardInfo*): Self = StObject.set(x, "NetworkCards", js.Array(value :_*))
    
    @scala.inline
    def setNetworkPerformance(value: NetworkPerformance): Self = StObject.set(x, "NetworkPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPerformanceUndefined: Self = StObject.set(x, "NetworkPerformance", js.undefined)
  }
}
