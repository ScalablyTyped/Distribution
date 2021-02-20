package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayMulticastRegisteredGroupSources extends StObject {
  
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the network interfaces members registered with the transit gateway multicast group.
    */
  var RegisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}
object TransitGatewayMulticastRegisteredGroupSources {
  
  @scala.inline
  def apply(): TransitGatewayMulticastRegisteredGroupSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastRegisteredGroupSources]
  }
  
  @scala.inline
  implicit class TransitGatewayMulticastRegisteredGroupSourcesMutableBuilder[Self <: TransitGatewayMulticastRegisteredGroupSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    @scala.inline
    def setRegisteredNetworkInterfaceIds(value: ValueStringList): Self = StObject.set(x, "RegisteredNetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredNetworkInterfaceIdsUndefined: Self = StObject.set(x, "RegisteredNetworkInterfaceIds", js.undefined)
    
    @scala.inline
    def setRegisteredNetworkInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "RegisteredNetworkInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: String): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayMulticastDomainIdUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainId", js.undefined)
  }
}
