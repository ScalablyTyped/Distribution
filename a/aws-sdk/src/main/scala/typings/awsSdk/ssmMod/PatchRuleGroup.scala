package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchRuleGroup extends js.Object {
  
  /**
    * The rules that make up the rule group.
    */
  var PatchRules: PatchRuleList = js.native
}
object PatchRuleGroup {
  
  @scala.inline
  def apply(PatchRules: PatchRuleList): PatchRuleGroup = {
    val __obj = js.Dynamic.literal(PatchRules = PatchRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRuleGroup]
  }
  
  @scala.inline
  implicit class PatchRuleGroupOps[Self <: PatchRuleGroup] (val x: Self) extends AnyVal {
    
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
    def setPatchRulesVarargs(value: PatchRule*): Self = this.set("PatchRules", js.Array(value :_*))
    
    @scala.inline
    def setPatchRules(value: PatchRuleList): Self = this.set("PatchRules", value.asInstanceOf[js.Any])
  }
}
