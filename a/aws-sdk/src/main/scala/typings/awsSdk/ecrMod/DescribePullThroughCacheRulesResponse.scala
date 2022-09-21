package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePullThroughCacheRulesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future DescribePullThroughCacheRulesRequest request. When the results of a DescribePullThroughCacheRulesRequest request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The details of the pull through cache rules.
    */
  var pullThroughCacheRules: js.UndefOr[PullThroughCacheRuleList] = js.undefined
}
object DescribePullThroughCacheRulesResponse {
  
  inline def apply(): DescribePullThroughCacheRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePullThroughCacheRulesResponse]
  }
  
  extension [Self <: DescribePullThroughCacheRulesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPullThroughCacheRules(value: PullThroughCacheRuleList): Self = StObject.set(x, "pullThroughCacheRules", value.asInstanceOf[js.Any])
    
    inline def setPullThroughCacheRulesUndefined: Self = StObject.set(x, "pullThroughCacheRules", js.undefined)
    
    inline def setPullThroughCacheRulesVarargs(value: PullThroughCacheRule*): Self = StObject.set(x, "pullThroughCacheRules", js.Array(value*))
  }
}
