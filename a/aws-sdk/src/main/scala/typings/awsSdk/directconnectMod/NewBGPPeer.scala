package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewBGPPeer extends js.Object {
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
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
}

object NewBGPPeer {
  @scala.inline
  def apply(): NewBGPPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewBGPPeer]
  }
  @scala.inline
  implicit class NewBGPPeerOps[Self <: NewBGPPeer] (val x: Self) extends AnyVal {
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
    def setCustomerAddress(value: CustomerAddress): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
  }
  
}

