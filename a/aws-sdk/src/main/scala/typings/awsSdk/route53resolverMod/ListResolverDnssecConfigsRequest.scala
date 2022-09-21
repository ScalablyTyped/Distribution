package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverDnssecConfigsRequest extends StObject {
  
  /**
    * An optional specification to return a subset of objects.
    */
  var Filters: js.UndefOr[typings.awsSdk.route53resolverMod.Filters] = js.undefined
  
  /**
    *  Optional: An integer that specifies the maximum number of DNSSEC configuration results that you want Amazon Route 53 to return. If you don't specify a value for MaxResults, Route 53 returns up to 100 configuration per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.undefined
  
  /**
    * (Optional) If the current Amazon Web Services account has more than MaxResults DNSSEC configurations, use NextToken to get the second and subsequent pages of results. For the first ListResolverDnssecConfigs request, omit this value. For the second and subsequent requests, get the value of NextToken from the previous response and specify that value for NextToken in the request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.undefined
}
object ListResolverDnssecConfigsRequest {
  
  inline def apply(): ListResolverDnssecConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverDnssecConfigsRequest]
  }
  
  extension [Self <: ListResolverDnssecConfigsRequest](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
