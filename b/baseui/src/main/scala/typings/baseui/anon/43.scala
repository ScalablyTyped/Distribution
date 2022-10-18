package typings.baseui.anon

import typings.baseui.baseuiStrings.BG
import typings.baseui.baseuiStrings.Plussign359
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  val dialCode: Plussign359
  
  val id: BG
  
  val label: /* Bulgaria (България) */ String
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal(dialCode = "+359", id = "BG", label = "Bulgaria (\u0411\u044A\u043B\u0433\u0430\u0440\u0438\u044F)")
    __obj.asInstanceOf[`43`]
  }
  
  extension [Self <: `43`](x: Self) {
    
    inline def setDialCode(value: Plussign359): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Bulgaria (България) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
