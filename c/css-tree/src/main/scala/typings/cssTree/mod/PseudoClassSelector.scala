package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoClassSelector
  extends CssNodeCommon
     with CssNode {
  
  var children: List[CssNode] | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_PseudoClassSelector: typings.cssTree.cssTreeStrings.PseudoClassSelector = js.native
}
object PseudoClassSelector {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector): PseudoClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoClassSelector]
  }
  
  @scala.inline
  implicit class PseudoClassSelectorMutableBuilder[Self <: PseudoClassSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.PseudoClassSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
