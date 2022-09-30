package typings.baseui.anon

import typings.baseui.baseuiStrings.KH
import typings.baseui.baseuiStrings.Plussign855
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  val dialCode: Plussign855
  
  val id: KH
  
  val label: String
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(dialCode = "+855", id = "KH", label = "Cambodia (\u1780\u1798\u17D2\u1796\u17BB\u1787\u17B6)")
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setDialCode(value: Plussign855): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
