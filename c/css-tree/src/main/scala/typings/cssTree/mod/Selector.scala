package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selector
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typings.cssTree.mod.List[CssNode]
  
  @JSName("type")
  var type_Selector: typings.cssTree.cssTreeStrings.Selector
}
object Selector {
  
  inline def apply(children: typings.cssTree.mod.List[CssNode]): Selector = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selector] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: typings.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.Selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
