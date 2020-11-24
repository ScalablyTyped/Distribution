package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetVariableAction extends js.Object {
  
  /**
    * The new value of the variable.
    */
  var value: VariableValue = js.native
  
  /**
    * The name of the variable.
    */
  var variableName: VariableName = js.native
}
object SetVariableAction {
  
  @scala.inline
  def apply(value: VariableValue, variableName: VariableName): SetVariableAction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVariableAction]
  }
  
  @scala.inline
  implicit class SetVariableActionOps[Self <: SetVariableAction] (val x: Self) extends AnyVal {
    
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
    def setValue(value: VariableValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableName(value: VariableName): Self = this.set("variableName", value.asInstanceOf[js.Any])
  }
}
