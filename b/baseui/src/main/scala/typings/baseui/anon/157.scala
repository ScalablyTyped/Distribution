package typings.baseui.anon

import typings.baseui.baseuiStrings.MM
import typings.baseui.baseuiStrings.Plussign95
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  val dialCode: Plussign95
  
  val id: MM
  
  val label: /* Myanmar (Burma) (မြန်မာ) */ String
}
object `157` {
  
  inline def apply(): `157` = {
    val __obj = js.Dynamic.literal(dialCode = "+95", id = "MM", label = "Myanmar (Burma) (\u1019\u103C\u1014\u103A\u1019\u102C)")
    __obj.asInstanceOf[`157`]
  }
  
  extension [Self <: `157`](x: Self) {
    
    inline def setDialCode(value: Plussign95): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Myanmar (Burma) (မြန်မာ) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
