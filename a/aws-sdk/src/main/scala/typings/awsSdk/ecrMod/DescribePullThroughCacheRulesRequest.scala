package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePullThroughCacheRulesRequest extends StObject {
  
  /**
    * The Amazon ECR repository prefixes associated with the pull through cache rules to return. If no repository prefix value is specified, all pull through cache rules are returned.
    */
  var ecrRepositoryPrefixes: js.UndefOr[PullThroughCacheRuleRepositoryPrefixList] = js.undefined
  
  /**
    * The maximum number of pull through cache rules returned by DescribePullThroughCacheRulesRequest in paginated output. When this parameter is used, DescribePullThroughCacheRulesRequest only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribePullThroughCacheRulesRequest request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribePullThroughCacheRulesRequest returns up to 100 results and a nextToken value, if applicable.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribePullThroughCacheRulesRequest request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry to return the pull through cache rules for. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
}
object DescribePullThroughCacheRulesRequest {
  
  inline def apply(): DescribePullThroughCacheRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePullThroughCacheRulesRequest]
  }
  
  extension [Self <: DescribePullThroughCacheRulesRequest](x: Self) {
    
    inline def setEcrRepositoryPrefixes(value: PullThroughCacheRuleRepositoryPrefixList): Self = StObject.set(x, "ecrRepositoryPrefixes", value.asInstanceOf[js.Any])
    
    inline def setEcrRepositoryPrefixesUndefined: Self = StObject.set(x, "ecrRepositoryPrefixes", js.undefined)
    
    inline def setEcrRepositoryPrefixesVarargs(value: PullThroughCacheRuleRepositoryPrefix*): Self = StObject.set(x, "ecrRepositoryPrefixes", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
  }
}
