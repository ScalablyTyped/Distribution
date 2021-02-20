package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtrulePreludePlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] = js.native
  
  @JSName("type")
  var type_AtrulePreludePlain: typings.cssTree.cssTreeStrings.AtrulePrelude = js.native
}
object AtrulePreludePlain {
  
  @scala.inline
  def apply(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.AtrulePrelude): AtrulePreludePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePreludePlain]
  }
  
  @scala.inline
  implicit class AtrulePreludePlainMutableBuilder[Self <: AtrulePreludePlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.AtrulePrelude): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
