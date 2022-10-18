package typings.baseui.anon

import typings.baseui.baseuiStrings.EG
import typings.baseui.baseuiStrings.Plussign20
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  val dialCode: Plussign20
  
  val id: EG
  
  val label: /* Egypt (‫مصر‬‎) */ String
}
object `74` {
  
  inline def apply(): `74` = {
    val __obj = js.Dynamic.literal(dialCode = "+20", id = "EG", label = "Egypt (\u202B\u0645\u0635\u0631\u202C\u200E)")
    __obj.asInstanceOf[`74`]
  }
  
  extension [Self <: `74`](x: Self) {
    
    inline def setDialCode(value: Plussign20): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: EG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Egypt (‫مصر‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
