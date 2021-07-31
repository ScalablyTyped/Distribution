package typings.baseui.anon

import typings.baseui.baseuiStrings.AE
import typings.baseui.baseuiStrings.Plussign971
import typings.baseui.baseuiStrings.`United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  var dialCode: Plussign971
  
  var id: AE
  
  var label: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
}
object `222` {
  
  @scala.inline
  def apply(): `222` = {
    val __obj = js.Dynamic.literal(dialCode = "+971", id = "AE", label = "United Arab Emirates (\u202B\u0627\u0644\u0625\u0645\u0627\u0631\u0627\u062A \u0627\u0644\u0639\u0631\u0628\u064A\u0629 \u0627\u0644\u0645\u062A\u062D\u062F\u0629\u202C\u200E)")
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
