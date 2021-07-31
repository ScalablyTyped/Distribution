package typings.baseui.anon

import typings.baseui.baseuiStrings.MX
import typings.baseui.baseuiStrings.Plussign52
import typings.baseui.baseuiStrings.`Mexico LeftparenthesisMéxicoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var dialCode: Plussign52
  
  var id: MX
  
  var label: `Mexico LeftparenthesisMéxicoRightparenthesis`
}
object `131` {
  
  @scala.inline
  def apply(): `131` = {
    val __obj = js.Dynamic.literal(dialCode = "+52", id = "MX", label = "Mexico (M\u00E9xico)")
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit class `131MutableBuilder`[Self <: `131`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign52): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: MX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Mexico LeftparenthesisMéxicoRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
