package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleSummary extends js.Object {
  var Action: js.UndefOr[RuleAction] = js.native
  /**
    * The name of the rule. 
    */
  var Name: js.UndefOr[EntityName] = js.native
}

object RuleSummary {
  @scala.inline
  def apply(Action: RuleAction = null, Name: EntityName = null): RuleSummary = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSummary]
  }
}

