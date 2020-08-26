package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmConnectionResponse extends js.Object {
  /**
    * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.    unknown: The state of the connection is not available.  
    */
  var connectionState: js.UndefOr[ConnectionState] = js.native
}

object ConfirmConnectionResponse {
  @scala.inline
  def apply(): ConfirmConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmConnectionResponse]
  }
  @scala.inline
  implicit class ConfirmConnectionResponseOps[Self <: ConfirmConnectionResponse] (val x: Self) extends AnyVal {
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
    def setConnectionState(value: ConnectionState): Self = this.set("connectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionState: Self = this.set("connectionState", js.undefined)
  }
  
}

