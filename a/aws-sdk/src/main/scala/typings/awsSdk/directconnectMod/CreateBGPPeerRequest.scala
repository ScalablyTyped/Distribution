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
  def apply(): CreateBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBGPPeerRequest]
  }
  @scala.inline
  implicit class CreateBGPPeerRequestOps[Self <: CreateBGPPeerRequest] (val x: Self) extends AnyVal {
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
    def setNewBGPPeer(value: NewBGPPeer): Self = this.set("newBGPPeer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewBGPPeer: Self = this.set("newBGPPeer", js.undefined)
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceId: Self = this.set("virtualInterfaceId", js.undefined)
  }
  
}

