package typings.baseui.anon

import typings.baseui.baseuiStrings.PS
import typings.baseui.baseuiStrings.Plussign970
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  val dialCode: Plussign970
  
  val id: PS
  
  val label: /* Palestine (‫فلسطين‬‎) */ String
}
object `175` {
  
  inline def apply(): `175` = {
    val __obj = js.Dynamic.literal(dialCode = "+970", id = "PS", label = "Palestine (\u202B\u0641\u0644\u0633\u0637\u064A\u0646\u202C\u200E)")
    __obj.asInstanceOf[`175`]
  }
  
  extension [Self <: `175`](x: Self) {
    
    inline def setDialCode(value: Plussign970): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Palestine (‫فلسطين‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
