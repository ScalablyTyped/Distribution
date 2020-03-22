package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayVirtualInterface extends js.Object {
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
  def apply(
    LocalAddress: String = null,
    LocalBgpAsn: Int | scala.Double = null,
    LocalGatewayId: String = null,
    LocalGatewayVirtualInterfaceId: LocalGatewayVirtualInterfaceId = null,
    PeerAddress: String = null,
    PeerBgpAsn: Int | scala.Double = null,
    Tags: TagList = null,
    Vlan: Int | scala.Double = null
  ): LocalGatewayVirtualInterface = {
    val __obj = js.Dynamic.literal()
    if (LocalAddress != null) __obj.updateDynamic("LocalAddress")(LocalAddress.asInstanceOf[js.Any])
    if (LocalBgpAsn != null) __obj.updateDynamic("LocalBgpAsn")(LocalBgpAsn.asInstanceOf[js.Any])
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceId != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceId")(LocalGatewayVirtualInterfaceId.asInstanceOf[js.Any])
    if (PeerAddress != null) __obj.updateDynamic("PeerAddress")(PeerAddress.asInstanceOf[js.Any])
    if (PeerBgpAsn != null) __obj.updateDynamic("PeerBgpAsn")(PeerBgpAsn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Vlan != null) __obj.updateDynamic("Vlan")(Vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayVirtualInterface]
  }
}

