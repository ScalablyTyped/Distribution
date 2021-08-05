package typings.baseui.anon

import typings.baseui.baseuiStrings.LR
import typings.baseui.baseuiStrings.Liberia
import typings.baseui.baseuiStrings.Plussign231
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var dialCode: Plussign231
  
  var id: LR
  
  var label: Liberia
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal(dialCode = "+231", id = "LR", label = "Liberia")
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setDialCode(value: Plussign231): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Liberia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
