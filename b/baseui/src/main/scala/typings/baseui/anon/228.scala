package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign39
import typings.baseui.baseuiStrings.VA
import typings.baseui.baseuiStrings.`Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `228` extends StObject {
  
  var dialCode: Plussign39 = js.native
  
  var id: VA = js.native
  
  var label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis` = js.native
}
object `228` {
  
  @scala.inline
  def apply(
    dialCode: Plussign39,
    id: VA,
    label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
  ): `228` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`228`]
  }
  
  @scala.inline
  implicit class `228MutableBuilder`[Self <: `228`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign39): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: VA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
