package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicRuleDestinationsResponse extends StObject {
  
  /**
    * Information about a topic rule destination.
    */
  var destinationSummaries: js.UndefOr[TopicRuleDestinationSummaries] = js.undefined
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListTopicRuleDestinationsResponse {
  
  inline def apply(): ListTopicRuleDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRuleDestinationsResponse]
  }
  
  extension [Self <: ListTopicRuleDestinationsResponse](x: Self) {
    
    inline def setDestinationSummaries(value: TopicRuleDestinationSummaries): Self = StObject.set(x, "destinationSummaries", value.asInstanceOf[js.Any])
    
    inline def setDestinationSummariesUndefined: Self = StObject.set(x, "destinationSummaries", js.undefined)
    
    inline def setDestinationSummariesVarargs(value: TopicRuleDestinationSummary*): Self = StObject.set(x, "destinationSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
