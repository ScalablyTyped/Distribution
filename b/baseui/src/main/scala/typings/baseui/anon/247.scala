package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign84
import typings.baseui.baseuiStrings.VN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `247` extends StObject {
  
  val dialCode: Plussign84
  
  val id: VN
  
  val label: /* Vietnam (Việt Nam) */ String
}
object `247` {
  
  inline def apply(): `247` = {
    val __obj = js.Dynamic.literal(dialCode = "+84", id = "VN", label = "Vietnam (Vi\u1EC7t Nam)")
    __obj.asInstanceOf[`247`]
  }
  
  extension [Self <: `247`](x: Self) {
    
    inline def setDialCode(value: Plussign84): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Vietnam (Việt Nam) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
