package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionExpression extends StObject {
  
  /**
    * A specific condition to apply to a recipe action. For more information, see Recipe structure in the Glue DataBrew Developer Guide.
    */
  var Condition: typings.awsSdk.databrewMod.Condition
  
  /**
    * A column to apply this condition to.
    */
  var TargetColumn: typings.awsSdk.databrewMod.TargetColumn
  
  /**
    * A value that the condition must evaluate to for the condition to succeed.
    */
  var Value: js.UndefOr[ConditionValue] = js.undefined
}
object ConditionExpression {
  
  inline def apply(Condition: Condition, TargetColumn: TargetColumn): ConditionExpression = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], TargetColumn = TargetColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionExpression]
  }
  
  extension [Self <: ConditionExpression](x: Self) {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setTargetColumn(value: TargetColumn): Self = StObject.set(x, "TargetColumn", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ConditionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
