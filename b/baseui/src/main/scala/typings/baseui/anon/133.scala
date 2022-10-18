package typings.baseui.anon

import typings.baseui.baseuiStrings.LT
import typings.baseui.baseuiStrings.Plussign370
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  val dialCode: Plussign370
  
  val id: LT
  
  val label: /* Lithuania (Lietuva) */ String
}
object `133` {
  
  inline def apply(): `133` = {
    val __obj = js.Dynamic.literal(dialCode = "+370", id = "LT", label = "Lithuania (Lietuva)")
    __obj.asInstanceOf[`133`]
  }
  
  extension [Self <: `133`](x: Self) {
    
    inline def setDialCode(value: Plussign370): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Lithuania (Lietuva) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
