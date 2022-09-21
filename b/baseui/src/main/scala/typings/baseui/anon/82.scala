package typings.baseui.anon

import typings.baseui.baseuiStrings.ET
import typings.baseui.baseuiStrings.Ethiopia
import typings.baseui.baseuiStrings.Plussign251
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  val dialCode: Plussign251
  
  val id: ET
  
  val label: Ethiopia
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal(dialCode = "+251", id = "ET", label = "Ethiopia")
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setDialCode(value: Plussign251): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ET): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Ethiopia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
