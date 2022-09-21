package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationInsightsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account. 
    */
  var AccountIds: js.UndefOr[ListInsightsAccountIdList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[ListInsightsMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    * The ID of the organizational unit.
    */
  var OrganizationalUnitIds: js.UndefOr[ListInsightsOrganizationalUnitIdList] = js.undefined
  
  var StatusFilter: ListInsightsStatusFilter
}
object ListOrganizationInsightsRequest {
  
  inline def apply(StatusFilter: ListInsightsStatusFilter): ListOrganizationInsightsRequest = {
    val __obj = js.Dynamic.literal(StatusFilter = StatusFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationInsightsRequest]
  }
  
  extension [Self <: ListOrganizationInsightsRequest](x: Self) {
    
    inline def setAccountIds(value: ListInsightsAccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setMaxResults(value: ListInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationalUnitIds(value: ListInsightsOrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    inline def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value*))
    
    inline def setStatusFilter(value: ListInsightsStatusFilter): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
  }
}
