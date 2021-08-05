package typings.baseui.anon

import typings.baseui.baseuiStrings.CW
import typings.baseui.baseuiStrings.Curaçao
import typings.baseui.baseuiStrings.Plussign599
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var dialCode: Plussign599
  
  var id: CW
  
  var label: Curaçao
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(dialCode = "+599", id = "CW", label = "Cura\u00E7ao")
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setDialCode(value: Plussign599): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Curaçao): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
