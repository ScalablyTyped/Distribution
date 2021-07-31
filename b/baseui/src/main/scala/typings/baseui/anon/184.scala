package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign381
import typings.baseui.baseuiStrings.RS
import typings.baseui.baseuiStrings.`Serbia LeftparenthesisСрбијаRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  var dialCode: Plussign381
  
  var id: RS
  
  var label: `Serbia LeftparenthesisСрбијаRightparenthesis`
}
object `184` {
  
  @scala.inline
  def apply(): `184` = {
    val __obj = js.Dynamic.literal(dialCode = "+381", id = "RS", label = "Serbia (\u0421\u0440\u0431\u0438\u0458\u0430)")
    __obj.asInstanceOf[`184`]
  }
  
  @scala.inline
  implicit class `184MutableBuilder`[Self <: `184`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign381): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: RS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Serbia LeftparenthesisСрбијаRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
