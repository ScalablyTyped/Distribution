package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesesPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] = js.native
  
  @JSName("type")
  var type_ParenthesesPlain: typings.cssTree.cssTreeStrings.Parentheses = js.native
}
object ParenthesesPlain {
  
  @scala.inline
  def apply(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.Parentheses): ParenthesesPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParenthesesPlain]
  }
  
  @scala.inline
  implicit class ParenthesesPlainMutableBuilder[Self <: ParenthesesPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Parentheses): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
