package typings.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  var fontWeight: Double
}
object FontWeight {
  
  inline def apply(fontWeight: Double): FontWeight = {
    val __obj = js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeight]
  }
  
  extension [Self <: FontWeight](x: Self) {
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
