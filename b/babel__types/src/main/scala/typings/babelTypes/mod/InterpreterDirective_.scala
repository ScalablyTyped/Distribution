package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterpreterDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpreterDirective_
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_InterpreterDirective_ : InterpreterDirective = js.native
  
  var value: String = js.native
}
object InterpreterDirective_ {
  
  @scala.inline
  def apply(`type`: InterpreterDirective, value: String): InterpreterDirective_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
