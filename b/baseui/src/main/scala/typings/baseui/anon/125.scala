package typings.baseui.anon

import typings.baseui.baseuiStrings.MT
import typings.baseui.baseuiStrings.Malta
import typings.baseui.baseuiStrings.Plussign356
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var dialCode: Plussign356
  
  var id: MT
  
  var label: Malta
}
object `125` {
  
  inline def apply(): `125` = {
    val __obj = js.Dynamic.literal(dialCode = "+356", id = "MT", label = "Malta")
    __obj.asInstanceOf[`125`]
  }
  
  extension [Self <: `125`](x: Self) {
    
    inline def setDialCode(value: Plussign356): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Malta): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
