package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConformancePacksResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a list of OrganizationConformancePacks objects.
    */
  var OrganizationConformancePacks: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePacks] = js.undefined
}
object DescribeOrganizationConformancePacksResponse {
  
  @scala.inline
  def apply(): DescribeOrganizationConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePacksResponse]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConformancePacksResponseMutableBuilder[Self <: DescribeOrganizationConformancePacksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePacks(value: OrganizationConformancePacks): Self = StObject.set(x, "OrganizationConformancePacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConformancePacksUndefined: Self = StObject.set(x, "OrganizationConformancePacks", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePacksVarargs(value: OrganizationConformancePack*): Self = StObject.set(x, "OrganizationConformancePacks", js.Array(value :_*))
  }
}
