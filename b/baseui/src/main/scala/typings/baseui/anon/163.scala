package typings.baseui.anon

import typings.baseui.baseuiStrings.PH
import typings.baseui.baseuiStrings.Philippines
import typings.baseui.baseuiStrings.Plussign63
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var dialCode: Plussign63
  
  var id: PH
  
  var label: Philippines
}
object `163` {
  
  inline def apply(): `163` = {
    val __obj = js.Dynamic.literal(dialCode = "+63", id = "PH", label = "Philippines")
    __obj.asInstanceOf[`163`]
  }
  
  extension [Self <: `163`](x: Self) {
    
    inline def setDialCode(value: Plussign63): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Philippines): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
