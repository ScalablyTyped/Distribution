package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionExpression extends StObject {
  
  /**
    * A specific condition to apply to a recipe action. For more information, see Recipe structure in the AWS Glue DataBrew Developer Guide.
    */
  var Condition: typings.awsSdk.databrewMod.Condition = js.native
  
  /**
    * A column to apply this condition to, within an AWS Glue DataBrew dataset.
    */
  var TargetColumn: typings.awsSdk.databrewMod.TargetColumn = js.native
  
  /**
    * A value that the condition must evaluate to for the condition to succeed.
    */
  var Value: js.UndefOr[ConditionValue] = js.native
}
object ConditionExpression {
  
  @scala.inline
  def apply(Condition: Condition, TargetColumn: TargetColumn): ConditionExpression = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], TargetColumn = TargetColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionExpression]
  }
  
  @scala.inline
  implicit class ConditionExpressionMutableBuilder[Self <: ConditionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetColumn(value: TargetColumn): Self = StObject.set(x, "TargetColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ConditionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
