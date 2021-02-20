package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHostedConnectionsRequest extends StObject {
  
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId = js.native
}
object DescribeHostedConnectionsRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId): DescribeHostedConnectionsRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostedConnectionsRequest]
  }
  
  @scala.inline
  implicit class DescribeHostedConnectionsRequestMutableBuilder[Self <: DescribeHostedConnectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
  }
}
