package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign670
import typings.baseui.baseuiStrings.TL
import typings.baseui.baseuiStrings.`Timor-Leste`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `209` extends StObject {
  
  var dialCode: Plussign670 = js.native
  
  var id: TL = js.native
  
  var label: `Timor-Leste` = js.native
}
object `209` {
  
  @scala.inline
  def apply(dialCode: Plussign670, id: TL, label: `Timor-Leste`): `209` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`209`]
  }
  
  @scala.inline
  implicit class `209MutableBuilder`[Self <: `209`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign670): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Timor-Leste`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
