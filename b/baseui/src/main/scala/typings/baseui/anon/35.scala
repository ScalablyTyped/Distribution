package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign235
import typings.baseui.baseuiStrings.TD
import typings.baseui.baseuiStrings.`Chad LeftparenthesisTchadRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var dialCode: Plussign235
  
  var id: TD
  
  var label: `Chad LeftparenthesisTchadRightparenthesis`
}
object `35` {
  
  @scala.inline
  def apply(): `35` = {
    val __obj = js.Dynamic.literal(dialCode = "+235", id = "TD", label = "Chad (Tchad)")
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign235): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Chad LeftparenthesisTchadRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
