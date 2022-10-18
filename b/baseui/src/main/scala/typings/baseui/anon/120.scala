package typings.baseui.anon

import typings.baseui.baseuiStrings.KZ
import typings.baseui.baseuiStrings.Plussign7
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  val dialCode: Plussign7
  
  val id: KZ
  
  val label: /* Kazakhstan (Казахстан) */ String
}
object `120` {
  
  inline def apply(): `120` = {
    val __obj = js.Dynamic.literal(dialCode = "+7", id = "KZ", label = "Kazakhstan (\u041A\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043D)")
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setDialCode(value: Plussign7): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Kazakhstan (Казахстан) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
