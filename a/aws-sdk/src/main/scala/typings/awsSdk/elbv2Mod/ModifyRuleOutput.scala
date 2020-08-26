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
  def apply(): ModifyRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyRuleOutput]
  }
  @scala.inline
  implicit class ModifyRuleOutputOps[Self <: ModifyRuleOutput] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: Rule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Rules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
  
}

