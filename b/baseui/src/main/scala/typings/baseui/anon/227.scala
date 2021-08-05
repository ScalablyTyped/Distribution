package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign678
import typings.baseui.baseuiStrings.VU
import typings.baseui.baseuiStrings.Vanuatu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  var dialCode: Plussign678
  
  var id: VU
  
  var label: Vanuatu
}
object `227` {
  
  inline def apply(): `227` = {
    val __obj = js.Dynamic.literal(dialCode = "+678", id = "VU", label = "Vanuatu")
    __obj.asInstanceOf[`227`]
  }
  
  extension [Self <: `227`](x: Self) {
    
    inline def setDialCode(value: Plussign678): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Vanuatu): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
