package typings.baseui.anon

import typings.baseui.baseuiStrings.Mayotte
import typings.baseui.baseuiStrings.Plussign262
import typings.baseui.baseuiStrings.YT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150` extends StObject {
  
  val dialCode: Plussign262
  
  val id: YT
  
  val label: Mayotte
}
object `150` {
  
  inline def apply(): `150` = {
    val __obj = js.Dynamic.literal(dialCode = "+262", id = "YT", label = "Mayotte")
    __obj.asInstanceOf[`150`]
  }
  
  extension [Self <: `150`](x: Self) {
    
    inline def setDialCode(value: Plussign262): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: YT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Mayotte): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
