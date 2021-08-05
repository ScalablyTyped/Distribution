package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAffectedEntitiesForOrganizationRequest extends StObject {
  
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsSdk.healthMod.locale] = js.undefined
  
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[typings.awsSdk.healthMod.maxResults] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.undefined
  
  /**
    * A JSON set of elements including the awsAccountId and the eventArn.
    */
  var organizationEntityFilters: OrganizationEntityFiltersList
}
object DescribeAffectedEntitiesForOrganizationRequest {
  
  inline def apply(organizationEntityFilters: OrganizationEntityFiltersList): DescribeAffectedEntitiesForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEntityFilters = organizationEntityFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAffectedEntitiesForOrganizationRequest]
  }
  
  extension [Self <: DescribeAffectedEntitiesForOrganizationRequest](x: Self) {
    
    inline def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: maxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOrganizationEntityFilters(value: OrganizationEntityFiltersList): Self = StObject.set(x, "organizationEntityFilters", value.asInstanceOf[js.Any])
    
    inline def setOrganizationEntityFiltersVarargs(value: EventAccountFilter*): Self = StObject.set(x, "organizationEntityFilters", js.Array(value :_*))
  }
}
