package typings.baseui.anon

import typings.baseui.baseuiStrings.PY
import typings.baseui.baseuiStrings.Paraguay
import typings.baseui.baseuiStrings.Plussign595
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  val dialCode: Plussign595
  
  val id: PY
  
  val label: Paraguay
}
object `181` {
  
  inline def apply(): `181` = {
    val __obj = js.Dynamic.literal(dialCode = "+595", id = "PY", label = "Paraguay")
    __obj.asInstanceOf[`181`]
  }
  
  extension [Self <: `181`](x: Self) {
    
    inline def setDialCode(value: Plussign595): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Paraguay): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
