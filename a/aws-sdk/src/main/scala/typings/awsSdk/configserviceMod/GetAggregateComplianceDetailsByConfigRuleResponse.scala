package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
  
  /**
    * Returns an AggregateEvaluationResults object.
    */
  var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object GetAggregateComplianceDetailsByConfigRuleResponse {
  
  @scala.inline
  def apply(): GetAggregateComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
  }
  
  @scala.inline
  implicit class GetAggregateComplianceDetailsByConfigRuleResponseOps[Self <: GetAggregateComplianceDetailsByConfigRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setAggregateEvaluationResultsVarargs(value: AggregateEvaluationResult*): Self = this.set("AggregateEvaluationResults", js.Array(value :_*))
    
    @scala.inline
    def setAggregateEvaluationResults(value: AggregateEvaluationResultList): Self = this.set("AggregateEvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateEvaluationResults: Self = this.set("AggregateEvaluationResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
