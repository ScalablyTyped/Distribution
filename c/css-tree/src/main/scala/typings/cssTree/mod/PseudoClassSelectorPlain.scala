package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoClassSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_PseudoClassSelectorPlain: typings.cssTree.cssTreeStrings.PseudoClassSelector = js.native
}
object PseudoClassSelectorPlain {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector): PseudoClassSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoClassSelectorPlain]
  }
  
  @scala.inline
  implicit class PseudoClassSelectorPlainMutableBuilder[Self <: PseudoClassSelectorPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.PseudoClassSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
