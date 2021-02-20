package typings.baseui.anon

import typings.baseui.baseuiStrings.IR
import typings.baseui.baseuiStrings.Plussign98
import typings.baseui.baseuiStrings.`Iran Leftparenthesis‫ایران‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `93` extends StObject {
  
  var dialCode: Plussign98 = js.native
  
  var id: IR = js.native
  
  var label: `Iran Leftparenthesis‫ایران‬‎Rightparenthesis` = js.native
}
object `93` {
  
  @scala.inline
  def apply(dialCode: Plussign98, id: IR, label: `Iran Leftparenthesis‫ایران‬‎Rightparenthesis`): `93` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit class `93MutableBuilder`[Self <: `93`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign98): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Iran Leftparenthesis‫ایران‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
