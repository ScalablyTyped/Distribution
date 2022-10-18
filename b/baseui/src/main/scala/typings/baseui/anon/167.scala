package typings.baseui.anon

import typings.baseui.baseuiStrings.NU
import typings.baseui.baseuiStrings.Niue
import typings.baseui.baseuiStrings.Plussign683
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `167` extends StObject {
  
  val dialCode: Plussign683
  
  val id: NU
  
  val label: Niue
}
object `167` {
  
  inline def apply(): `167` = {
    val __obj = js.Dynamic.literal(dialCode = "+683", id = "NU", label = "Niue")
    __obj.asInstanceOf[`167`]
  }
  
  extension [Self <: `167`](x: Self) {
    
    inline def setDialCode(value: Plussign683): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Niue): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
