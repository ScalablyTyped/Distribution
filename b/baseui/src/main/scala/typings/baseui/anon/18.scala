package typings.baseui.anon

import typings.baseui.baseuiStrings.BT
import typings.baseui.baseuiStrings.Plussign975
import typings.baseui.baseuiStrings.`Bhutan LeftparenthesisའབྲུགRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18` extends StObject {
  
  var dialCode: Plussign975 = js.native
  
  var id: BT = js.native
  
  var label: `Bhutan LeftparenthesisའབྲུགRightparenthesis` = js.native
}
object `18` {
  
  @scala.inline
  def apply(dialCode: Plussign975, id: BT, label: `Bhutan LeftparenthesisའབྲུགRightparenthesis`): `18` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign975): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Bhutan LeftparenthesisའབྲུགRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
