package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedRule extends StObject {
  
  /** A matching rule's ID. */
  var ruleId: Double
  
  /** ID of the Ruleset this rule belongs to.
    * For a rule originating from the set of dynamic rules, this will be equal to DYNAMIC_RULESET_ID.
    */
  var rulesetId: String
}
object MatchedRule {
  
  inline def apply(ruleId: Double, rulesetId: String): MatchedRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any], rulesetId = rulesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchedRule] (val x: Self) extends AnyVal {
    
    inline def setRuleId(value: Double): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRulesetId(value: String): Self = StObject.set(x, "rulesetId", value.asInstanceOf[js.Any])
  }
}
