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
  def apply(): DeleteBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBGPPeerRequest]
  }
  @scala.inline
  implicit class DeleteBGPPeerRequestOps[Self <: DeleteBGPPeerRequest] (val x: Self) extends AnyVal {
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
    def setAsn(value: ASN): Self = this.set("asn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsn: Self = this.set("asn", js.undefined)
    @scala.inline
    def setBgpPeerId(value: BGPPeerId): Self = this.set("bgpPeerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeerId: Self = this.set("bgpPeerId", js.undefined)
    @scala.inline
    def setCustomerAddress(value: CustomerAddress): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceId: Self = this.set("virtualInterfaceId", js.undefined)
  }
  
}

