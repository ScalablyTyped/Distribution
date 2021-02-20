package typings.baseui.anon

import typings.baseui.baseuiStrings.CY
import typings.baseui.baseuiStrings.Plussign357
import typings.baseui.baseuiStrings.`Cyprus LeftparenthesisΚύπροςRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `50` extends StObject {
  
  var dialCode: Plussign357 = js.native
  
  var id: CY = js.native
  
  var label: `Cyprus LeftparenthesisΚύπροςRightparenthesis` = js.native
}
object `50` {
  
  @scala.inline
  def apply(dialCode: Plussign357, id: CY, label: `Cyprus LeftparenthesisΚύπροςRightparenthesis`): `50` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
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
