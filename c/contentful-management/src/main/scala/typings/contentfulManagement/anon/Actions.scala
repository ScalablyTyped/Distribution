package typings.contentfulManagement.anon

import typings.contentfulManagement.contentfulManagementStrings.all
import typings.contentfulManagement.roleMod.ActionType
import typings.contentfulManagement.roleMod.ConstraintType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends js.Object {
  
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
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: ActionType*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ActionType] | all): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraint(value: ConstraintType): Self = this.set("constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
  }
}
