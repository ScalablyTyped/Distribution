package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexColor
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_HexColor: typings.cssTree.cssTreeStrings.HexColor
  
  var value: String
}
object HexColor {
  
  @scala.inline
  def apply(value: String): HexColor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexColor")
    __obj.asInstanceOf[HexColor]
  }
  
  @scala.inline
  implicit class HexColorMutableBuilder[Self <: HexColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.HexColor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
