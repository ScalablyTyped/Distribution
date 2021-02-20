package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInboundCrossClusterSearchConnectionsResponse extends StObject {
  
  /**
    * Consists of list of InboundCrossClusterSearchConnection matching the specified filter criteria.
    */
  var CrossClusterSearchConnections: js.UndefOr[InboundCrossClusterSearchConnections] = js.native
  
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}
object DescribeInboundCrossClusterSearchConnectionsResponse {
  
  @scala.inline
  def apply(): DescribeInboundCrossClusterSearchConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInboundCrossClusterSearchConnectionsResponse]
  }
  
  @scala.inline
  implicit class DescribeInboundCrossClusterSearchConnectionsResponseMutableBuilder[Self <: DescribeInboundCrossClusterSearchConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossClusterSearchConnections(value: InboundCrossClusterSearchConnections): Self = StObject.set(x, "CrossClusterSearchConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossClusterSearchConnectionsUndefined: Self = StObject.set(x, "CrossClusterSearchConnections", js.undefined)
    
    @scala.inline
    def setCrossClusterSearchConnectionsVarargs(value: InboundCrossClusterSearchConnection*): Self = StObject.set(x, "CrossClusterSearchConnections", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
