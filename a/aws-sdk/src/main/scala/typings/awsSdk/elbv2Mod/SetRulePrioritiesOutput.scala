package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRulePrioritiesOutput extends StObject {
  
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typings.awsSdk.elbv2Mod.Rules] = js.undefined
}
object SetRulePrioritiesOutput {
  
  @scala.inline
  def apply(): SetRulePrioritiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetRulePrioritiesOutput]
  }
  
  @scala.inline
  implicit class SetRulePrioritiesOutputMutableBuilder[Self <: SetRulePrioritiesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
