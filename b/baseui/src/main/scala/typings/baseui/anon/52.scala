package typings.baseui.anon

import typings.baseui.baseuiStrings.CV
import typings.baseui.baseuiStrings.Plussign238
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  val dialCode: Plussign238
  
  val id: CV
  
  val label: String
}
object `52` {
  
  inline def apply(): `52` = {
    val __obj = js.Dynamic.literal(dialCode = "+238", id = "CV", label = "Cape Verde (Kabu Verdi)")
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setDialCode(value: Plussign238): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
