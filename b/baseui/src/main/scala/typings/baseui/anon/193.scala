package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign27
import typings.baseui.baseuiStrings.ZA
import typings.baseui.baseuiStrings.`South Africa`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `193` extends StObject {
  
  var dialCode: Plussign27 = js.native
  
  var id: ZA = js.native
  
  var label: `South Africa` = js.native
}
object `193` {
  
  @scala.inline
  def apply(dialCode: Plussign27, id: ZA, label: `South Africa`): `193` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit class `193MutableBuilder`[Self <: `193`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign27): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `South Africa`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
