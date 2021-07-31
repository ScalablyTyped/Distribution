package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoElementSelector
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode] | Null
  
  var name: String
  
  @JSName("type")
  var type_PseudoElementSelector: typings.cssTree.cssTreeStrings.PseudoElementSelector
}
object PseudoElementSelector {
  
  @scala.inline
  def apply(name: String): PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoElementSelector")
    __obj.asInstanceOf[PseudoElementSelector]
  }
  
  @scala.inline
  implicit class PseudoElementSelectorMutableBuilder[Self <: PseudoElementSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.PseudoElementSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
