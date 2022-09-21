package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryListPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_MediaQueryListPlain: typings.cssTree.cssTreeStrings.MediaQueryList
}
object MediaQueryListPlain {
  
  inline def apply(children: js.Array[CssNodePlain]): MediaQueryListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQueryList")
    __obj.asInstanceOf[MediaQueryListPlain]
  }
  
  extension [Self <: MediaQueryListPlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: typings.cssTree.cssTreeStrings.MediaQueryList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
