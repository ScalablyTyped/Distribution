package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInboundConnectionRequest extends StObject {
  
  /**
    * The ID of the inbound connection you want to accept.
    */
  var ConnectionId: typings.awsSdk.opensearchMod.ConnectionId
}
object AcceptInboundConnectionRequest {
  
  inline def apply(ConnectionId: ConnectionId): AcceptInboundConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInboundConnectionRequest]
  }
  
  extension [Self <: AcceptInboundConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
  }
}
