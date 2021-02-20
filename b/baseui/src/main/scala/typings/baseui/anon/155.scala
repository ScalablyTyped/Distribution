package typings.baseui.anon

import typings.baseui.baseuiStrings.OM
import typings.baseui.baseuiStrings.Plussign968
import typings.baseui.baseuiStrings.`Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `155` extends StObject {
  
  var dialCode: Plussign968 = js.native
  
  var id: OM = js.native
  
  var label: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis` = js.native
}
object `155` {
  
  @scala.inline
  def apply(dialCode: Plussign968, id: OM, label: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`): `155` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit class `155MutableBuilder`[Self <: `155`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign968): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: OM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
