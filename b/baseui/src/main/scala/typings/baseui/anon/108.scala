package typings.baseui.anon

import typings.baseui.baseuiStrings.IN
import typings.baseui.baseuiStrings.Plussign91
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  val dialCode: Plussign91
  
  val id: IN
  
  val label: /* India (भारत) */ String
}
object `108` {
  
  inline def apply(): `108` = {
    val __obj = js.Dynamic.literal(dialCode = "+91", id = "IN", label = "India (\u092D\u093E\u0930\u0924)")
    __obj.asInstanceOf[`108`]
  }
  
  extension [Self <: `108`](x: Self) {
    
    inline def setDialCode(value: Plussign91): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* India (भारत) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
