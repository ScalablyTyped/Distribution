package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign966
import typings.baseui.baseuiStrings.SA
import typings.baseui.baseuiStrings.`Saudi Arabia Leftparenthesis‫المملكة العربية السعودية‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  var dialCode: Plussign966
  
  var id: SA
  
  var label: `Saudi Arabia Leftparenthesis‫المملكة العربية السعودية‬‎Rightparenthesis`
}
object `182` {
  
  @scala.inline
  def apply(): `182` = {
    val __obj = js.Dynamic.literal(dialCode = "+966", id = "SA", label = "Saudi Arabia (\u202B\u0627\u0644\u0645\u0645\u0644\u0643\u0629 \u0627\u0644\u0639\u0631\u0628\u064A\u0629 \u0627\u0644\u0633\u0639\u0648\u062F\u064A\u0629\u202C\u200E)")
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit class `182MutableBuilder`[Self <: `182`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign966): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: SA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Saudi Arabia Leftparenthesis‫المملكة العربية السعودية‬‎Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
