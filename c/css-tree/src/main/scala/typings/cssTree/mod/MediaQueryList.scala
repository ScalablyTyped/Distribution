package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryList
  extends CssNodeCommon
     with CssNode {
  
  var children: List[CssNode] = js.native
  
  @JSName("type")
  var type_MediaQueryList: typings.cssTree.cssTreeStrings.MediaQueryList = js.native
}
object MediaQueryList {
  
  @scala.inline
  def apply(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.MediaQueryList): MediaQueryList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
