package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCondition extends StObject {
  
  /**
    * The action setting that a log record must contain in order to meet the condition. This is the action that WAF applied to the web request.  For rule groups, this is either the configured rule action setting, or if you've applied a rule action override to the rule, it's the override action. The value EXCLUDED_AS_COUNT matches on excluded rules and also on rules that have a rule action override of Count. 
    */
  var Action: ActionValue
}
object ActionCondition {
  
  inline def apply(Action: ActionValue): ActionCondition = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionCondition] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ActionValue): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
  }
}
