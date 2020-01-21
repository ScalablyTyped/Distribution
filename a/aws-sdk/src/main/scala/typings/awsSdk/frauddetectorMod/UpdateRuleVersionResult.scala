package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleVersionResult extends js.Object {
  /**
    * The new rule version that was created.
    */
  var rule: js.UndefOr[Rule] = js.native
}

object UpdateRuleVersionResult {
  @scala.inline
  def apply(rule: Rule = null): UpdateRuleVersionResult = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleVersionResult]
  }
}

