package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGatewayVirtualInterface extends StObject {
  
  /**
    * The local address.
    */
  var LocalAddress: js.UndefOr[String] = js.native
  
  /**
    * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
    */
  var LocalBgpAsn: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the virtual interface.
    */
  var LocalGatewayVirtualInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceId] = js.native
  
  /**
    * The AWS account ID that owns the local gateway virtual interface.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The peer address.
    */
  var PeerAddress: js.UndefOr[String] = js.native
  
  /**
    * The peer BGP ASN.
    */
  var PeerBgpAsn: js.UndefOr[Integer] = js.native
  
  /**
    * The tags assigned to the virtual interface.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VLAN.
    */
  var Vlan: js.UndefOr[Integer] = js.native
}
object LocalGatewayVirtualInterface {
  
  @scala.inline
  def apply(): LocalGatewayVirtualInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayVirtualInterface]
  }
  
  @scala.inline
  implicit class LocalGatewayVirtualInterfaceMutableBuilder[Self <: LocalGatewayVirtualInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalAddress(value: String): Self = StObject.set(x, "LocalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddressUndefined: Self = StObject.set(x, "LocalAddress", js.undefined)
    
    @scala.inline
    def setLocalBgpAsn(value: Integer): Self = StObject.set(x, "LocalBgpAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalBgpAsnUndefined: Self = StObject.set(x, "LocalBgpAsn", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceId(value: LocalGatewayVirtualInterfaceId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIdUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPeerAddress(value: String): Self = StObject.set(x, "PeerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerAddressUndefined: Self = StObject.set(x, "PeerAddress", js.undefined)
    
    @scala.inline
    def setPeerBgpAsn(value: Integer): Self = StObject.set(x, "PeerBgpAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerBgpAsnUndefined: Self = StObject.set(x, "PeerBgpAsn", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVlan(value: Integer): Self = StObject.set(x, "Vlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlanUndefined: Self = StObject.set(x, "Vlan", js.undefined)
  }
}
