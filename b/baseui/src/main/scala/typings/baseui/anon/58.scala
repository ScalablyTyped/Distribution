package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign503
import typings.baseui.baseuiStrings.SV
import typings.baseui.baseuiStrings.`El Salvador`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var dialCode: Plussign503
  
  var id: SV
  
  var label: `El Salvador`
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal(dialCode = "+503", id = "SV", label = "El Salvador")
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setDialCode(value: Plussign503): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `El Salvador`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
