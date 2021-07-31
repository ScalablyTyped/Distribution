package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConformancePackComplianceRequest extends StObject {
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName
  
  /**
    * A ConformancePackComplianceFilters object.
    */
  var Filters: js.UndefOr[ConformancePackComplianceFilters] = js.undefined
  
  /**
    * The maximum number of AWS Config rules within a conformance pack are returned on each page.
    */
  var Limit: js.UndefOr[DescribeConformancePackComplianceLimit] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object DescribeConformancePackComplianceRequest {
  
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): DescribeConformancePackComplianceRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePackComplianceRequest]
  }
  
  @scala.inline
  implicit class DescribeConformancePackComplianceRequestMutableBuilder[Self <: DescribeConformancePackComplianceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: ConformancePackComplianceFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeConformancePackComplianceLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
