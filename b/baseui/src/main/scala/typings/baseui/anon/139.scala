package typings.baseui.anon

import typings.baseui.baseuiStrings.MZ
import typings.baseui.baseuiStrings.Plussign258
import typings.baseui.baseuiStrings.`Mozambique LeftparenthesisMoçambiqueRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `139` extends StObject {
  
  var dialCode: Plussign258 = js.native
  
  var id: MZ = js.native
  
  var label: `Mozambique LeftparenthesisMoçambiqueRightparenthesis` = js.native
}
object `139` {
  
  @scala.inline
  def apply(dialCode: Plussign258, id: MZ, label: `Mozambique LeftparenthesisMoçambiqueRightparenthesis`): `139` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`139`]
  }
  
  @scala.inline
  implicit class `139MutableBuilder`[Self <: `139`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign258): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mozambique LeftparenthesisMoçambiqueRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
