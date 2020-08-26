package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the transit virtual interface.
    */
  var newTransitVirtualInterface: NewTransitVirtualInterface = js.native
}

object CreateTransitVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, newTransitVirtualInterface: NewTransitVirtualInterface): CreateTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newTransitVirtualInterface = newTransitVirtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class CreateTransitVirtualInterfaceRequestOps[Self <: CreateTransitVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def setNewTransitVirtualInterface(value: NewTransitVirtualInterface): Self = this.set("newTransitVirtualInterface", value.asInstanceOf[js.Any])
  }
  
}

