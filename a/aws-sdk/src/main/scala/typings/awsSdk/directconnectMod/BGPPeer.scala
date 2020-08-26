package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BGPPeer extends js.Object {
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.native
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: js.UndefOr[ASN] = js.native
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.native
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.native
  /**
    * The state of the BGP peer. The following are the possible values:    verifying: The BGP peering addresses or ASN require validation before the BGP peer can be created. This state applies only to public virtual interfaces.    pending: The BGP peer is created, and remains in this state until it is ready to be established.    available: The BGP peer is ready to be established.    deleting: The BGP peer is being deleted.    deleted: The BGP peer is deleted and cannot be established.  
    */
  var bgpPeerState: js.UndefOr[BGPPeerState] = js.native
  /**
    * The status of the BGP peer. The following are the possible values:    up: The BGP peer is established. This state does not indicate the state of the routing function. Ensure that you are receiving routes over the BGP session.    down: The BGP peer is down.    unknown: The BGP peer status is not available.  
    */
  var bgpStatus: js.UndefOr[BGPStatus] = js.native
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
}

object BGPPeer {
  @scala.inline
  def apply(): BGPPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BGPPeer]
  }
  @scala.inline
  implicit class BGPPeerOps[Self <: BGPPeer] (val x: Self) extends AnyVal {
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
    def setBgpPeerId(value: BGPPeerId): Self = this.set("bgpPeerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeerId: Self = this.set("bgpPeerId", js.undefined)
    @scala.inline
    def setBgpPeerState(value: BGPPeerState): Self = this.set("bgpPeerState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeerState: Self = this.set("bgpPeerState", js.undefined)
    @scala.inline
    def setBgpStatus(value: BGPStatus): Self = this.set("bgpStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpStatus: Self = this.set("bgpStatus", js.undefined)
    @scala.inline
    def setCustomerAddress(value: CustomerAddress): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
  }
  
}

