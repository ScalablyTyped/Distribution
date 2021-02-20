package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOutboundCrossClusterSearchConnectionsResponse extends StObject {
  
  /**
    * Consists of list of OutboundCrossClusterSearchConnection matching the specified filter criteria.
    */
  var CrossClusterSearchConnections: js.UndefOr[OutboundCrossClusterSearchConnections] = js.native
  
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}
object DescribeOutboundCrossClusterSearchConnectionsResponse {
  
  @scala.inline
  def apply(): DescribeOutboundCrossClusterSearchConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOutboundCrossClusterSearchConnectionsResponse]
  }
  
  @scala.inline
  implicit class DescribeOutboundCrossClusterSearchConnectionsResponseMutableBuilder[Self <: DescribeOutboundCrossClusterSearchConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossClusterSearchConnections(value: OutboundCrossClusterSearchConnections): Self = StObject.set(x, "CrossClusterSearchConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossClusterSearchConnectionsUndefined: Self = StObject.set(x, "CrossClusterSearchConnections", js.undefined)
    
    @scala.inline
    def setCrossClusterSearchConnectionsVarargs(value: OutboundCrossClusterSearchConnection*): Self = StObject.set(x, "CrossClusterSearchConnections", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
