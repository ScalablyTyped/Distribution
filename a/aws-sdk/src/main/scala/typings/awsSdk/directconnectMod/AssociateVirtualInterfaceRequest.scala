package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the LAG or connection.
    */
  var connectionId: ConnectionId
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}
object AssociateVirtualInterfaceRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId, virtualInterfaceId: VirtualInterfaceId): AssociateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class AssociateVirtualInterfaceRequestMutableBuilder[Self <: AssociateVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
