package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign290
import typings.baseui.baseuiStrings.SH
import typings.baseui.baseuiStrings.`Saint Helena`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  val dialCode: Plussign290
  
  val id: SH
  
  val label: `Saint Helena`
}
object `193` {
  
  inline def apply(): `193` = {
    val __obj = js.Dynamic.literal(dialCode = "+290", id = "SH", label = "Saint Helena")
    __obj.asInstanceOf[`193`]
  }
  
  extension [Self <: `193`](x: Self) {
    
    inline def setDialCode(value: Plussign290): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Helena`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
