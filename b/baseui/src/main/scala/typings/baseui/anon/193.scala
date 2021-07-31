package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign27
import typings.baseui.baseuiStrings.ZA
import typings.baseui.baseuiStrings.`South Africa`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var dialCode: Plussign27
  
  var id: ZA
  
  var label: `South Africa`
}
object `193` {
  
  @scala.inline
  def apply(): `193` = {
    val __obj = js.Dynamic.literal(dialCode = "+27", id = "ZA", label = "South Africa")
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit class `193MutableBuilder`[Self <: `193`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign27): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `South Africa`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
