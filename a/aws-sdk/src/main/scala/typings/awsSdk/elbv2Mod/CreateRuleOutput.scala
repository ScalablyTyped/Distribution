package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleOutput extends StObject {
  
  /**
    * Information about the rule.
    */
  var Rules: js.UndefOr[typings.awsSdk.elbv2Mod.Rules] = js.undefined
}
object CreateRuleOutput {
  
  @scala.inline
  def apply(): CreateRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleOutput]
  }
  
  @scala.inline
  implicit class CreateRuleOutputMutableBuilder[Self <: CreateRuleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
