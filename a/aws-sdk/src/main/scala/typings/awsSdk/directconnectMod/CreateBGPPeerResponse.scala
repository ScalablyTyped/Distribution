package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBGPPeerResponse extends js.Object {
  /**
    * The virtual interface.
    */
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}

object CreateBGPPeerResponse {
  @scala.inline
  def apply(): CreateBGPPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBGPPeerResponse]
  }
  @scala.inline
  implicit class CreateBGPPeerResponseOps[Self <: CreateBGPPeerResponse] (val x: Self) extends AnyVal {
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
    def setVirtualInterface(value: VirtualInterface): Self = this.set("virtualInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterface: Self = this.set("virtualInterface", js.undefined)
  }
  
}

