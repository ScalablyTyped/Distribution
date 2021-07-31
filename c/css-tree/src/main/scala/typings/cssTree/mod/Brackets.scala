package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brackets
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_Brackets: typings.cssTree.cssTreeStrings.Brackets
}
object Brackets {
  
  @scala.inline
  def apply(children: List[CssNode]): Brackets = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Brackets")
    __obj.asInstanceOf[Brackets]
  }
  
  @scala.inline
  implicit class BracketsMutableBuilder[Self <: Brackets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Brackets): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
