package typings.baseui.anon

import typings.baseui.baseuiStrings.AL
import typings.baseui.baseuiStrings.Plussign355
import typings.baseui.baseuiStrings.`Albania LeftparenthesisShqipëriRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var dialCode: Plussign355
  
  var id: AL
  
  var label: `Albania LeftparenthesisShqipëriRightparenthesis`
}
object Label {
  
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal(dialCode = "+355", id = "AL", label = "Albania (Shqip\u00EBri)")
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: Plussign355): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: AL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: `Albania LeftparenthesisShqipëriRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
