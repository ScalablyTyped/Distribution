package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVariableAction extends StObject {
  
  /**
    * The new value of the variable.
    */
  var value: VariableValue
  
  /**
    * The name of the variable.
    */
  var variableName: VariableName
}
object SetVariableAction {
  
  @scala.inline
  def apply(value: VariableValue, variableName: VariableName): SetVariableAction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVariableAction]
  }
  
  @scala.inline
  implicit class SetVariableActionMutableBuilder[Self <: SetVariableAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableName(value: VariableName): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
  }
}
