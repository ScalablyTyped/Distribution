package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBGPPeerRequest extends StObject {
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: js.UndefOr[ASN] = js.undefined
  
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined
  
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}
object DeleteBGPPeerRequest {
  
  inline def apply(): DeleteBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBGPPeerRequest]
  }
  
  extension [Self <: DeleteBGPPeerRequest](x: Self) {
    
    inline def setAsn(value: ASN): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    inline def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    inline def setBgpPeerId(value: BGPPeerId): Self = StObject.set(x, "bgpPeerId", value.asInstanceOf[js.Any])
    
    inline def setBgpPeerIdUndefined: Self = StObject.set(x, "bgpPeerId", js.undefined)
    
    inline def setCustomerAddress(value: CustomerAddress): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
    
    inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
