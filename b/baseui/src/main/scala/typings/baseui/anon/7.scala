package typings.baseui.anon

import typings.baseui.baseuiStrings.AT
import typings.baseui.baseuiStrings.Plussign43
import typings.baseui.baseuiStrings.`Austria LeftparenthesisÖsterreichRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var dialCode: Plussign43
  
  var id: AT
  
  var label: `Austria LeftparenthesisÖsterreichRightparenthesis`
}
object `7` {
  
  @scala.inline
  def apply(): `7` = {
    val __obj = js.Dynamic.literal(dialCode = "+43", id = "AT", label = "Austria (\u00D6sterreich)")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign43): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Austria LeftparenthesisÖsterreichRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
