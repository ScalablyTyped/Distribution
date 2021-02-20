package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnicodeRange
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_UnicodeRange: typings.cssTree.cssTreeStrings.UnicodeRange = js.native
  
  var value: String = js.native
}
object UnicodeRange {
  
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.UnicodeRange, value: String): UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeRange]
  }
  
  @scala.inline
  implicit class UnicodeRangeMutableBuilder[Self <: UnicodeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.UnicodeRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
