package typings.baseui.anon

import typings.baseui.baseuiStrings.CN
import typings.baseui.baseuiStrings.Plussign86
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  val dialCode: Plussign86
  
  val id: CN
  
  val label: /* China (中国) */ String
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal(dialCode = "+86", id = "CN", label = "China (\u4E2D\u56FD)")
    __obj.asInstanceOf[`54`]
  }
  
  extension [Self <: `54`](x: Self) {
    
    inline def setDialCode(value: Plussign86): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* China (中国) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
