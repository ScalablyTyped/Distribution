package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selector
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_Selector: typings.cssTree.cssTreeStrings.Selector
}
object Selector {
  
  @scala.inline
  def apply(children: List[CssNode]): Selector = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  implicit class SelectorMutableBuilder[Self <: Selector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
