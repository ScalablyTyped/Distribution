package typings.baseui.anon

import typings.baseui.baseuiStrings.IL
import typings.baseui.baseuiStrings.Plussign972
import typings.baseui.baseuiStrings.`Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `97` extends StObject {
  
  var dialCode: Plussign972 = js.native
  
  var id: IL = js.native
  
  var label: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis` = js.native
}
object `97` {
  
  @scala.inline
  def apply(dialCode: Plussign972, id: IL, label: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`): `97` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit class `97MutableBuilder`[Self <: `97`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign972): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
