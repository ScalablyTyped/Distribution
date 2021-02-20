package typings.baseui.anon

import typings.baseui.baseuiStrings.FJ
import typings.baseui.baseuiStrings.Fiji
import typings.baseui.baseuiStrings.Plussign679
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `65` extends StObject {
  
  var dialCode: Plussign679 = js.native
  
  var id: FJ = js.native
  
  var label: Fiji = js.native
}
object `65` {
  
  @scala.inline
  def apply(dialCode: Plussign679, id: FJ, label: Fiji): `65` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`65`]
  }
  
  @scala.inline
  implicit class `65MutableBuilder`[Self <: `65`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign679): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Fiji): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
