package typings.baseui.anon

import typings.baseui.baseuiStrings.MA
import typings.baseui.baseuiStrings.Plussign212
import typings.baseui.baseuiStrings.`Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `138` extends StObject {
  
  var dialCode: Plussign212 = js.native
  
  var id: MA = js.native
  
  var label: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis` = js.native
}
object `138` {
  
  @scala.inline
  def apply(dialCode: Plussign212, id: MA, label: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`): `138` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`138`]
  }
  
  @scala.inline
  implicit class `138MutableBuilder`[Self <: `138`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign212): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
