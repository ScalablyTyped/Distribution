package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmConnectionRequest extends js.Object {
  /**
    * The ID of the hosted connection.
    */
  var connectionId: ConnectionId = js.native
}

object ConfirmConnectionRequest {
  @scala.inline
  def apply(connectionId: ConnectionId): ConfirmConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmConnectionRequest]
  }
}

