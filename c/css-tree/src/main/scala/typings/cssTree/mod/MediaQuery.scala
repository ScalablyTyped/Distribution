package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQuery
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: List[CssNode]
  
  @JSName("type")
  var type_MediaQuery: typings.cssTree.cssTreeStrings.MediaQuery
}
object MediaQuery {
  
  @scala.inline
  def apply(children: List[CssNode]): MediaQuery = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQuery")
    __obj.asInstanceOf[MediaQuery]
  }
  
  @scala.inline
  implicit class MediaQueryMutableBuilder[Self <: MediaQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.MediaQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
