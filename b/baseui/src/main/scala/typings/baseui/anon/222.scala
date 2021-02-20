package typings.baseui.anon

import typings.baseui.baseuiStrings.AE
import typings.baseui.baseuiStrings.Plussign971
import typings.baseui.baseuiStrings.`United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `222` extends StObject {
  
  var dialCode: Plussign971 = js.native
  
  var id: AE = js.native
  
  var label: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis` = js.native
}
object `222` {
  
  @scala.inline
  def apply(
    dialCode: Plussign971,
    id: AE,
    label: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
  ): `222` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`222`]
  }
  
  @scala.inline
  implicit class `222MutableBuilder`[Self <: `222`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign971): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
