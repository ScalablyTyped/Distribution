package typings.baseui.anon

import typings.baseui.baseuiStrings.NC
import typings.baseui.baseuiStrings.Plussign687
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162` extends StObject {
  
  val dialCode: Plussign687
  
  val id: NC
  
  val label: /* New Caledonia (Nouvelle-Calédonie) */ String
}
object `162` {
  
  inline def apply(): `162` = {
    val __obj = js.Dynamic.literal(dialCode = "+687", id = "NC", label = "New Caledonia (Nouvelle-Cal\u00E9donie)")
    __obj.asInstanceOf[`162`]
  }
  
  extension [Self <: `162`](x: Self) {
    
    inline def setDialCode(value: Plussign687): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* New Caledonia (Nouvelle-Calédonie) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
