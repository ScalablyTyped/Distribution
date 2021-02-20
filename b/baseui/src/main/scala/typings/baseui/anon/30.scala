package typings.baseui.anon

import typings.baseui.baseuiStrings.CM
import typings.baseui.baseuiStrings.Plussign237
import typings.baseui.baseuiStrings.`Cameroon LeftparenthesisCamerounRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `30` extends StObject {
  
  var dialCode: Plussign237 = js.native
  
  var id: CM = js.native
  
  var label: `Cameroon LeftparenthesisCamerounRightparenthesis` = js.native
}
object `30` {
  
  @scala.inline
  def apply(dialCode: Plussign237, id: CM, label: `Cameroon LeftparenthesisCamerounRightparenthesis`): `30` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30MutableBuilder`[Self <: `30`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign237): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Cameroon LeftparenthesisCamerounRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
