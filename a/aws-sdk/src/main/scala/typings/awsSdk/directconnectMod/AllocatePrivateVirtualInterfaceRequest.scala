package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocatePrivateVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the connection on which the private virtual interface is provisioned.
    */
  var connectionId: ConnectionId
  
  /**
    * Information about the private virtual interface.
    */
  var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
  
  /**
    * The ID of the AWS account that owns the virtual private interface.
    */
  var ownerAccount: OwnerAccount
}
object AllocatePrivateVirtualInterfaceRequest {
  
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocatePrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPrivateVirtualInterfaceAllocation = newPrivateVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocatePrivateVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class AllocatePrivateVirtualInterfaceRequestMutableBuilder[Self <: AllocatePrivateVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPrivateVirtualInterfaceAllocation(value: NewPrivateVirtualInterfaceAllocation): Self = StObject.set(x, "newPrivateVirtualInterfaceAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
  }
}
