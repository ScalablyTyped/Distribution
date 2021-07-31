package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheet
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_StyleSheet: typings.cssTree.cssTreeStrings.StyleSheet
}
object StyleSheet {
  
  @scala.inline
  def apply(children: List[CssNode]): StyleSheet = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StyleSheet")
    __obj.asInstanceOf[StyleSheet]
  }
  
  @scala.inline
  implicit class StyleSheetMutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.StyleSheet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
