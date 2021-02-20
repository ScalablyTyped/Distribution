package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign7
import typings.baseui.baseuiStrings.RU
import typings.baseui.baseuiStrings.`Russia LeftparenthesisРоссияRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `170` extends StObject {
  
  var dialCode: Plussign7 = js.native
  
  var id: RU = js.native
  
  var label: `Russia LeftparenthesisРоссияRightparenthesis` = js.native
}
object `170` {
  
  @scala.inline
  def apply(dialCode: Plussign7, id: RU, label: `Russia LeftparenthesisРоссияRightparenthesis`): `170` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit class `170MutableBuilder`[Self <: `170`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign7): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Russia LeftparenthesisРоссияRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
