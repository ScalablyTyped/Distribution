package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign998
import typings.baseui.baseuiStrings.UZ
import typings.baseui.baseuiStrings.`Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  var dialCode: Plussign998
  
  var id: UZ
  
  var label: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`
}
object `226` {
  
  inline def apply(): `226` = {
    val __obj = js.Dynamic.literal(dialCode = "+998", id = "UZ", label = "Uzbekistan (O\u02BBzbekiston)")
    __obj.asInstanceOf[`226`]
  }
  
  extension [Self <: `226`](x: Self) {
    
    inline def setDialCode(value: Plussign998): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: UZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
