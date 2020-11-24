package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateHostedConnectionRequest extends js.Object {
  
  /**
    * The ID of the hosted connection.
    */
  var connectionId: ConnectionId = js.native
  
  /**
    * The ID of the interconnect or the LAG.
    */
  var parentConnectionId: ConnectionId = js.native
}
object AssociateHostedConnectionRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId, parentConnectionId: ConnectionId): AssociateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], parentConnectionId = parentConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateHostedConnectionRequest]
  }
  
  @scala.inline
  implicit class AssociateHostedConnectionRequestOps[Self <: AssociateHostedConnectionRequest] (val x: Self) extends AnyVal {
    
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
    def setParentConnectionId(value: ConnectionId): Self = this.set("parentConnectionId", value.asInstanceOf[js.Any])
  }
}
