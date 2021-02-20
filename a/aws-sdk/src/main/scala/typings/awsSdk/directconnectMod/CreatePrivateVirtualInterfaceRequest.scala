package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePrivateVirtualInterfaceRequest extends StObject {
  
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
  implicit class CreatePrivateVirtualInterfaceRequestMutableBuilder[Self <: CreatePrivateVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPrivateVirtualInterface(value: NewPrivateVirtualInterface): Self = StObject.set(x, "newPrivateVirtualInterface", value.asInstanceOf[js.Any])
  }
}
