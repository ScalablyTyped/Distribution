package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarationList
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_DeclarationList: typings.cssTree.cssTreeStrings.DeclarationList
}
object DeclarationList {
  
  @scala.inline
  def apply(children: List[CssNode]): DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclarationList")
    __obj.asInstanceOf[DeclarationList]
  }
  
  @scala.inline
  implicit class DeclarationListMutableBuilder[Self <: DeclarationList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.DeclarationList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
