package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign7
import typings.baseui.baseuiStrings.RU
import typings.baseui.baseuiStrings.`Russia LeftparenthesisРоссияRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  var dialCode: Plussign7
  
  var id: RU
  
  var label: `Russia LeftparenthesisРоссияRightparenthesis`
}
object `170` {
  
  @scala.inline
  def apply(): `170` = {
    val __obj = js.Dynamic.literal(dialCode = "+7", id = "RU", label = "Russia (\u0420\u043E\u0441\u0441\u0438\u044F)")
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit class `170MutableBuilder`[Self <: `170`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign7): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Russia LeftparenthesisРоссияRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
