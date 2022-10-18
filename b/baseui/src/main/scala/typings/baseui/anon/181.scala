package typings.baseui.anon

import typings.baseui.baseuiStrings.PL
import typings.baseui.baseuiStrings.Plussign48
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  val dialCode: Plussign48
  
  val id: PL
  
  val label: /* Poland (Polska) */ String
}
object `181` {
  
  inline def apply(): `181` = {
    val __obj = js.Dynamic.literal(dialCode = "+48", id = "PL", label = "Poland (Polska)")
    __obj.asInstanceOf[`181`]
  }
  
  extension [Self <: `181`](x: Self) {
    
    inline def setDialCode(value: Plussign48): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Poland (Polska) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
