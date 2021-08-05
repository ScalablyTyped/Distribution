package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePrivateVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  
  /**
    * Information about the private virtual interface.
    */
  var newPrivateVirtualInterface: NewPrivateVirtualInterface
}
object CreatePrivateVirtualInterfaceRequest {
  
  inline def apply(connectionId: ConnectionId, newPrivateVirtualInterface: NewPrivateVirtualInterface): CreatePrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPrivateVirtualInterface = newPrivateVirtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateVirtualInterfaceRequest]
  }
  
  extension [Self <: CreatePrivateVirtualInterfaceRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setNewPrivateVirtualInterface(value: NewPrivateVirtualInterface): Self = StObject.set(x, "newPrivateVirtualInterface", value.asInstanceOf[js.Any])
  }
}
