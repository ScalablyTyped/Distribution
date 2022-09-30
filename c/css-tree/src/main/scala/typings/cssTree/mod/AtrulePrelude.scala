package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtrulePrelude
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typings.cssTree.mod.List[CssNode]
  
  @JSName("type")
  var type_AtrulePrelude: typings.cssTree.cssTreeStrings.AtrulePrelude
}
object AtrulePrelude {
  
  inline def apply(children: typings.cssTree.mod.List[CssNode]): AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtrulePrelude")
    __obj.asInstanceOf[AtrulePrelude]
  }
  
  extension [Self <: AtrulePrelude](x: Self) {
    
    inline def setChildren(value: typings.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.AtrulePrelude): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
