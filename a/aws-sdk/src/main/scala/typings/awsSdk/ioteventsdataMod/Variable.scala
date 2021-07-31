package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variable extends StObject {
  
  /**
    * The name of the variable.
    */
  var name: VariableName
  
  /**
    * The current value of the variable.
    */
  var value: VariableValue
}
object Variable {
  
  @scala.inline
  def apply(name: VariableName, value: VariableValue): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  
  @scala.inline
  implicit class VariableMutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: VariableName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
