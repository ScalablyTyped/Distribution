package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtrulePreludePlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_AtrulePreludePlain: typings.cssTree.cssTreeStrings.AtrulePrelude
}
object AtrulePreludePlain {
  
  inline def apply(children: js.Array[CssNodePlain]): AtrulePreludePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtrulePrelude")
    __obj.asInstanceOf[AtrulePreludePlain]
  }
  
  extension [Self <: AtrulePreludePlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: typings.cssTree.cssTreeStrings.AtrulePrelude): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
