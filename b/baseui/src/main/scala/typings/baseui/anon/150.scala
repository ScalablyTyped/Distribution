package typings.baseui.anon

import typings.baseui.baseuiStrings.NU
import typings.baseui.baseuiStrings.Niue
import typings.baseui.baseuiStrings.Plussign683
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `150` extends StObject {
  
  var dialCode: Plussign683 = js.native
  
  var id: NU = js.native
  
  var label: Niue = js.native
}
object `150` {
  
  @scala.inline
  def apply(dialCode: Plussign683, id: NU, label: Niue): `150` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`150`]
  }
  
  @scala.inline
  implicit class `150MutableBuilder`[Self <: `150`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign683): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Niue): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
