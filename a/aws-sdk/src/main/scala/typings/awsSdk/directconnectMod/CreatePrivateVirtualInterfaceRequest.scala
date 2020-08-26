package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePrivateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the private virtual interface.
    */
  var newPrivateVirtualInterface: NewPrivateVirtualInterface = js.native
}

object CreatePrivateVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, newPrivateVirtualInterface: NewPrivateVirtualInterface): CreatePrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPrivateVirtualInterface = newPrivateVirtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class CreatePrivateVirtualInterfaceRequestOps[Self <: CreatePrivateVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewPrivateVirtualInterface(value: NewPrivateVirtualInterface): Self = this.set("newPrivateVirtualInterface", value.asInstanceOf[js.Any])
  }
  
}

