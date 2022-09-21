package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLambdaFunctionRecommendationsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account for which to return function recommendations. If your account is the management account of an organization, use this parameter to specify the member account for which you want to return function recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * An array of objects to specify a filter that returns a more specific list of function recommendations.
    */
  var filters: js.UndefOr[LambdaFunctionRecommendationFilters] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the functions for which to return recommendations. You can specify a qualified or unqualified ARN. If you specify an unqualified ARN without a function version suffix, Compute Optimizer will return recommendations for the latest ($LATEST) version of the function. If you specify a qualified ARN with a version suffix, Compute Optimizer will return recommendations for the specified function version. For more information about using function versions, see Using versions in the Lambda Developer Guide.
    */
  var functionArns: js.UndefOr[FunctionArns] = js.undefined
  
  /**
    * The maximum number of function recommendations to return with a single request. To retrieve the remaining results, make another request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of function recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetLambdaFunctionRecommendationsRequest {
  
  inline def apply(): GetLambdaFunctionRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLambdaFunctionRecommendationsRequest]
  }
  
  extension [Self <: GetLambdaFunctionRecommendationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFilters(value: LambdaFunctionRecommendationFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: LambdaFunctionRecommendationFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setFunctionArns(value: FunctionArns): Self = StObject.set(x, "functionArns", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnsUndefined: Self = StObject.set(x, "functionArns", js.undefined)
    
    inline def setFunctionArnsVarargs(value: FunctionArn*): Self = StObject.set(x, "functionArns", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
