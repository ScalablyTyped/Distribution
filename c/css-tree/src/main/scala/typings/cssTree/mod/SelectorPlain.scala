package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_SelectorPlain: typings.cssTree.cssTreeStrings.Selector
}
object SelectorPlain {
  
  inline def apply(children: js.Array[CssNodePlain]): SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[SelectorPlain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectorPlain] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
