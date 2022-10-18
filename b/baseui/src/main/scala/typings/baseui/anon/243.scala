package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign998
import typings.baseui.baseuiStrings.UZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243` extends StObject {
  
  val dialCode: Plussign998
  
  val id: UZ
  
  val label: /* Uzbekistan (Oʻzbekiston) */ String
}
object `243` {
  
  inline def apply(): `243` = {
    val __obj = js.Dynamic.literal(dialCode = "+998", id = "UZ", label = "Uzbekistan (O\u02BBzbekiston)")
    __obj.asInstanceOf[`243`]
  }
  
  extension [Self <: `243`](x: Self) {
    
    inline def setDialCode(value: Plussign998): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: UZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Uzbekistan (Oʻzbekiston) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
