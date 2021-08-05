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
  
  inline def apply(children: List[CssNode]): DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclarationList")
    __obj.asInstanceOf[DeclarationList]
  }
  
  extension [Self <: DeclarationList](x: Self) {
    
    inline def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.DeclarationList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
