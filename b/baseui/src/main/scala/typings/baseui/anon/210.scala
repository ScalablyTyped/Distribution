package typings.baseui.anon

import typings.baseui.baseuiStrings.Plussign228
import typings.baseui.baseuiStrings.TG
import typings.baseui.baseuiStrings.Togo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210` extends StObject {
  
  var dialCode: Plussign228
  
  var id: TG
  
  var label: Togo
}
object `210` {
  
  inline def apply(): `210` = {
    val __obj = js.Dynamic.literal(dialCode = "+228", id = "TG", label = "Togo")
    __obj.asInstanceOf[`210`]
  }
  
  extension [Self <: `210`](x: Self) {
    
    inline def setDialCode(value: Plussign228): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Togo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
