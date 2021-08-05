package typings.baseui.anon

import typings.baseui.baseuiStrings.GP
import typings.baseui.baseuiStrings.Guadeloupe
import typings.baseui.baseuiStrings.Plussign590
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var dialCode: Plussign590
  
  var id: GP
  
  var label: Guadeloupe
}
object `79` {
  
  inline def apply(): `79` = {
    val __obj = js.Dynamic.literal(dialCode = "+590", id = "GP", label = "Guadeloupe")
    __obj.asInstanceOf[`79`]
  }
  
  extension [Self <: `79`](x: Self) {
    
    inline def setDialCode(value: Plussign590): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guadeloupe): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
