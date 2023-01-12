package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedRule extends StObject {
  
  /**
    * The unique identifier for the rule to exclude from the rule group.
    */
  var RuleId: ResourceId
}
object ExcludedRule {
  
  inline def apply(RuleId: ResourceId): ExcludedRule = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedRule] (val x: Self) extends AnyVal {
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
