package typings.baseui.anon

import typings.baseui.baseuiStrings.IR
import typings.baseui.baseuiStrings.Plussign98
import typings.baseui.baseuiStrings.`Iran Leftparenthesis‫ایران‬‎Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  var dialCode: Plussign98
  
  var id: IR
  
  var label: `Iran Leftparenthesis‫ایران‬‎Rightparenthesis`
}
object `93` {
  
  @scala.inline
  def apply(): `93` = {
    val __obj = js.Dynamic.literal(dialCode = "+98", id = "IR", label = "Iran (\u202B\u0627\u06CC\u0631\u0627\u0646\u202C\u200E)")
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
