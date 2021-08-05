package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BGPPeer extends StObject {
  
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.undefined
  
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.undefined
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: js.UndefOr[ASN] = js.undefined
  
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.undefined
  
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined
  
  /**
    * The state of the BGP peer. The following are the possible values:    verifying: The BGP peering addresses or ASN require validation before the BGP peer can be created. This state applies only to public virtual interfaces.    pending: The BGP peer is created, and remains in this state until it is ready to be established.    available: The BGP peer is ready to be established.    deleting: The BGP peer is being deleted.    deleted: The BGP peer is deleted and cannot be established.  
    */
  var bgpPeerState: js.UndefOr[BGPPeerState] = js.undefined
  
  /**
    * The status of the BGP peer. The following are the possible values:    up: The BGP peer is established. This state does not indicate the state of the routing function. Ensure that you are receiving routes over the BGP session.    down: The BGP peer is down.    unknown: The BGP peer status is not available.  
    */
  var bgpStatus: js.UndefOr[BGPStatus] = js.undefined
  
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
}
object BGPPeer {
  
  inline def apply(): BGPPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BGPPeer]
  }
  
  extension [Self <: BGPPeer](x: Self) {
    
    inline def setAddressFamily(value: AddressFamily): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
    
    inline def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
    
    inline def setAmazonAddress(value: AmazonAddress): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
    
    inline def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
    
    inline def setAsn(value: ASN): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    inline def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    inline def setAuthKey(value: BGPAuthKey): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    inline def setAwsDeviceV2(value: AwsDeviceV2): Self = StObject.set(x, "awsDeviceV2", value.asInstanceOf[js.Any])
    
    inline def setAwsDeviceV2Undefined: Self = StObject.set(x, "awsDeviceV2", js.undefined)
    
    inline def setBgpPeerId(value: BGPPeerId): Self = StObject.set(x, "bgpPeerId", value.asInstanceOf[js.Any])
    
    inline def setBgpPeerIdUndefined: Self = StObject.set(x, "bgpPeerId", js.undefined)
    
    inline def setBgpPeerState(value: BGPPeerState): Self = StObject.set(x, "bgpPeerState", value.asInstanceOf[js.Any])
    
    inline def setBgpPeerStateUndefined: Self = StObject.set(x, "bgpPeerState", js.undefined)
    
    inline def setBgpStatus(value: BGPStatus): Self = StObject.set(x, "bgpStatus", value.asInstanceOf[js.Any])
    
    inline def setBgpStatusUndefined: Self = StObject.set(x, "bgpStatus", js.undefined)
    
    inline def setCustomerAddress(value: CustomerAddress): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
    
    inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
  }
}
