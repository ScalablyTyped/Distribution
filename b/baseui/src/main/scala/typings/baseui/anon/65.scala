package typings.baseui.anon

import typings.baseui.baseuiStrings.FJ
import typings.baseui.baseuiStrings.Fiji
import typings.baseui.baseuiStrings.Plussign679
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  var dialCode: Plussign679
  
  var id: FJ
  
  var label: Fiji
}
object `65` {
  
  inline def apply(): `65` = {
    val __obj = js.Dynamic.literal(dialCode = "+679", id = "FJ", label = "Fiji")
    __obj.asInstanceOf[`65`]
  }
  
  extension [Self <: `65`](x: Self) {
    
    inline def setDialCode(value: Plussign679): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Fiji): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
