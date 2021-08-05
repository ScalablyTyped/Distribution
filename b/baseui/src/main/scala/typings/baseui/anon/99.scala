package typings.baseui.anon

import typings.baseui.baseuiStrings.JM
import typings.baseui.baseuiStrings.Jamaica
import typings.baseui.baseuiStrings.Plussign1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  var dialCode: Plussign1
  
  var id: JM
  
  var label: Jamaica
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "JM", label = "Jamaica")
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: JM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Jamaica): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
