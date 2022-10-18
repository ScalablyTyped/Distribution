package typings.baseui.anon

import typings.baseui.baseuiStrings.NA
import typings.baseui.baseuiStrings.Plussign264
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  val dialCode: Plussign264
  
  val id: NA
  
  val label: /* Namibia (Namibië) */ String
}
object `158` {
  
  inline def apply(): `158` = {
    val __obj = js.Dynamic.literal(dialCode = "+264", id = "NA", label = "Namibia (Namibi\u00EB)")
    __obj.asInstanceOf[`158`]
  }
  
  extension [Self <: `158`](x: Self) {
    
    inline def setDialCode(value: Plussign264): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Namibia (Namibië) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
