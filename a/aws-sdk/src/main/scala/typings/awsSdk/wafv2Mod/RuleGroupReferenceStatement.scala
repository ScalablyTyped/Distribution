package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupReferenceStatement extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn = js.native
  /**
    * The names of rules that are in the referenced rule group, but that you want AWS WAF to exclude from processing for this rule statement. 
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.wafv2Mod.ExcludedRules] = js.native
}

object RuleGroupReferenceStatement {
  @scala.inline
  def apply(ARN: ResourceArn): RuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupReferenceStatement]
  }
  @scala.inline
  implicit class RuleGroupReferenceStatementOps[Self <: RuleGroupReferenceStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setARN(value: ResourceArn): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludedRulesVarargs(value: ExcludedRule*): Self = this.set("ExcludedRules", js.Array(value :_*))
    @scala.inline
    def setExcludedRules(value: ExcludedRules): Self = this.set("ExcludedRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedRules: Self = this.set("ExcludedRules", js.undefined)
  }
  
}

