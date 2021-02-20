package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign678
import typings.baseui.baseuiStrings.VU
import typings.baseui.baseuiStrings.Vanuatu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `227` extends StObject {
  
  var dialCode: Plussign678 = js.native
  
  var id: VU = js.native
  
  var label: Vanuatu = js.native
}
object `227` {
  
  @scala.inline
  def apply(dialCode: Plussign678, id: VU, label: Vanuatu): `227` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`227`]
  }
  
  @scala.inline
  implicit class `227MutableBuilder`[Self <: `227`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign678): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Vanuatu): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
