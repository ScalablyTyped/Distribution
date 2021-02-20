package typings.baseui.anon

import typings.baseui.baseuiStrings.GN
import typings.baseui.baseuiStrings.Plussign224
import typings.baseui.baseuiStrings.`Guinea LeftparenthesisGuinéeRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `83` extends StObject {
  
  var dialCode: Plussign224 = js.native
  
  var id: GN = js.native
  
  var label: `Guinea LeftparenthesisGuinéeRightparenthesis` = js.native
}
object `83` {
  
  @scala.inline
  def apply(dialCode: Plussign224, id: GN, label: `Guinea LeftparenthesisGuinéeRightparenthesis`): `83` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`83`]
  }
  
  @scala.inline
  implicit class `83MutableBuilder`[Self <: `83`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign224): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: GN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Guinea LeftparenthesisGuinéeRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
