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
  def apply(connectionState: ConnectionState = null): ConfirmConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (connectionState != null) __obj.updateDynamic("connectionState")(connectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmConnectionResponse]
  }
}

