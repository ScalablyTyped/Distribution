package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayMulticastDeregisteredGroupSources extends StObject {
  
  /**
    * The network interface IDs of the non-registered members.
    */
  var DeregisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.undefined
}
object TransitGatewayMulticastDeregisteredGroupSources {
  
  inline def apply(): TransitGatewayMulticastDeregisteredGroupSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastDeregisteredGroupSources]
  }
  
  extension [Self <: TransitGatewayMulticastDeregisteredGroupSources](x: Self) {
    
    inline def setDeregisteredNetworkInterfaceIds(value: ValueStringList): Self = StObject.set(x, "DeregisteredNetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setDeregisteredNetworkInterfaceIdsUndefined: Self = StObject.set(x, "DeregisteredNetworkInterfaceIds", js.undefined)
    
    inline def setDeregisteredNetworkInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "DeregisteredNetworkInterfaceIds", js.Array(value :_*))
    
    inline def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    inline def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    inline def setTransitGatewayMulticastDomainId(value: String): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainIdUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainId", js.undefined)
  }
}
