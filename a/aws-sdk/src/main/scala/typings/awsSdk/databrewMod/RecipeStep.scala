package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeStep extends js.Object {
  
  /**
    * The particular action to be performed in the recipe step.
    */
  var Action: RecipeAction = js.native
  
  /**
    * One or more conditions that must be met, in order for the recipe step to succeed.  All of the conditions in the array must be met. In other words, all of the conditions must be combined using a logical AND operation. 
    */
  var ConditionExpressions: js.UndefOr[ConditionExpressionList] = js.native
}
object RecipeStep {
  
  @scala.inline
  def apply(Action: RecipeAction): RecipeStep = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeStep]
  }
  
  @scala.inline
  implicit class RecipeStepOps[Self <: RecipeStep] (val x: Self) extends AnyVal {
    
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
    def setAction(value: RecipeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressionsVarargs(value: ConditionExpression*): Self = this.set("ConditionExpressions", js.Array(value :_*))
    
    @scala.inline
    def setConditionExpressions(value: ConditionExpressionList): Self = this.set("ConditionExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionExpressions: Self = this.set("ConditionExpressions", js.undefined)
  }
}
