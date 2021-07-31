package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionDefinitionVersionsRequest extends StObject {
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string
}
object ListSubscriptionDefinitionVersionsRequest {
  
  @scala.inline
  def apply(SubscriptionDefinitionId: string): ListSubscriptionDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscriptionDefinitionVersionsRequest]
  }
  
  @scala.inline
  implicit class ListSubscriptionDefinitionVersionsRequestMutableBuilder[Self <: ListSubscriptionDefinitionVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
