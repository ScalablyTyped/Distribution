package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * The conditions to evaluate for the activity.
    */
  var Conditions: js.UndefOr[ListOfSimpleCondition] = js.undefined
  
  /**
    * Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions for an activity, whether both or only one of the conditions must be met for the activity to be performed.
    */
  var Operator: js.UndefOr[typings.awsSdk.pinpointMod.Operator] = js.undefined
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: ListOfSimpleCondition): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SimpleCondition*): Self = StObject.set(x, "Conditions", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: Operator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
  }
}
