package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign993
import typings.baseui.baseuiStrings.TM
import typings.baseui.baseuiStrings.Turkmenistan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var dialCode: Plussign993
  
  var id: TM
  
  var label: Turkmenistan
}
object `216` {
  
  inline def apply(): `216` = {
    val __obj = js.Dynamic.literal(dialCode = "+993", id = "TM", label = "Turkmenistan")
    __obj.asInstanceOf[`216`]
  }
  
  extension [Self <: `216`](x: Self) {
    
    inline def setDialCode(value: Plussign993): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Turkmenistan): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
