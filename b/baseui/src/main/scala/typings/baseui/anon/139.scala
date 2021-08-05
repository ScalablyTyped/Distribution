package typings.baseui.anon

import typings.baseui.baseuiStrings.MZ
import typings.baseui.baseuiStrings.Plussign258
import typings.baseui.baseuiStrings.`Mozambique LeftparenthesisMoçambiqueRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var dialCode: Plussign258
  
  var id: MZ
  
  var label: `Mozambique LeftparenthesisMoçambiqueRightparenthesis`
}
object `139` {
  
  inline def apply(): `139` = {
    val __obj = js.Dynamic.literal(dialCode = "+258", id = "MZ", label = "Mozambique (Mo\u00E7ambique)")
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setDialCode(value: Plussign258): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Mozambique LeftparenthesisMoçambiqueRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
