package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutoScalingGroupRecommendationsRequest extends StObject {
  
  /**
    * The IDs of the AWS accounts for which to return Auto Scaling group recommendations. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
    */
  var autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns] = js.undefined
  
  /**
    * An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.
    */
  var filters: js.UndefOr[Filters] = js.undefined
  
  /**
    * The maximum number of Auto Scaling group recommendations to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of Auto Scaling group recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetAutoScalingGroupRecommendationsRequest {
  
  inline def apply(): GetAutoScalingGroupRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoScalingGroupRecommendationsRequest]
  }
  
  extension [Self <: GetAutoScalingGroupRecommendationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    inline def setAutoScalingGroupArns(value: AutoScalingGroupArns): Self = StObject.set(x, "autoScalingGroupArns", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupArnsUndefined: Self = StObject.set(x, "autoScalingGroupArns", js.undefined)
    
    inline def setAutoScalingGroupArnsVarargs(value: AutoScalingGroupArn*): Self = StObject.set(x, "autoScalingGroupArns", js.Array(value :_*))
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
