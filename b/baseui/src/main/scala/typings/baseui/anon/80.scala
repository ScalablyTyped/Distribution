package typings.baseui.anon

import typings.baseui.baseuiStrings.FK
import typings.baseui.baseuiStrings.Plussign500
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  val dialCode: Plussign500
  
  val id: FK
  
  val label: /* Falkland Islands (Islas Malvinas) */ String
}
object `80` {
  
  inline def apply(): `80` = {
    val __obj = js.Dynamic.literal(dialCode = "+500", id = "FK", label = "Falkland Islands (Islas Malvinas)")
    __obj.asInstanceOf[`80`]
  }
  
  extension [Self <: `80`](x: Self) {
    
    inline def setDialCode(value: Plussign500): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Falkland Islands (Islas Malvinas) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
