package typings.baseui.anon

import typings.baseui.baseuiStrings.PY
import typings.baseui.baseuiStrings.Paraguay
import typings.baseui.baseuiStrings.Plussign595
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  var dialCode: Plussign595
  
  var id: PY
  
  var label: Paraguay
}
object `161` {
  
  inline def apply(): `161` = {
    val __obj = js.Dynamic.literal(dialCode = "+595", id = "PY", label = "Paraguay")
    __obj.asInstanceOf[`161`]
  }
  
  extension [Self <: `161`](x: Self) {
    
    inline def setDialCode(value: Plussign595): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Paraguay): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
