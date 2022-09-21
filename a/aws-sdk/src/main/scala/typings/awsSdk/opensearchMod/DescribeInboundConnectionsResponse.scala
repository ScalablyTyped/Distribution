package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInboundConnectionsResponse extends StObject {
  
  /**
    * A list of  InboundConnection  matching the specified filter criteria. 
    */
  var Connections: js.UndefOr[InboundConnections] = js.undefined
  
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opensearchMod.NextToken] = js.undefined
}
object DescribeInboundConnectionsResponse {
  
  inline def apply(): DescribeInboundConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInboundConnectionsResponse]
  }
  
  extension [Self <: DescribeInboundConnectionsResponse](x: Self) {
    
    inline def setConnections(value: InboundConnections): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setConnectionsVarargs(value: InboundConnection*): Self = StObject.set(x, "Connections", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
