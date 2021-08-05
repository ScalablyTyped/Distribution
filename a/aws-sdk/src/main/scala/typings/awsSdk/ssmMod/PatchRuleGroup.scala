package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRuleGroup extends StObject {
  
  /**
    * The rules that make up the rule group.
    */
  var PatchRules: PatchRuleList
}
object PatchRuleGroup {
  
  inline def apply(PatchRules: PatchRuleList): PatchRuleGroup = {
    val __obj = js.Dynamic.literal(PatchRules = PatchRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRuleGroup]
  }
  
  extension [Self <: PatchRuleGroup](x: Self) {
    
    inline def setPatchRules(value: PatchRuleList): Self = StObject.set(x, "PatchRules", value.asInstanceOf[js.Any])
    
    inline def setPatchRulesVarargs(value: PatchRule*): Self = StObject.set(x, "PatchRules", js.Array(value :_*))
  }
}
