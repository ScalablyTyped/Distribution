package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorList
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_SelectorList: typings.cssTree.cssTreeStrings.SelectorList
}
object SelectorList {
  
  @scala.inline
  def apply(children: List[CssNode]): SelectorList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectorList")
    __obj.asInstanceOf[SelectorList]
  }
  
  @scala.inline
  implicit class SelectorListMutableBuilder[Self <: SelectorList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.SelectorList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
