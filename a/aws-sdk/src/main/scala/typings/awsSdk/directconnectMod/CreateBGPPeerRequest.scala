package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBGPPeerRequest extends StObject {
  
  /**
    * Information about the BGP peer.
    */
  var newBGPPeer: js.UndefOr[NewBGPPeer] = js.native
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}
object CreateBGPPeerRequest {
  
  @scala.inline
  def apply(): CreateBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBGPPeerRequest]
  }
  
  @scala.inline
  implicit class CreateBGPPeerRequestMutableBuilder[Self <: CreateBGPPeerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewBGPPeer(value: NewBGPPeer): Self = StObject.set(x, "newBGPPeer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewBGPPeerUndefined: Self = StObject.set(x, "newBGPPeer", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
