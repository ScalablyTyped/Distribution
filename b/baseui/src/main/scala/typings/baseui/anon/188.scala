package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign262
import typings.baseui.baseuiStrings.RE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  val dialCode: Plussign262
  
  val id: RE
  
  val label: String
}
object `188` {
  
  inline def apply(): `188` = {
    val __obj = js.Dynamic.literal(dialCode = "+262", id = "RE", label = "R\u00E9union (La R\u00E9union)")
    __obj.asInstanceOf[`188`]
  }
  
  extension [Self <: `188`](x: Self) {
    
    inline def setDialCode(value: Plussign262): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: RE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
