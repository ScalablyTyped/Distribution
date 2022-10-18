package typings.baseui.anon

import typings.baseui.baseuiStrings.KI
import typings.baseui.baseuiStrings.Kiribati
import typings.baseui.baseuiStrings.Plussign686
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  val dialCode: Plussign686
  
  val id: KI
  
  val label: Kiribati
}
object `122` {
  
  inline def apply(): `122` = {
    val __obj = js.Dynamic.literal(dialCode = "+686", id = "KI", label = "Kiribati")
    __obj.asInstanceOf[`122`]
  }
  
  extension [Self <: `122`](x: Self) {
    
    inline def setDialCode(value: Plussign686): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Kiribati): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
