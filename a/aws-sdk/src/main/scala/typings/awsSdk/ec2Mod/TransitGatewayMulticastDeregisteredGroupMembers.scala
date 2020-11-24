package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayMulticastDeregisteredGroupMembers extends js.Object {
  
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
  implicit class TransitGatewayMulticastDeregisteredGroupMembersOps[Self <: TransitGatewayMulticastDeregisteredGroupMembers] (val x: Self) extends AnyVal {
    
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
    def setDeregisteredNetworkInterfaceIdsVarargs(value: String*): Self = this.set("DeregisteredNetworkInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setDeregisteredNetworkInterfaceIds(value: ValueStringList): Self = this.set("DeregisteredNetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeregisteredNetworkInterfaceIds: Self = this.set("DeregisteredNetworkInterfaceIds", js.undefined)
    
    @scala.inline
    def setGroupIpAddress(value: String): Self = this.set("GroupIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIpAddress: Self = this.set("GroupIpAddress", js.undefined)
    
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: String): Self = this.set("TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayMulticastDomainId: Self = this.set("TransitGatewayMulticastDomainId", js.undefined)
  }
}
