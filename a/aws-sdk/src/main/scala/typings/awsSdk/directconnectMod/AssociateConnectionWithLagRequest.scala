package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateConnectionWithLagRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  
  /**
    * The ID of the LAG with which to associate the connection.
    */
  var lagId: LagId
}
object AssociateConnectionWithLagRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId, lagId: LagId): AssociateConnectionWithLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateConnectionWithLagRequest]
  }
  
  @scala.inline
  implicit class AssociateConnectionWithLagRequestMutableBuilder[Self <: AssociateConnectionWithLagRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
  }
}
