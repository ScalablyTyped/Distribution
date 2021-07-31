package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
}
object DeleteConnectionRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
  
  @scala.inline
  implicit class DeleteConnectionRequestMutableBuilder[Self <: DeleteConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
  }
}
