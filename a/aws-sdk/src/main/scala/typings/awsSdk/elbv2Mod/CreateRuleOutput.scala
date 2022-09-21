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
  
  inline def apply(): CreateRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleOutput]
  }
  
  extension [Self <: CreateRuleOutput](x: Self) {
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
