package typings.baseui.anon

import typings.baseui.baseuiStrings.ET
import typings.baseui.baseuiStrings.Ethiopia
import typings.baseui.baseuiStrings.Plussign251
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var dialCode: Plussign251
  
  var id: ET
  
  var label: Ethiopia
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal(dialCode = "+251", id = "ET", label = "Ethiopia")
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setDialCode(value: Plussign251): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ET): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Ethiopia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
