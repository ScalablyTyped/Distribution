package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDefinition extends StObject {
  
  /**
    * The name of the variable.
    */
  var name: VariableName = js.native
  
  /**
    * The new value of the variable.
    */
  var value: VariableValue = js.native
}
object VariableDefinition {
  
  @scala.inline
  def apply(name: VariableName, value: VariableValue): VariableDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDefinition]
  }
  
  @scala.inline
  implicit class VariableDefinitionMutableBuilder[Self <: VariableDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: VariableName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
