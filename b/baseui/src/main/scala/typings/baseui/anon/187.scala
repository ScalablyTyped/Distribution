package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign7
import typings.baseui.baseuiStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  val dialCode: Plussign7
  
  val id: RU
  
  val label: /* Russia (Россия) */ String
}
object `187` {
  
  inline def apply(): `187` = {
    val __obj = js.Dynamic.literal(dialCode = "+7", id = "RU", label = "Russia (\u0420\u043E\u0441\u0441\u0438\u044F)")
    __obj.asInstanceOf[`187`]
  }
  
  extension [Self <: `187`](x: Self) {
    
    inline def setDialCode(value: Plussign7): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: RU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Russia (Россия) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
