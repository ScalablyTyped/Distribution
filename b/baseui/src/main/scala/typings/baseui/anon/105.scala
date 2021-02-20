package typings.baseui.anon

import typings.baseui.baseuiStrings.KI
import typings.baseui.baseuiStrings.Kiribati
import typings.baseui.baseuiStrings.Plussign686
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `105` extends StObject {
  
  var dialCode: Plussign686 = js.native
  
  var id: KI = js.native
  
  var label: Kiribati = js.native
}
object `105` {
  
  @scala.inline
  def apply(dialCode: Plussign686, id: KI, label: Kiribati): `105` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`105`]
  }
  
  @scala.inline
  implicit class `105MutableBuilder`[Self <: `105`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign686): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: KI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Kiribati): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
