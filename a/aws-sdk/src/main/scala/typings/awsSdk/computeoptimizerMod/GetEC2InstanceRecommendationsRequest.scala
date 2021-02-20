package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEC2InstanceRecommendationsRequest extends StObject {
  
  /**
    * The IDs of the AWS accounts for which to return instance recommendations. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return instance recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  
  /**
    * An array of objects that describe a filter that returns a more specific list of instance recommendations.
    */
  var filters: js.UndefOr[Filters] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendations.
    */
  var instanceArns: js.UndefOr[InstanceArns] = js.native
  
  /**
    * The maximum number of instance recommendations to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token to advance to the next page of instance recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetEC2InstanceRecommendationsRequest {
  
  @scala.inline
  def apply(): GetEC2InstanceRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2InstanceRecommendationsRequest]
  }
  
  @scala.inline
  implicit class GetEC2InstanceRecommendationsRequestMutableBuilder[Self <: GetEC2InstanceRecommendationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setInstanceArns(value: InstanceArns): Self = StObject.set(x, "instanceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArnsUndefined: Self = StObject.set(x, "instanceArns", js.undefined)
    
    @scala.inline
    def setInstanceArnsVarargs(value: InstanceArn*): Self = StObject.set(x, "instanceArns", js.Array(value :_*))
    
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
