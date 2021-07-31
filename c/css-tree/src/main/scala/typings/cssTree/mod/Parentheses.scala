package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parentheses
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_Parentheses: typings.cssTree.cssTreeStrings.Parentheses
}
object Parentheses {
  
  @scala.inline
  def apply(children: List[CssNode]): Parentheses = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parentheses")
    __obj.asInstanceOf[Parentheses]
  }
  
  @scala.inline
  implicit class ParenthesesMutableBuilder[Self <: Parentheses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Parentheses): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
