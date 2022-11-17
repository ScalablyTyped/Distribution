package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpreterDirective_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_InterpreterDirective_ : "InterpreterDirective"
  
  var value: String
}
object InterpreterDirective_ {
  
  inline def apply(value: String): InterpreterDirective_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[InterpreterDirective_]
  }
  
  extension [Self <: InterpreterDirective_](x: Self) {
    
    inline def setType(value: "InterpreterDirective"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
