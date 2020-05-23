package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBGPPeerRequest extends js.Object {
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: js.UndefOr[ASN] = js.native
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.native
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}

object DeleteBGPPeerRequest {
  @scala.inline
  def apply(
    asn: js.UndefOr[ASN] = js.undefined,
    bgpPeerId: BGPPeerId = null,
    customerAddress: CustomerAddress = null,
    virtualInterfaceId: VirtualInterfaceId = null
  ): DeleteBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asn)) __obj.updateDynamic("asn")(asn.get.asInstanceOf[js.Any])
    if (bgpPeerId != null) __obj.updateDynamic("bgpPeerId")(bgpPeerId.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBGPPeerRequest]
  }
}

