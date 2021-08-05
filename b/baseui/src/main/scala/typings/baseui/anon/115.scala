package typings.baseui.anon

import typings.baseui.baseuiStrings.LI
import typings.baseui.baseuiStrings.Liechtenstein
import typings.baseui.baseuiStrings.Plussign423
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var dialCode: Plussign423
  
  var id: LI
  
  var label: Liechtenstein
}
object `115` {
  
  inline def apply(): `115` = {
    val __obj = js.Dynamic.literal(dialCode = "+423", id = "LI", label = "Liechtenstein")
    __obj.asInstanceOf[`115`]
  }
  
  extension [Self <: `115`](x: Self) {
    
    inline def setDialCode(value: Plussign423): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Liechtenstein): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
