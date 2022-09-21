package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualInterface extends StObject {
  
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.undefined
  
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
  
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration. The valid values are 1-2147483647.
    */
  var asn: js.UndefOr[ASN] = js.undefined
  
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.undefined
  
  /**
    * The Direct Connect endpoint that terminates the physical connection.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  
  /**
    * The Direct Connect endpoint that terminates the logical connection. This device might be different than the device that terminates the physical connection.
    */
  var awsLogicalDeviceId: js.UndefOr[AwsLogicalDeviceId] = js.undefined
  
  /**
    * The BGP peers configured on this virtual interface.
    */
  var bgpPeers: js.UndefOr[BGPPeerList] = js.undefined
  
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  
  /**
    * The customer router configuration.
    */
  var customerRouterConfig: js.UndefOr[RouterConfig] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
  
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.undefined
  
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the virtual interface.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The Amazon Web Services Region where the virtual interface is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The routes to be advertised to the Amazon Web Services network in this Region. Applies to public virtual interfaces.
    */
  var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined
  
  /**
    * Indicates whether SiteLink is enabled.
    */
  var siteLinkEnabled: js.UndefOr[SiteLinkEnabled] = js.undefined
  
  /**
    * The tags associated with the virtual interface.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the virtual private gateway. Applies only to private virtual interfaces.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
  
  /**
    * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The following are valid characters: a-z, 0-9 and a hyphen (-).
    */
  var virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
  
  /**
    * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.    unknown: The state of the virtual interface is not available.  
    */
  var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
  
  /**
    * The type of virtual interface. The possible values are private and public.
    */
  var virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.undefined
  
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.undefined
}
object VirtualInterface {
  
  inline def apply(): VirtualInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterface]
  }
  
  extension [Self <: VirtualInterface](x: Self) {
    
    inline def setAddressFamily(value: AddressFamily): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
    
    inline def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
    
    inline def setAmazonAddress(value: AmazonAddress): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
    
    inline def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
    
    inline def setAmazonSideAsn(value: LongAsn): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
    
    inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
    
    inline def setAsn(value: ASN): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    inline def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    inline def setAuthKey(value: BGPAuthKey): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    inline def setAwsDeviceV2(value: AwsDeviceV2): Self = StObject.set(x, "awsDeviceV2", value.asInstanceOf[js.Any])
    
    inline def setAwsDeviceV2Undefined: Self = StObject.set(x, "awsDeviceV2", js.undefined)
    
    inline def setAwsLogicalDeviceId(value: AwsLogicalDeviceId): Self = StObject.set(x, "awsLogicalDeviceId", value.asInstanceOf[js.Any])
    
    inline def setAwsLogicalDeviceIdUndefined: Self = StObject.set(x, "awsLogicalDeviceId", js.undefined)
    
    inline def setBgpPeers(value: BGPPeerList): Self = StObject.set(x, "bgpPeers", value.asInstanceOf[js.Any])
    
    inline def setBgpPeersUndefined: Self = StObject.set(x, "bgpPeers", js.undefined)
    
    inline def setBgpPeersVarargs(value: BGPPeer*): Self = StObject.set(x, "bgpPeers", js.Array(value*))
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setCustomerAddress(value: CustomerAddress): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
    
    inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
    
    inline def setCustomerRouterConfig(value: RouterConfig): Self = StObject.set(x, "customerRouterConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomerRouterConfigUndefined: Self = StObject.set(x, "customerRouterConfig", js.undefined)
    
    inline def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    inline def setJumboFrameCapable(value: JumboFrameCapable): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
    
    inline def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
    
    inline def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMtu(value: MTU): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    inline def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRouteFilterPrefixes(value: RouteFilterPrefixList): Self = StObject.set(x, "routeFilterPrefixes", value.asInstanceOf[js.Any])
    
    inline def setRouteFilterPrefixesUndefined: Self = StObject.set(x, "routeFilterPrefixes", js.undefined)
    
    inline def setRouteFilterPrefixesVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "routeFilterPrefixes", js.Array(value*))
    
    inline def setSiteLinkEnabled(value: SiteLinkEnabled): Self = StObject.set(x, "siteLinkEnabled", value.asInstanceOf[js.Any])
    
    inline def setSiteLinkEnabledUndefined: Self = StObject.set(x, "siteLinkEnabled", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVirtualGatewayId(value: VirtualGatewayId): Self = StObject.set(x, "virtualGatewayId", value.asInstanceOf[js.Any])
    
    inline def setVirtualGatewayIdUndefined: Self = StObject.set(x, "virtualGatewayId", js.undefined)
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    
    inline def setVirtualInterfaceName(value: VirtualInterfaceName): Self = StObject.set(x, "virtualInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceNameUndefined: Self = StObject.set(x, "virtualInterfaceName", js.undefined)
    
    inline def setVirtualInterfaceState(value: VirtualInterfaceState): Self = StObject.set(x, "virtualInterfaceState", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceStateUndefined: Self = StObject.set(x, "virtualInterfaceState", js.undefined)
    
    inline def setVirtualInterfaceType(value: VirtualInterfaceType): Self = StObject.set(x, "virtualInterfaceType", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceTypeUndefined: Self = StObject.set(x, "virtualInterfaceType", js.undefined)
    
    inline def setVlan(value: VLAN): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    
    inline def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
  }
}
