package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionNodePlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  var name: String
  
  @JSName("type")
  var type_FunctionNodePlain: Function
}
object FunctionNodePlain {
  
  inline def apply(children: js.Array[CssNodePlain], name: String): FunctionNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[FunctionNodePlain]
  }
  
  extension [Self <: FunctionNodePlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
