package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConformancePackStatusesRequest extends StObject {
  
  /**
    * The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100. 
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The names of organization conformance packs for which you want status details. If you do not specify any names, AWS Config returns details for all your organization conformance packs. 
    */
  var OrganizationConformancePackNames: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePackNames] = js.undefined
}
object DescribeOrganizationConformancePackStatusesRequest {
  
  @scala.inline
  def apply(): DescribeOrganizationConformancePackStatusesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePackStatusesRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConformancePackStatusesRequestMutableBuilder[Self <: DescribeOrganizationConformancePackStatusesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: CosmosPageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePackNames(value: OrganizationConformancePackNames): Self = StObject.set(x, "OrganizationConformancePackNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConformancePackNamesUndefined: Self = StObject.set(x, "OrganizationConformancePackNames", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePackNamesVarargs(value: OrganizationConformancePackName*): Self = StObject.set(x, "OrganizationConformancePackNames", js.Array(value :_*))
  }
}
