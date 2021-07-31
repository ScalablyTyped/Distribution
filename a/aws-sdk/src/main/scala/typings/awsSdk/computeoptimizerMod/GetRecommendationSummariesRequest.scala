package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationSummariesRequest extends StObject {
  
  /**
    * The IDs of the AWS accounts for which to return recommendation summaries. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * The maximum number of recommendation summaries to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of recommendation summaries.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetRecommendationSummariesRequest {
  
  @scala.inline
  def apply(): GetRecommendationSummariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationSummariesRequest]
  }
  
  @scala.inline
  implicit class GetRecommendationSummariesRequestMutableBuilder[Self <: GetRecommendationSummariesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
