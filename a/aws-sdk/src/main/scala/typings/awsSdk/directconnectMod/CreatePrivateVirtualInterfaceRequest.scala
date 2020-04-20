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
}

