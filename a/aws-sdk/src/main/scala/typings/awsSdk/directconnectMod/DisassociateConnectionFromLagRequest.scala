package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConnectionFromLagRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  
  /**
    * The ID of the LAG.
    */
  var lagId: LagId
}
object DisassociateConnectionFromLagRequest {
  
  inline def apply(connectionId: ConnectionId, lagId: LagId): DisassociateConnectionFromLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectionFromLagRequest]
  }
  
  extension [Self <: DisassociateConnectionFromLagRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
  }
}
