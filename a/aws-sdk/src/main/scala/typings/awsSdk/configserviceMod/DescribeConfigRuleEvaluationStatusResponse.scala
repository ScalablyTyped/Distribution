package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigRuleEvaluationStatusResponse extends js.Object {
  /**
    * Status information about your AWS managed Config rules.
    */
  var ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigRuleEvaluationStatusResponse {
  @scala.inline
  def apply(ConfigRulesEvaluationStatus: ConfigRuleEvaluationStatusList = null, NextToken: String = null): DescribeConfigRuleEvaluationStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigRulesEvaluationStatus != null) __obj.updateDynamic("ConfigRulesEvaluationStatus")(ConfigRulesEvaluationStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusResponse]
  }
}

