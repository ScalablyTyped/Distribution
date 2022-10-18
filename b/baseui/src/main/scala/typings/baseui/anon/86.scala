package typings.baseui.anon

import typings.baseui.baseuiStrings.PF
import typings.baseui.baseuiStrings.Plussign689
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  val dialCode: Plussign689
  
  val id: PF
  
  val label: /* French Polynesia (Polynésie française) */ String
}
object `86` {
  
  inline def apply(): `86` = {
    val __obj = js.Dynamic.literal(dialCode = "+689", id = "PF", label = "French Polynesia (Polyn\u00E9sie fran\u00E7aise)")
    __obj.asInstanceOf[`86`]
  }
  
  extension [Self <: `86`](x: Self) {
    
    inline def setDialCode(value: Plussign689): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* French Polynesia (Polynésie française) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
