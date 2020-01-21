package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the LAG or connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object AssociateVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, virtualInterfaceId: VirtualInterfaceId): AssociateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateVirtualInterfaceRequest]
  }
}

