package typings.contentfulManagement.anon

import typings.contentfulManagement.contentfulManagementStrings.all
import typings.contentfulManagement.roleMod.ActionType
import typings.contentfulManagement.roleMod.ConstraintType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.Array[ActionType] | all
  
  var constraint: ConstraintType
  
  var effect: String
}
object Actions {
  
  inline def apply(actions: js.Array[ActionType] | all, constraint: ConstraintType, effect: String): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: js.Array[ActionType] | all): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ActionType*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setConstraint(value: ConstraintType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
  }
}
