package typings.baseui.anon

import typings.baseui.baseuiStrings.AW
import typings.baseui.baseuiStrings.Aruba
import typings.baseui.baseuiStrings.Plussign297
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var dialCode: Plussign297
  
  var id: AW
  
  var label: Aruba
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(dialCode = "+297", id = "AW", label = "Aruba")
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setDialCode(value: Plussign297): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Aruba): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
