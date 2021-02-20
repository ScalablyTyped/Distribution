package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAggregateConfigRuleComplianceSummaryResponse extends StObject {
  
  /**
    * Returns a list of AggregateComplianceCounts object.
    */
  var AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList] = js.native
  
  /**
    * Groups the result based on ACCOUNT_ID or AWS_REGION.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object GetAggregateConfigRuleComplianceSummaryResponse {
  
  @scala.inline
  def apply(): GetAggregateConfigRuleComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateConfigRuleComplianceSummaryResponse]
  }
  
  @scala.inline
  implicit class GetAggregateConfigRuleComplianceSummaryResponseMutableBuilder[Self <: GetAggregateConfigRuleComplianceSummaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateComplianceCounts(value: AggregateComplianceCountList): Self = StObject.set(x, "AggregateComplianceCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateComplianceCountsUndefined: Self = StObject.set(x, "AggregateComplianceCounts", js.undefined)
    
    @scala.inline
    def setAggregateComplianceCountsVarargs(value: AggregateComplianceCount*): Self = StObject.set(x, "AggregateComplianceCounts", js.Array(value :_*))
    
    @scala.inline
    def setGroupByKey(value: StringWithCharLimit256): Self = StObject.set(x, "GroupByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByKeyUndefined: Self = StObject.set(x, "GroupByKey", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
