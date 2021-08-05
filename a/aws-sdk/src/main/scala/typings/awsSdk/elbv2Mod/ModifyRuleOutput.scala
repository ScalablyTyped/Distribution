package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyRuleOutput extends StObject {
  
  /**
    * Information about the modified rule.
    */
  var Rules: js.UndefOr[typings.awsSdk.elbv2Mod.Rules] = js.undefined
}
object ModifyRuleOutput {
  
  inline def apply(): ModifyRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyRuleOutput]
  }
  
  extension [Self <: ModifyRuleOutput](x: Self) {
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
