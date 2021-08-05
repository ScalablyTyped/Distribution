package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WafExcludedRule extends StObject {
  
  /**
    * The unique identifier for the rule to exclude from the rule group.
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.undefined
}
object WafExcludedRule {
  
  inline def apply(): WafExcludedRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafExcludedRule]
  }
  
  extension [Self <: WafExcludedRule](x: Self) {
    
    inline def setRuleId(value: NonEmptyString): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
  }
}
