package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  
  /**
    * Information about the transit virtual interface.
    */
  var newTransitVirtualInterface: NewTransitVirtualInterface
}
object CreateTransitVirtualInterfaceRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId, newTransitVirtualInterface: NewTransitVirtualInterface): CreateTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newTransitVirtualInterface = newTransitVirtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class CreateTransitVirtualInterfaceRequestMutableBuilder[Self <: CreateTransitVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTransitVirtualInterface(value: NewTransitVirtualInterface): Self = StObject.set(x, "newTransitVirtualInterface", value.asInstanceOf[js.Any])
  }
}
