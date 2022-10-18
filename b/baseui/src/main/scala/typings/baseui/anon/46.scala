package typings.baseui.anon

import typings.baseui.baseuiStrings.KH
import typings.baseui.baseuiStrings.Plussign855
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  val dialCode: Plussign855
  
  val id: KH
  
  val label: /* Cambodia (កម្ពុជា) */ String
}
object `46` {
  
  inline def apply(): `46` = {
    val __obj = js.Dynamic.literal(dialCode = "+855", id = "KH", label = "Cambodia (\u1780\u1798\u17D2\u1796\u17BB\u1787\u17B6)")
    __obj.asInstanceOf[`46`]
  }
  
  extension [Self <: `46`](x: Self) {
    
    inline def setDialCode(value: Plussign855): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Cambodia (កម្ពុជា) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
