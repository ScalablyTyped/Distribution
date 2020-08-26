package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedRuleGroupStatement extends js.Object {
  /**
    * The rules whose actions are set to COUNT by the web ACL, regardless of the action that is set on the rule. This effectively excludes the rule from acting on web requests. 
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.wafv2Mod.ExcludedRules] = js.native
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: EntityName = js.native
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: typings.awsSdk.wafv2Mod.VendorName = js.native
}

object ManagedRuleGroupStatement {
  @scala.inline
  def apply(Name: EntityName, VendorName: VendorName): ManagedRuleGroupStatement = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VendorName = VendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRuleGroupStatement]
  }
  @scala.inline
  implicit class ManagedRuleGroupStatementOps[Self <: ManagedRuleGroupStatement] (val x: Self) extends AnyVal {
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
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorName(value: VendorName): Self = this.set("VendorName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludedRulesVarargs(value: ExcludedRule*): Self = this.set("ExcludedRules", js.Array(value :_*))
    @scala.inline
    def setExcludedRules(value: ExcludedRules): Self = this.set("ExcludedRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedRules: Self = this.set("ExcludedRules", js.undefined)
  }
  
}

