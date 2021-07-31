package typings.baseui.anon

import typings.baseui.baseuiStrings.LA
import typings.baseui.baseuiStrings.Plussign856
import typings.baseui.baseuiStrings.`Laos LeftparenthesisລາວRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var dialCode: Plussign856
  
  var id: LA
  
  var label: `Laos LeftparenthesisລາວRightparenthesis`
}
object `109` {
  
  @scala.inline
  def apply(): `109` = {
    val __obj = js.Dynamic.literal(dialCode = "+856", id = "LA", label = "Laos (\u0EA5\u0EB2\u0EA7)")
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit class `109MutableBuilder`[Self <: `109`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign856): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: LA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Laos LeftparenthesisລາວRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
