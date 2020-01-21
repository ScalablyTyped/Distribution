package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyRuleOutput extends js.Object {
  /**
    * Information about the modified rule.
    */
  var Rules: js.UndefOr[typings.awsSdk.elbv2Mod.Rules] = js.native
}

object ModifyRuleOutput {
  @scala.inline
  def apply(Rules: Rules = null): ModifyRuleOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyRuleOutput]
  }
}

