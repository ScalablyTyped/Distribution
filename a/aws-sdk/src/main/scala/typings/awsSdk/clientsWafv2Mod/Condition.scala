package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * A single action condition. This is the action setting that a log record must contain in order to meet the condition.
    */
  var ActionCondition: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ActionCondition] = js.undefined
  
  /**
    * A single label name condition. This is the fully qualified label name that a log record must contain in order to meet the condition. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label. 
    */
  var LabelNameCondition: js.UndefOr[typings.awsSdk.clientsWafv2Mod.LabelNameCondition] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setActionCondition(value: ActionCondition): Self = StObject.set(x, "ActionCondition", value.asInstanceOf[js.Any])
    
    inline def setActionConditionUndefined: Self = StObject.set(x, "ActionCondition", js.undefined)
    
    inline def setLabelNameCondition(value: LabelNameCondition): Self = StObject.set(x, "LabelNameCondition", value.asInstanceOf[js.Any])
    
    inline def setLabelNameConditionUndefined: Self = StObject.set(x, "LabelNameCondition", js.undefined)
  }
}
