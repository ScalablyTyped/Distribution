package typings.baseui.anon

import typings.baseui.baseuiStrings.IL
import typings.baseui.baseuiStrings.Plussign972
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114` extends StObject {
  
  val dialCode: Plussign972
  
  val id: IL
  
  val label: /* Israel (‫ישראל‬‎) */ String
}
object `114` {
  
  inline def apply(): `114` = {
    val __obj = js.Dynamic.literal(dialCode = "+972", id = "IL", label = "Israel (\u202B\u05D9\u05E9\u05E8\u05D0\u05DC\u202C\u200E)")
    __obj.asInstanceOf[`114`]
  }
  
  extension [Self <: `114`](x: Self) {
    
    inline def setDialCode(value: Plussign972): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Israel (‫ישראל‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
