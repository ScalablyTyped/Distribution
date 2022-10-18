package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightAny extends StObject {
  
  var fontWeight: Any
}
object FontWeightAny {
  
  inline def apply(fontWeight: Any): FontWeightAny = {
    val __obj = js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightAny]
  }
  
  extension [Self <: FontWeightAny](x: Self) {
    
    inline def setFontWeight(value: Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
