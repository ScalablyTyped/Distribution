package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConformancePackStatusesResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of OrganizationConformancePackStatus objects. 
    */
  var OrganizationConformancePackStatuses: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePackStatuses] = js.undefined
}
object DescribeOrganizationConformancePackStatusesResponse {
  
  inline def apply(): DescribeOrganizationConformancePackStatusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePackStatusesResponse]
  }
  
  extension [Self <: DescribeOrganizationConformancePackStatusesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationConformancePackStatuses(value: OrganizationConformancePackStatuses): Self = StObject.set(x, "OrganizationConformancePackStatuses", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConformancePackStatusesUndefined: Self = StObject.set(x, "OrganizationConformancePackStatuses", js.undefined)
    
    inline def setOrganizationConformancePackStatusesVarargs(value: OrganizationConformancePackStatus*): Self = StObject.set(x, "OrganizationConformancePackStatuses", js.Array(value :_*))
  }
}
