package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParenthesesPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_ParenthesesPlain: typings.cssTree.cssTreeStrings.Parentheses
}
object ParenthesesPlain {
  
  inline def apply(children: js.Array[CssNodePlain]): ParenthesesPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parentheses")
    __obj.asInstanceOf[ParenthesesPlain]
  }
  
  extension [Self <: ParenthesesPlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Parentheses): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
