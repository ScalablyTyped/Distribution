package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign1784
import typings.baseui.baseuiStrings.VC
import typings.baseui.baseuiStrings.`Saint Vincent and the Grenadines`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  val dialCode: Plussign1784
  
  val id: VC
  
  val label: `Saint Vincent and the Grenadines`
}
object `198` {
  
  inline def apply(): `198` = {
    val __obj = js.Dynamic.literal(dialCode = "+1784", id = "VC", label = "Saint Vincent and the Grenadines")
    __obj.asInstanceOf[`198`]
  }
  
  extension [Self <: `198`](x: Self) {
    
    inline def setDialCode(value: Plussign1784): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VC): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Vincent and the Grenadines`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
