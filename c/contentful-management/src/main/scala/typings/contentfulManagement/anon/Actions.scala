package typings.contentfulManagement.anon

import typings.contentfulManagement.contentfulManagementStrings.all
import typings.contentfulManagement.roleMod.ActionType
import typings.contentfulManagement.roleMod.ConstraintType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends StObject {
  
  var actions: js.Array[ActionType] | all = js.native
  
  var constraint: ConstraintType = js.native
  
  var effect: String = js.native
}
object Actions {
  
  @scala.inline
  def apply(actions: js.Array[ActionType] | all, constraint: ConstraintType, effect: String): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ActionType] | all): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ActionType*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setConstraint(value: ConstraintType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
  }
}
