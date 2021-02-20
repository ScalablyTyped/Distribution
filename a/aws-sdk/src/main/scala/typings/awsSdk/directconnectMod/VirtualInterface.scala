package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualInterface extends StObject {
  
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.native
  
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.native
  
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration. The valid values are 1-2147483647.
    */
  var asn: js.UndefOr[ASN] = js.native
  
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.native
  
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  
  /**
    * The BGP peers configured on this virtual interface.
    */
  var bgpPeers: js.UndefOr[BGPPeerList] = js.native
  
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
  
  /**
    * The customer router configuration.
    */
  var customerRouterConfig: js.UndefOr[RouterConfig] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.native
  
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.native
  
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.native
  
  /**
    * The ID of the AWS account that owns the virtual interface.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The AWS Region where the virtual interface is located.
    */
  var region: js.UndefOr[Region] = js.native
  
  /**
    * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
    */
  var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * The tags associated with the virtual interface.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the virtual private gateway. Applies only to private virtual interfaces.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
  
  /**
    * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The following are valid characters: a-z, 0-9 and a hyphen (-).
    */
  var virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.native
  
  /**
    * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.    unknown: The state of the virtual interface is not available.  
    */
  var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.native
  
  /**
    * The type of virtual interface. The possible values are private and public.
    */
  var virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.native
  
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.native
}
object VirtualInterface {
  
  @scala.inline
  def apply(): VirtualInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterface]
  }
  
  @scala.inline
  implicit class VirtualInterfaceMutableBuilder[Self <: VirtualInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressFamily(value: AddressFamily): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
    
    @scala.inline
    def setAmazonAddress(value: AmazonAddress): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
    
    @scala.inline
    def setAmazonSideAsn(value: LongAsn): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
    
    @scala.inline
    def setAsn(value: ASN): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    @scala.inline
    def setAuthKey(value: BGPAuthKey): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    @scala.inline
    def setAwsDeviceV2(value: AwsDeviceV2): Self = StObject.set(x, "awsDeviceV2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsDeviceV2Undefined: Self = StObject.set(x, "awsDeviceV2", js.undefined)
    
    @scala.inline
    def setBgpPeers(value: BGPPeerList): Self = StObject.set(x, "bgpPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeersUndefined: Self = StObject.set(x, "bgpPeers", js.undefined)
    
    @scala.inline
    def setBgpPeersVarargs(value: BGPPeer*): Self = StObject.set(x, "bgpPeers", js.Array(value :_*))
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    @scala.inline
    def setCustomerAddress(value: CustomerAddress): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
    
    @scala.inline
    def setCustomerRouterConfig(value: RouterConfig): Self = StObject.set(x, "customerRouterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerRouterConfigUndefined: Self = StObject.set(x, "customerRouterConfig", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setJumboFrameCapable(value: JumboFrameCapable): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMtu(value: MTU): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRouteFilterPrefixes(value: RouteFilterPrefixList): Self = StObject.set(x, "routeFilterPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteFilterPrefixesUndefined: Self = StObject.set(x, "routeFilterPrefixes", js.undefined)
    
    @scala.inline
    def setRouteFilterPrefixesVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "routeFilterPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = StObject.set(x, "virtualGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayIdUndefined: Self = StObject.set(x, "virtualGatewayId", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceName(value: VirtualInterfaceName): Self = StObject.set(x, "virtualInterfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceNameUndefined: Self = StObject.set(x, "virtualInterfaceName", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceState(value: VirtualInterfaceState): Self = StObject.set(x, "virtualInterfaceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceStateUndefined: Self = StObject.set(x, "virtualInterfaceState", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceType(value: VirtualInterfaceType): Self = StObject.set(x, "virtualInterfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceTypeUndefined: Self = StObject.set(x, "virtualInterfaceType", js.undefined)
    
    @scala.inline
    def setVlan(value: VLAN): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
  }
}
