package typings.baseui.anon

import typings.baseui.baseuiStrings.OM
import typings.baseui.baseuiStrings.Plussign968
import typings.baseui.baseuiStrings.`Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var dialCode: Plussign968
  
  var id: OM
  
  var label: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`
}
object `155` {
  
  @scala.inline
  def apply(): `155` = {
    val __obj = js.Dynamic.literal(dialCode = "+968", id = "OM", label = "Oman (\u202B\u0639\u064F\u0645\u0627\u0646\u202C\u200E)")
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
