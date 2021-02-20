package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchRuleGroup extends StObject {
  
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
  implicit class PatchRuleGroupMutableBuilder[Self <: PatchRuleGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatchRules(value: PatchRuleList): Self = StObject.set(x, "PatchRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchRulesVarargs(value: PatchRule*): Self = StObject.set(x, "PatchRules", js.Array(value :_*))
  }
}
