package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeStep extends StObject {
  
  /**
    * The particular action to be performed in the recipe step.
    */
  var Action: RecipeAction
  
  /**
    * One or more conditions that must be met, in order for the recipe step to succeed.  All of the conditions in the array must be met. In other words, all of the conditions must be combined using a logical AND operation. 
    */
  var ConditionExpressions: js.UndefOr[ConditionExpressionList] = js.undefined
}
object RecipeStep {
  
  @scala.inline
  def apply(Action: RecipeAction): RecipeStep = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeStep]
  }
  
  @scala.inline
  implicit class RecipeStepMutableBuilder[Self <: RecipeStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RecipeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressions(value: ConditionExpressionList): Self = StObject.set(x, "ConditionExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressionsUndefined: Self = StObject.set(x, "ConditionExpressions", js.undefined)
    
    @scala.inline
    def setConditionExpressionsVarargs(value: ConditionExpression*): Self = StObject.set(x, "ConditionExpressions", js.Array(value :_*))
  }
}
