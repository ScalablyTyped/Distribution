package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleResult extends js.Object {
  /**
    * The outcomes of the matched rule, based on the rule execution mode.
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.native
  /**
    * The rule ID that was matched, based on the rule execution mode.
    */
  var ruleId: js.UndefOr[String] = js.native
}

object RuleResult {
  @scala.inline
  def apply(outcomes: ListOfStrings = null, ruleId: String = null): RuleResult = {
    val __obj = js.Dynamic.literal()
    if (outcomes != null) __obj.updateDynamic("outcomes")(outcomes.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleResult]
  }
}

