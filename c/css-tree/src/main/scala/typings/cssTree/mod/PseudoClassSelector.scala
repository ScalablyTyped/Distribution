package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoClassSelector
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typings.cssTree.mod.List[CssNode] | Null
  
  var name: String
  
  @JSName("type")
  var type_PseudoClassSelector: typings.cssTree.cssTreeStrings.PseudoClassSelector
}
object PseudoClassSelector {
  
  inline def apply(name: String): PseudoClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoClassSelector")
    __obj.asInstanceOf[PseudoClassSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PseudoClassSelector] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: typings.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.PseudoClassSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
