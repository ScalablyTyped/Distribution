package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_Value: typings.cssTree.cssTreeStrings.Value
}
object Value {
  
  @scala.inline
  def apply(children: List[CssNode]): Value = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Value")
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
