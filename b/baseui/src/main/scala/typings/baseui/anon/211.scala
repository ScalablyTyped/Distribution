package typings.baseui.anon

import typings.baseui.baseuiStrings.KR
import typings.baseui.baseuiStrings.Plussign82
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `211` extends StObject {
  
  val dialCode: Plussign82
  
  val id: KR
  
  val label: /* South Korea (대한민국) */ String
}
object `211` {
  
  inline def apply(): `211` = {
    val __obj = js.Dynamic.literal(dialCode = "+82", id = "KR", label = "South Korea (\uB300\uD55C\uBBFC\uAD6D)")
    __obj.asInstanceOf[`211`]
  }
  
  extension [Self <: `211`](x: Self) {
    
    inline def setDialCode(value: Plussign82): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* South Korea (대한민국) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
