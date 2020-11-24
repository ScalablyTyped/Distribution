package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class CreatePublicVirtualInterfaceRequestOps[Self <: CreatePublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPublicVirtualInterface(value: NewPublicVirtualInterface): Self = this.set("newPublicVirtualInterface", value.asInstanceOf[js.Any])
  }
}
