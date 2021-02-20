package typings.baseui.anon

import typings.baseui.baseuiStrings.FI
import typings.baseui.baseuiStrings.Plussign358
import typings.baseui.baseuiStrings.`Finland LeftparenthesisSuomiRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `66` extends StObject {
  
  var dialCode: Plussign358 = js.native
  
  var id: FI = js.native
  
  var label: `Finland LeftparenthesisSuomiRightparenthesis` = js.native
}
object `66` {
  
  @scala.inline
  def apply(dialCode: Plussign358, id: FI, label: `Finland LeftparenthesisSuomiRightparenthesis`): `66` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`66`]
  }
  
  @scala.inline
  implicit class `66MutableBuilder`[Self <: `66`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign358): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Finland LeftparenthesisSuomiRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
