package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrganizationConformancePackDetailedStatusRequest extends StObject {
  
  /**
    * An OrganizationResourceDetailedStatusFilters object.
    */
  var Filters: js.UndefOr[OrganizationResourceDetailedStatusFilters] = js.undefined
  
  /**
    * The maximum number of OrganizationConformancePackDetailedStatuses returned on each page. If you do not specify a number, AWS Config uses the default. The default is 100. 
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of organization conformance pack for which you want status details for member accounts.
    */
  var OrganizationConformancePackName: typings.awsSdk.configserviceMod.OrganizationConformancePackName
}
object GetOrganizationConformancePackDetailedStatusRequest {
  
  @scala.inline
  def apply(OrganizationConformancePackName: OrganizationConformancePackName): GetOrganizationConformancePackDetailedStatusRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConformancePackDetailedStatusRequest]
  }
  
  @scala.inline
  implicit class GetOrganizationConformancePackDetailedStatusRequestMutableBuilder[Self <: GetOrganizationConformancePackDetailedStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: OrganizationResourceDetailedStatusFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setLimit(value: CosmosPageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = StObject.set(x, "OrganizationConformancePackName", value.asInstanceOf[js.Any])
  }
}
