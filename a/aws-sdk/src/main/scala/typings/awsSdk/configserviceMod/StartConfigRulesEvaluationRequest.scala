package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartConfigRulesEvaluationRequest extends js.Object {
  /**
    * The list of names of AWS Config rules that you want to run evaluations for.
    */
  var ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.native
}

object StartConfigRulesEvaluationRequest {
  @scala.inline
  def apply(ConfigRuleNames: ReevaluateConfigRuleNames = null): StartConfigRulesEvaluationRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigRuleNames != null) __obj.updateDynamic("ConfigRuleNames")(ConfigRuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartConfigRulesEvaluationRequest]
  }
}

