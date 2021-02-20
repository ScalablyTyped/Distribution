package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorListPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] = js.native
  
  @JSName("type")
  var type_SelectorListPlain: typings.cssTree.cssTreeStrings.SelectorList = js.native
}
object SelectorListPlain {
  
  @scala.inline
  def apply(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.SelectorList): SelectorListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorListPlain]
  }
  
  @scala.inline
  implicit class SelectorListPlainMutableBuilder[Self <: SelectorListPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.SelectorList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
