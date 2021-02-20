package typings.baseui.anon

import typings.baseui.baseuiStrings.LA
import typings.baseui.baseuiStrings.Plussign856
import typings.baseui.baseuiStrings.`Laos LeftparenthesisລາວRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `109` extends StObject {
  
  var dialCode: Plussign856 = js.native
  
  var id: LA = js.native
  
  var label: `Laos LeftparenthesisລາວRightparenthesis` = js.native
}
object `109` {
  
  @scala.inline
  def apply(dialCode: Plussign856, id: LA, label: `Laos LeftparenthesisລາວRightparenthesis`): `109` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit class `109MutableBuilder`[Self <: `109`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign856): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Laos LeftparenthesisລາວRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
