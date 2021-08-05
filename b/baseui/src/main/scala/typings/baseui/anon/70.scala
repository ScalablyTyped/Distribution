package typings.baseui.anon

import typings.baseui.baseuiStrings.GA
import typings.baseui.baseuiStrings.Gabon
import typings.baseui.baseuiStrings.Plussign241
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70` extends StObject {
  
  var dialCode: Plussign241
  
  var id: GA
  
  var label: Gabon
}
object `70` {
  
  inline def apply(): `70` = {
    val __obj = js.Dynamic.literal(dialCode = "+241", id = "GA", label = "Gabon")
    __obj.asInstanceOf[`70`]
  }
  
  extension [Self <: `70`](x: Self) {
    
    inline def setDialCode(value: Plussign241): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GA): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Gabon): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
