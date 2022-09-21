package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign670
import typings.baseui.baseuiStrings.TL
import typings.baseui.baseuiStrings.`Timor-Leste`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `229` extends StObject {
  
  val dialCode: Plussign670
  
  val id: TL
  
  val label: `Timor-Leste`
}
object `229` {
  
  inline def apply(): `229` = {
    val __obj = js.Dynamic.literal(dialCode = "+670", id = "TL", label = "Timor-Leste")
    __obj.asInstanceOf[`229`]
  }
  
  extension [Self <: `229`](x: Self) {
    
    inline def setDialCode(value: Plussign670): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Timor-Leste`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
