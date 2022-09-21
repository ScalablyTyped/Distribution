package typings.baseui.anon

import typings.baseui.baseuiStrings.BB
import typings.baseui.baseuiStrings.Barbados
import typings.baseui.baseuiStrings.Plussign1246
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  val dialCode: Plussign1246
  
  val id: BB
  
  val label: Barbados
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal(dialCode = "+1246", id = "BB", label = "Barbados")
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setDialCode(value: Plussign1246): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Barbados): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
