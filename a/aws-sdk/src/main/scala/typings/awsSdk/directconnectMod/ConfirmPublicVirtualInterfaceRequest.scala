package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object ConfirmPublicVirtualInterfaceRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): ConfirmPublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPublicVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class ConfirmPublicVirtualInterfaceRequestOps[Self <: ConfirmPublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
  }
  
}

