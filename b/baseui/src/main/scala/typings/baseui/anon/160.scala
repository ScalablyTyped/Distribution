package typings.baseui.anon

import typings.baseui.baseuiStrings.NP
import typings.baseui.baseuiStrings.Plussign977
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  val dialCode: Plussign977
  
  val id: NP
  
  val label: /* Nepal (नेपाल) */ String
}
object `160` {
  
  inline def apply(): `160` = {
    val __obj = js.Dynamic.literal(dialCode = "+977", id = "NP", label = "Nepal (\u0928\u0947\u092A\u093E\u0932)")
    __obj.asInstanceOf[`160`]
  }
  
  extension [Self <: `160`](x: Self) {
    
    inline def setDialCode(value: Plussign977): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Nepal (नेपाल) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
