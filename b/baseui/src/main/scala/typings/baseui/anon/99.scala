package typings.baseui.anon

import typings.baseui.baseuiStrings.GP
import typings.baseui.baseuiStrings.Guadeloupe
import typings.baseui.baseuiStrings.Plussign590
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  val dialCode: Plussign590
  
  val id: GP
  
  val label: Guadeloupe
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal(dialCode = "+590", id = "GP", label = "Guadeloupe")
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setDialCode(value: Plussign590): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guadeloupe): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
