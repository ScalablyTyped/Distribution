package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionExpression extends js.Object {
  
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
  implicit class ConditionExpressionOps[Self <: ConditionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCondition(value: Condition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetColumn(value: TargetColumn): Self = this.set("TargetColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ConditionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
