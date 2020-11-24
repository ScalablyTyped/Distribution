package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAggregateConfigRuleComplianceSummaryResponse extends js.Object {
  
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
  implicit class GetAggregateConfigRuleComplianceSummaryResponseOps[Self <: GetAggregateConfigRuleComplianceSummaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregateComplianceCountsVarargs(value: AggregateComplianceCount*): Self = this.set("AggregateComplianceCounts", js.Array(value :_*))
    
    @scala.inline
    def setAggregateComplianceCounts(value: AggregateComplianceCountList): Self = this.set("AggregateComplianceCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateComplianceCounts: Self = this.set("AggregateComplianceCounts", js.undefined)
    
    @scala.inline
    def setGroupByKey(value: StringWithCharLimit256): Self = this.set("GroupByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByKey: Self = this.set("GroupByKey", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
