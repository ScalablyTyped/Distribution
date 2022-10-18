package typings.baseui.anon

import typings.baseui.baseuiStrings.MU
import typings.baseui.baseuiStrings.Plussign230
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  val dialCode: Plussign230
  
  val id: MU
  
  val label: /* Mauritius (Moris) */ String
}
object `146` {
  
  inline def apply(): `146` = {
    val __obj = js.Dynamic.literal(dialCode = "+230", id = "MU", label = "Mauritius (Moris)")
    __obj.asInstanceOf[`146`]
  }
  
  extension [Self <: `146`](x: Self) {
    
    inline def setDialCode(value: Plussign230): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Mauritius (Moris) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
