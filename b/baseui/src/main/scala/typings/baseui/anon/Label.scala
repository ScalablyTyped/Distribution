package typings.baseui.anon

import typings.baseui.baseuiStrings.AL
import typings.baseui.baseuiStrings.Plussign355
import typings.baseui.baseuiStrings.`Albania LeftparenthesisShqipëriRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  val dialCode: Plussign355
  
  val id: AL
  
  val label: `Albania LeftparenthesisShqipëriRightparenthesis`
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal(dialCode = "+355", id = "AL", label = "Albania (Shqip\u00EBri)")
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setDialCode(value: Plussign355): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Albania LeftparenthesisShqipëriRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
