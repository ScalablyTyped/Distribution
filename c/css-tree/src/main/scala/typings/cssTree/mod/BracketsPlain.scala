package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BracketsPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_BracketsPlain: typings.cssTree.cssTreeStrings.Brackets
}
object BracketsPlain {
  
  @scala.inline
  def apply(children: js.Array[CssNodePlain]): BracketsPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Brackets")
    __obj.asInstanceOf[BracketsPlain]
  }
  
  @scala.inline
  implicit class BracketsPlainMutableBuilder[Self <: BracketsPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Brackets): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
