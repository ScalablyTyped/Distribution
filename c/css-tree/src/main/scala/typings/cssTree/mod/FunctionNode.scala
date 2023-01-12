package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionNode
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typings.cssTree.mod.List[CssNode]
  
  var name: String
  
  @JSName("type")
  var type_FunctionNode: Function
}
object FunctionNode {
  
  inline def apply(children: typings.cssTree.mod.List[CssNode], name: String): FunctionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[FunctionNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionNode] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: typings.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
