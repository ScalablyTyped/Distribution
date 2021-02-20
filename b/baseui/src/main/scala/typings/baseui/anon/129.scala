package typings.baseui.anon

import typings.baseui.baseuiStrings.MU
import typings.baseui.baseuiStrings.Plussign230
import typings.baseui.baseuiStrings.`Mauritius LeftparenthesisMorisRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `129` extends StObject {
  
  var dialCode: Plussign230 = js.native
  
  var id: MU = js.native
  
  var label: `Mauritius LeftparenthesisMorisRightparenthesis` = js.native
}
object `129` {
  
  @scala.inline
  def apply(dialCode: Plussign230, id: MU, label: `Mauritius LeftparenthesisMorisRightparenthesis`): `129` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit class `129MutableBuilder`[Self <: `129`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign230): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mauritius LeftparenthesisMorisRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
