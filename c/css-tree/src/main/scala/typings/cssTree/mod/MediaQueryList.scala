package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryList
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_MediaQueryList: typings.cssTree.cssTreeStrings.MediaQueryList
}
object MediaQueryList {
  
  @scala.inline
  def apply(children: List[CssNode]): MediaQueryList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQueryList")
    __obj.asInstanceOf[MediaQueryList]
  }
  
  @scala.inline
  implicit class MediaQueryListMutableBuilder[Self <: MediaQueryList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.MediaQueryList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
