package typings.baseui.anon

import typings.baseui.baseuiStrings.CL
import typings.baseui.baseuiStrings.Chile
import typings.baseui.baseuiStrings.Plussign56
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  val dialCode: Plussign56
  
  val id: CL
  
  val label: Chile
}
object `56` {
  
  inline def apply(): `56` = {
    val __obj = js.Dynamic.literal(dialCode = "+56", id = "CL", label = "Chile")
    __obj.asInstanceOf[`56`]
  }
  
  extension [Self <: `56`](x: Self) {
    
    inline def setDialCode(value: Plussign56): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Chile): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
