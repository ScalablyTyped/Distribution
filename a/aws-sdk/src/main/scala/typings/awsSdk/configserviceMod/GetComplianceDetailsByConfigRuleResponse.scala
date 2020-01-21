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
  def apply(EvaluationResults: EvaluationResults = null, NextToken: NextToken = null): GetComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (EvaluationResults != null) __obj.updateDynamic("EvaluationResults")(EvaluationResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
  }
}

