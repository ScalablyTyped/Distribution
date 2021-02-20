package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryListPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] = js.native
  
  @JSName("type")
  var type_MediaQueryListPlain: typings.cssTree.cssTreeStrings.MediaQueryList = js.native
}
object MediaQueryListPlain {
  
  @scala.inline
  def apply(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.MediaQueryList): MediaQueryListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryListPlain]
  }
  
  @scala.inline
  implicit class MediaQueryListPlainMutableBuilder[Self <: MediaQueryListPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.MediaQueryList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
