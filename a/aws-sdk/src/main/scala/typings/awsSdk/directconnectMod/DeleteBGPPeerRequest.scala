package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBGPPeerRequest extends StObject {
  
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
  implicit class DeleteBGPPeerRequestMutableBuilder[Self <: DeleteBGPPeerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsn(value: ASN): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    @scala.inline
    def setBgpPeerId(value: BGPPeerId): Self = StObject.set(x, "bgpPeerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeerIdUndefined: Self = StObject.set(x, "bgpPeerId", js.undefined)
    
    @scala.inline
    def setCustomerAddress(value: CustomerAddress): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
