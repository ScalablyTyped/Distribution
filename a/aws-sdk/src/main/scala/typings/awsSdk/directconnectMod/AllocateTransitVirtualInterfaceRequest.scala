package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocateTransitVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the connection on which the transit virtual interface is provisioned.
    */
  var connectionId: ConnectionId = js.native
  
  /**
    * Information about the transit virtual interface.
    */
  var newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation = js.native
  
  /**
    * The ID of the AWS account that owns the transit virtual interface.
    */
  var ownerAccount: OwnerAccount = js.native
}
object AllocateTransitVirtualInterfaceRequest {
  
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocateTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newTransitVirtualInterfaceAllocation = newTransitVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateTransitVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class AllocateTransitVirtualInterfaceRequestMutableBuilder[Self <: AllocateTransitVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTransitVirtualInterfaceAllocation(value: NewTransitVirtualInterfaceAllocation): Self = StObject.set(x, "newTransitVirtualInterfaceAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
  }
}
