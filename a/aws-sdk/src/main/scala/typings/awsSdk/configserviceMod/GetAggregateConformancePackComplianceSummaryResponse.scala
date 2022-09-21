package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateConformancePackComplianceSummaryResponse extends StObject {
  
  /**
    * Returns a list of AggregateConformancePackComplianceSummary object.
    */
  var AggregateConformancePackComplianceSummaries: js.UndefOr[AggregateConformancePackComplianceSummaryList] = js.undefined
  
  /**
    * Groups the result based on Amazon Web Services account ID or Amazon Web Services Region.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object GetAggregateConformancePackComplianceSummaryResponse {
  
  inline def apply(): GetAggregateConformancePackComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateConformancePackComplianceSummaryResponse]
  }
  
  extension [Self <: GetAggregateConformancePackComplianceSummaryResponse](x: Self) {
    
    inline def setAggregateConformancePackComplianceSummaries(value: AggregateConformancePackComplianceSummaryList): Self = StObject.set(x, "AggregateConformancePackComplianceSummaries", value.asInstanceOf[js.Any])
    
    inline def setAggregateConformancePackComplianceSummariesUndefined: Self = StObject.set(x, "AggregateConformancePackComplianceSummaries", js.undefined)
    
    inline def setAggregateConformancePackComplianceSummariesVarargs(value: AggregateConformancePackComplianceSummary*): Self = StObject.set(x, "AggregateConformancePackComplianceSummaries", js.Array(value*))
    
    inline def setGroupByKey(value: StringWithCharLimit256): Self = StObject.set(x, "GroupByKey", value.asInstanceOf[js.Any])
    
    inline def setGroupByKeyUndefined: Self = StObject.set(x, "GroupByKey", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
