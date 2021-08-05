package typings.baseui.anon

import typings.baseui.baseuiStrings.PT
import typings.baseui.baseuiStrings.Plussign351
import typings.baseui.baseuiStrings.Portugal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  var dialCode: Plussign351
  
  var id: PT
  
  var label: Portugal
}
object `165` {
  
  inline def apply(): `165` = {
    val __obj = js.Dynamic.literal(dialCode = "+351", id = "PT", label = "Portugal")
    __obj.asInstanceOf[`165`]
  }
  
  extension [Self <: `165`](x: Self) {
    
    inline def setDialCode(value: Plussign351): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Portugal): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
