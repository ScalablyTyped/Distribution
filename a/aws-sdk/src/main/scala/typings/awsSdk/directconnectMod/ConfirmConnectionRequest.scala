package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmConnectionRequest extends StObject {
  
  /**
    * The ID of the hosted connection.
    */
  var connectionId: ConnectionId
}
object ConfirmConnectionRequest {
  
  inline def apply(connectionId: ConnectionId): ConfirmConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmConnectionRequest]
  }
  
  extension [Self <: ConfirmConnectionRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
  }
}
