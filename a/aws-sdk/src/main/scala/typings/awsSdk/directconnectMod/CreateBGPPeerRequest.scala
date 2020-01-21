package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBGPPeerRequest extends js.Object {
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
  def apply(newBGPPeer: NewBGPPeer = null, virtualInterfaceId: VirtualInterfaceId = null): CreateBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    if (newBGPPeer != null) __obj.updateDynamic("newBGPPeer")(newBGPPeer.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBGPPeerRequest]
  }
}

