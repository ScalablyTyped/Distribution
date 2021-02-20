package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign216
import typings.baseui.baseuiStrings.TN
import typings.baseui.baseuiStrings.`Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `214` extends StObject {
  
  var dialCode: Plussign216 = js.native
  
  var id: TN = js.native
  
  var label: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis` = js.native
}
object `214` {
  
  @scala.inline
  def apply(dialCode: Plussign216, id: TN, label: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`): `214` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit class `214MutableBuilder`[Self <: `214`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign216): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
