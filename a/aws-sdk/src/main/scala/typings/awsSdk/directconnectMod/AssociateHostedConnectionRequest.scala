package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateHostedConnectionRequest extends StObject {
  
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
  implicit class AssociateHostedConnectionRequestMutableBuilder[Self <: AssociateHostedConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentConnectionId(value: ConnectionId): Self = StObject.set(x, "parentConnectionId", value.asInstanceOf[js.Any])
  }
}
