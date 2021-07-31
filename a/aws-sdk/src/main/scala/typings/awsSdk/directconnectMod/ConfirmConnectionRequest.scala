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
  
  @scala.inline
  def apply(connectionId: ConnectionId): ConfirmConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmConnectionRequest]
  }
  
  @scala.inline
  implicit class ConfirmConnectionRequestMutableBuilder[Self <: ConfirmConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
  }
}
