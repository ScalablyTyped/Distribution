package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewBGPPeer extends StObject {
  
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
  implicit class NewBGPPeerMutableBuilder[Self <: NewBGPPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressFamily(value: AddressFamily): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
    
    @scala.inline
    def setAmazonAddress(value: AmazonAddress): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
    
    @scala.inline
    def setAsn(value: ASN): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    @scala.inline
    def setAuthKey(value: BGPAuthKey): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    @scala.inline
    def setCustomerAddress(value: CustomerAddress): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
  }
}
