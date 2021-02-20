package typings.baseui.anon

import typings.baseui.baseuiStrings.MR
import typings.baseui.baseuiStrings.Plussign222
import typings.baseui.baseuiStrings.`Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `128` extends StObject {
  
  var dialCode: Plussign222 = js.native
  
  var id: MR = js.native
  
  var label: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis` = js.native
}
object `128` {
  
  @scala.inline
  def apply(dialCode: Plussign222, id: MR, label: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`): `128` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`128`]
  }
  
  @scala.inline
  implicit class `128MutableBuilder`[Self <: `128`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign222): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
