package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewaysResponse extends StObject {
  
  /**
    * A list that summarizes each gateway.
    */
  var gatewaySummaries: GatewaySummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListGatewaysResponse {
  
  @scala.inline
  def apply(gatewaySummaries: GatewaySummaries): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal(gatewaySummaries = gatewaySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewaysResponse]
  }
  
  @scala.inline
  implicit class ListGatewaysResponseMutableBuilder[Self <: ListGatewaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewaySummaries(value: GatewaySummaries): Self = StObject.set(x, "gatewaySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewaySummariesVarargs(value: GatewaySummary*): Self = StObject.set(x, "gatewaySummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
