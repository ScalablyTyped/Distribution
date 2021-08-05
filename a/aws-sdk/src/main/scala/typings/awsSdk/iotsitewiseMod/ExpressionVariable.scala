package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionVariable extends StObject {
  
  /**
    * The friendly name of the variable to be used in the expression.
    */
  var name: VariableName
  
  /**
    * The variable that identifies an asset property from which to use values.
    */
  var value: VariableValue
}
object ExpressionVariable {
  
  inline def apply(name: VariableName, value: VariableValue): ExpressionVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionVariable]
  }
  
  extension [Self <: ExpressionVariable](x: Self) {
    
    inline def setName(value: VariableName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
