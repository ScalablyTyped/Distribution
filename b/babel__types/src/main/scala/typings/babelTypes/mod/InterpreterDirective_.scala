package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterpreterDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpreterDirective_
  extends StObject
     with BaseNode
     with _Node {
  
  @JSName("type")
  var type_InterpreterDirective_ : InterpreterDirective
  
  var value: String
}
object InterpreterDirective_ {
  
  @scala.inline
  def apply(value: String): InterpreterDirective_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[InterpreterDirective_]
  }
  
  @scala.inline
  implicit class InterpreterDirective_MutableBuilder[Self <: InterpreterDirective_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InterpreterDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
