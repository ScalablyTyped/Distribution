package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayMulticastDeregisteredGroupMembers extends StObject {
  
  /**
    * The network interface IDs of the deregistered members.
    */
  var DeregisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}
object TransitGatewayMulticastDeregisteredGroupMembers {
  
  @scala.inline
  def apply(): TransitGatewayMulticastDeregisteredGroupMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastDeregisteredGroupMembers]
  }
  
  @scala.inline
  implicit class TransitGatewayMulticastDeregisteredGroupMembersMutableBuilder[Self <: TransitGatewayMulticastDeregisteredGroupMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeregisteredNetworkInterfaceIds(value: ValueStringList): Self = StObject.set(x, "DeregisteredNetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeregisteredNetworkInterfaceIdsUndefined: Self = StObject.set(x, "DeregisteredNetworkInterfaceIds", js.undefined)
    
    @scala.inline
    def setDeregisteredNetworkInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "DeregisteredNetworkInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: String): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayMulticastDomainIdUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainId", js.undefined)
  }
}
