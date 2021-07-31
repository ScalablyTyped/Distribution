package typings.baseui.anon

import typings.baseui.baseuiStrings.CY
import typings.baseui.baseuiStrings.Plussign357
import typings.baseui.baseuiStrings.`Cyprus LeftparenthesisΚύπροςRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var dialCode: Plussign357
  
  var id: CY
  
  var label: `Cyprus LeftparenthesisΚύπροςRightparenthesis`
}
object `50` {
  
  @scala.inline
  def apply(): `50` = {
    val __obj = js.Dynamic.literal(dialCode = "+357", id = "CY", label = "Cyprus (\u039A\u03CD\u03C0\u03C1\u03BF\u03C2)")
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit class `50MutableBuilder`[Self <: `50`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign357): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cyprus LeftparenthesisΚύπροςRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
