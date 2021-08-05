package typings.baseui.anon

import typings.baseui.baseuiStrings.KI
import typings.baseui.baseuiStrings.Kiribati
import typings.baseui.baseuiStrings.Plussign686
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  var dialCode: Plussign686
  
  var id: KI
  
  var label: Kiribati
}
object `105` {
  
  inline def apply(): `105` = {
    val __obj = js.Dynamic.literal(dialCode = "+686", id = "KI", label = "Kiribati")
    __obj.asInstanceOf[`105`]
  }
  
  extension [Self <: `105`](x: Self) {
    
    inline def setDialCode(value: Plussign686): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Kiribati): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
