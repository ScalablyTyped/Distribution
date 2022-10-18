package typings.baseui.anon

import typings.baseui.baseuiStrings.LA
import typings.baseui.baseuiStrings.Plussign856
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  val dialCode: Plussign856
  
  val id: LA
  
  val label: /* Laos (ລາວ) */ String
}
object `126` {
  
  inline def apply(): `126` = {
    val __obj = js.Dynamic.literal(dialCode = "+856", id = "LA", label = "Laos (\u0EA5\u0EB2\u0EA7)")
    __obj.asInstanceOf[`126`]
  }
  
  extension [Self <: `126`](x: Self) {
    
    inline def setDialCode(value: Plussign856): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Laos (ລາວ) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
