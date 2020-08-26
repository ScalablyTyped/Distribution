package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceDetailsByConfigRuleResponse extends js.Object {
  /**
    * Indicates whether the AWS resource complies with the specified AWS Config rule.
    */
  var EvaluationResults: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResults] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetComplianceDetailsByConfigRuleResponse {
  @scala.inline
  def apply(): GetComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
  }
  @scala.inline
  implicit class GetComplianceDetailsByConfigRuleResponseOps[Self <: GetComplianceDetailsByConfigRuleResponse] (val x: Self) extends AnyVal {
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
    def setEvaluationResultsVarargs(value: EvaluationResult*): Self = this.set("EvaluationResults", js.Array(value :_*))
    @scala.inline
    def setEvaluationResults(value: EvaluationResults): Self = this.set("EvaluationResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationResults: Self = this.set("EvaluationResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

