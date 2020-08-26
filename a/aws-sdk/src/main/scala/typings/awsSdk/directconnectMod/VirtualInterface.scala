package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualInterface extends js.Object {
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
  implicit class VirtualInterfaceOps[Self <: VirtualInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressFamily(value: AddressFamily): Self = this.set("addressFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressFamily: Self = this.set("addressFamily", js.undefined)
    @scala.inline
    def setAmazonAddress(value: AmazonAddress): Self = this.set("amazonAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazonAddress: Self = this.set("amazonAddress", js.undefined)
    @scala.inline
    def setAmazonSideAsn(value: LongAsn): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("amazonSideAsn", js.undefined)
    @scala.inline
    def setAsn(value: ASN): Self = this.set("asn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsn: Self = this.set("asn", js.undefined)
    @scala.inline
    def setAuthKey(value: BGPAuthKey): Self = this.set("authKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    @scala.inline
    def setAwsDeviceV2(value: AwsDeviceV2): Self = this.set("awsDeviceV2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsDeviceV2: Self = this.set("awsDeviceV2", js.undefined)
    @scala.inline
    def setBgpPeersVarargs(value: BGPPeer*): Self = this.set("bgpPeers", js.Array(value :_*))
    @scala.inline
    def setBgpPeers(value: BGPPeerList): Self = this.set("bgpPeers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeers: Self = this.set("bgpPeers", js.undefined)
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    @scala.inline
    def setCustomerAddress(value: CustomerAddress): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
    @scala.inline
    def setCustomerRouterConfig(value: RouterConfig): Self = this.set("customerRouterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerRouterConfig: Self = this.set("customerRouterConfig", js.undefined)
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectConnectGatewayId: Self = this.set("directConnectGatewayId", js.undefined)
    @scala.inline
    def setJumboFrameCapable(value: JumboFrameCapable): Self = this.set("jumboFrameCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumboFrameCapable: Self = this.set("jumboFrameCapable", js.undefined)
    @scala.inline
    def setLocation(value: LocationCode): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMtu(value: MTU): Self = this.set("mtu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtu: Self = this.set("mtu", js.undefined)
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRouteFilterPrefixesVarargs(value: RouteFilterPrefix*): Self = this.set("routeFilterPrefixes", js.Array(value :_*))
    @scala.inline
    def setRouteFilterPrefixes(value: RouteFilterPrefixList): Self = this.set("routeFilterPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteFilterPrefixes: Self = this.set("routeFilterPrefixes", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = this.set("virtualGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualGatewayId: Self = this.set("virtualGatewayId", js.undefined)
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceId: Self = this.set("virtualInterfaceId", js.undefined)
    @scala.inline
    def setVirtualInterfaceName(value: VirtualInterfaceName): Self = this.set("virtualInterfaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceName: Self = this.set("virtualInterfaceName", js.undefined)
    @scala.inline
    def setVirtualInterfaceState(value: VirtualInterfaceState): Self = this.set("virtualInterfaceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceState: Self = this.set("virtualInterfaceState", js.undefined)
    @scala.inline
    def setVirtualInterfaceType(value: VirtualInterfaceType): Self = this.set("virtualInterfaceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceType: Self = this.set("virtualInterfaceType", js.undefined)
    @scala.inline
    def setVlan(value: VLAN): Self = this.set("vlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVlan: Self = this.set("vlan", js.undefined)
  }
  
}

