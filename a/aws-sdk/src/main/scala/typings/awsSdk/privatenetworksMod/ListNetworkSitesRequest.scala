package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworkSitesRequest extends StObject {
  
  /**
    * The filters. Add filters to your request to return a more specific list of results. Use filters to match the status of the network sites.    STATUS - The status (AVAILABLE | CREATED | DELETED | DEPROVISIONING | PROVISIONING).   Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var filters: js.UndefOr[NetworkSiteFilters] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[ListNetworkSitesRequestMaxResultsInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network.
    */
  var networkArn: Arn
  
  /**
    * The token for the next page of results.
    */
  var startToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworkSitesRequest {
  
  inline def apply(networkArn: Arn): ListNetworkSitesRequest = {
    val __obj = js.Dynamic.literal(networkArn = networkArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNetworkSitesRequest]
  }
  
  extension [Self <: ListNetworkSitesRequest](x: Self) {
    
    inline def setFilters(value: NetworkSiteFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: ListNetworkSitesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setStartToken(value: PaginationToken): Self = StObject.set(x, "startToken", value.asInstanceOf[js.Any])
    
    inline def setStartTokenUndefined: Self = StObject.set(x, "startToken", js.undefined)
  }
}
