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
}

