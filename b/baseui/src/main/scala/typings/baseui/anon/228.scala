package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign39
import typings.baseui.baseuiStrings.VA
import typings.baseui.baseuiStrings.`Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  var dialCode: Plussign39
  
  var id: VA
  
  var label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
}
object `228` {
  
  inline def apply(): `228` = {
    val __obj = js.Dynamic.literal(dialCode = "+39", id = "VA", label = "Vatican City (Citt\u00E0 del Vaticano)")
    __obj.asInstanceOf[`228`]
  }
  
  extension [Self <: `228`](x: Self) {
    
    inline def setDialCode(value: Plussign39): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
