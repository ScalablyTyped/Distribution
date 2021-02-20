package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign503
import typings.baseui.baseuiStrings.SV
import typings.baseui.baseuiStrings.`El Salvador`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `58` extends StObject {
  
  var dialCode: Plussign503 = js.native
  
  var id: SV = js.native
  
  var label: `El Salvador` = js.native
}
object `58` {
  
  @scala.inline
  def apply(dialCode: Plussign503, id: SV, label: `El Salvador`): `58` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`58`]
  }
  
  @scala.inline
  implicit class `58MutableBuilder`[Self <: `58`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign503): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `El Salvador`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
