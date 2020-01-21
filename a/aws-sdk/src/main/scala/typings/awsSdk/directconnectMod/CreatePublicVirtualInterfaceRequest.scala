package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterface: NewPublicVirtualInterface = js.native
}

object CreatePublicVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, newPublicVirtualInterface: NewPublicVirtualInterface): CreatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPublicVirtualInterface = newPublicVirtualInterface.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePublicVirtualInterfaceRequest]
  }
}

