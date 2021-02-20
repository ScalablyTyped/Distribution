package typings.baseui.anon

import typings.baseui.baseuiStrings.LV
import typings.baseui.baseuiStrings.Plussign371
import typings.baseui.baseuiStrings.`Latvia LeftparenthesisLatvijaRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `110` extends StObject {
  
  var dialCode: Plussign371 = js.native
  
  var id: LV = js.native
  
  var label: `Latvia LeftparenthesisLatvijaRightparenthesis` = js.native
}
object `110` {
  
  @scala.inline
  def apply(dialCode: Plussign371, id: LV, label: `Latvia LeftparenthesisLatvijaRightparenthesis`): `110` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit class `110MutableBuilder`[Self <: `110`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign371): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Latvia LeftparenthesisLatvijaRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
