package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocatePublicVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the connection on which the public virtual interface is provisioned.
    */
  var connectionId: ConnectionId
  
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation
  
  /**
    * The ID of the AWS account that owns the public virtual interface.
    */
  var ownerAccount: OwnerAccount
}
object AllocatePublicVirtualInterfaceRequest {
  
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocatePublicVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class AllocatePublicVirtualInterfaceRequestMutableBuilder[Self <: AllocatePublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPublicVirtualInterfaceAllocation(value: NewPublicVirtualInterfaceAllocation): Self = StObject.set(x, "newPublicVirtualInterfaceAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
  }
}
