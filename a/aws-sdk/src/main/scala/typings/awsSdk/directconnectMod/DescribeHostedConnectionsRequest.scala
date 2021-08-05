package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHostedConnectionsRequest extends StObject {
  
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId
}
object DescribeHostedConnectionsRequest {
  
  inline def apply(connectionId: ConnectionId): DescribeHostedConnectionsRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostedConnectionsRequest]
  }
  
  extension [Self <: DescribeHostedConnectionsRequest](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
  }
}
