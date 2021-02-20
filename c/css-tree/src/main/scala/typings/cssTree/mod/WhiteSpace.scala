package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhiteSpace
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_WhiteSpace: typings.cssTree.cssTreeStrings.WhiteSpace = js.native
  
  var value: String = js.native
}
object WhiteSpace {
  
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.WhiteSpace, value: String): WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpace]
  }
  
  @scala.inline
  implicit class WhiteSpaceMutableBuilder[Self <: WhiteSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.WhiteSpace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
