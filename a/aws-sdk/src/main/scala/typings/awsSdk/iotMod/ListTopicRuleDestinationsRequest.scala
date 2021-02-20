package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicRuleDestinationsRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[TopicRuleDestinationMaxResults] = js.native
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListTopicRuleDestinationsRequest {
  
  @scala.inline
  def apply(): ListTopicRuleDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRuleDestinationsRequest]
  }
  
  @scala.inline
  implicit class ListTopicRuleDestinationsRequestMutableBuilder[Self <: ListTopicRuleDestinationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: TopicRuleDestinationMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
