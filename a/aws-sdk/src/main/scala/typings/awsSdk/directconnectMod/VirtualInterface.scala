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
    * The name of the virtual interface assigned by the customer network.
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
  def apply(
    addressFamily: AddressFamily = null,
    amazonAddress: AmazonAddress = null,
    amazonSideAsn: js.UndefOr[LongAsn] = js.undefined,
    asn: js.UndefOr[ASN] = js.undefined,
    authKey: BGPAuthKey = null,
    awsDeviceV2: AwsDeviceV2 = null,
    bgpPeers: BGPPeerList = null,
    connectionId: ConnectionId = null,
    customerAddress: CustomerAddress = null,
    customerRouterConfig: RouterConfig = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
    location: LocationCode = null,
    mtu: js.UndefOr[MTU] = js.undefined,
    ownerAccount: OwnerAccount = null,
    region: Region = null,
    routeFilterPrefixes: RouteFilterPrefixList = null,
    tags: TagList = null,
    virtualGatewayId: VirtualGatewayId = null,
    virtualInterfaceId: VirtualInterfaceId = null,
    virtualInterfaceName: VirtualInterfaceName = null,
    virtualInterfaceState: VirtualInterfaceState = null,
    virtualInterfaceType: VirtualInterfaceType = null,
    vlan: js.UndefOr[VLAN] = js.undefined
  ): VirtualInterface = {
    val __obj = js.Dynamic.literal()
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(amazonSideAsn)) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asn)) __obj.updateDynamic("asn")(asn.get.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (awsDeviceV2 != null) __obj.updateDynamic("awsDeviceV2")(awsDeviceV2.asInstanceOf[js.Any])
    if (bgpPeers != null) __obj.updateDynamic("bgpPeers")(bgpPeers.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (customerRouterConfig != null) __obj.updateDynamic("customerRouterConfig")(customerRouterConfig.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(jumboFrameCapable)) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(mtu)) __obj.updateDynamic("mtu")(mtu.get.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (routeFilterPrefixes != null) __obj.updateDynamic("routeFilterPrefixes")(routeFilterPrefixes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    if (virtualInterfaceName != null) __obj.updateDynamic("virtualInterfaceName")(virtualInterfaceName.asInstanceOf[js.Any])
    if (virtualInterfaceState != null) __obj.updateDynamic("virtualInterfaceState")(virtualInterfaceState.asInstanceOf[js.Any])
    if (virtualInterfaceType != null) __obj.updateDynamic("virtualInterfaceType")(virtualInterfaceType.asInstanceOf[js.Any])
    if (!js.isUndefined(vlan)) __obj.updateDynamic("vlan")(vlan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualInterface]
  }
}

