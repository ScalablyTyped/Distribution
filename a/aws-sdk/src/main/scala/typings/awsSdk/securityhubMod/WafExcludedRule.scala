package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WafExcludedRule extends js.Object {
  /**
    * The unique identifier for the rule to exclude from the rule group.
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.native
}

object WafExcludedRule {
  @scala.inline
  def apply(RuleId: NonEmptyString = null): WafExcludedRule = {
    val __obj = js.Dynamic.literal()
    if (RuleId != null) __obj.updateDynamic("RuleId")(RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WafExcludedRule]
  }
}

