package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign249
import typings.baseui.baseuiStrings.SD
import typings.baseui.baseuiStrings.`Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `198` extends StObject {
  
  var dialCode: Plussign249 = js.native
  
  var id: SD = js.native
  
  var label: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis` = js.native
}
object `198` {
  
  @scala.inline
  def apply(dialCode: Plussign249, id: SD, label: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`): `198` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`198`]
  }
  
  @scala.inline
  implicit class `198MutableBuilder`[Self <: `198`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign249): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
