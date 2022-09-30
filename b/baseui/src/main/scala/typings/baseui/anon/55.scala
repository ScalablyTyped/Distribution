package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign235
import typings.baseui.baseuiStrings.TD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  val dialCode: Plussign235
  
  val id: TD
  
  val label: String
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal(dialCode = "+235", id = "TD", label = "Chad (Tchad)")
    __obj.asInstanceOf[`55`]
  }
  
  extension [Self <: `55`](x: Self) {
    
    inline def setDialCode(value: Plussign235): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
