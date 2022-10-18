package typings.baseui.anon

import typings.baseui.baseuiStrings.MZ
import typings.baseui.baseuiStrings.Plussign258
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156` extends StObject {
  
  val dialCode: Plussign258
  
  val id: MZ
  
  val label: /* Mozambique (Moçambique) */ String
}
object `156` {
  
  inline def apply(): `156` = {
    val __obj = js.Dynamic.literal(dialCode = "+258", id = "MZ", label = "Mozambique (Mo\u00E7ambique)")
    __obj.asInstanceOf[`156`]
  }
  
  extension [Self <: `156`](x: Self) {
    
    inline def setDialCode(value: Plussign258): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Mozambique (Moçambique) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
