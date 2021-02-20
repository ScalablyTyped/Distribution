package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign381
import typings.baseui.baseuiStrings.RS
import typings.baseui.baseuiStrings.`Serbia LeftparenthesisСрбијаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `184` extends StObject {
  
  var dialCode: Plussign381 = js.native
  
  var id: RS = js.native
  
  var label: `Serbia LeftparenthesisСрбијаRightparenthesis` = js.native
}
object `184` {
  
  @scala.inline
  def apply(dialCode: Plussign381, id: RS, label: `Serbia LeftparenthesisСрбијаRightparenthesis`): `184` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`184`]
  }
  
  @scala.inline
  implicit class `184MutableBuilder`[Self <: `184`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign381): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Serbia LeftparenthesisСрбијаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
