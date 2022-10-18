package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxFontSizeFontWeight extends StObject {
  
  var max: FontSizeFontWeight
  
  var xlg: FontWeight
}
object MaxFontSizeFontWeight {
  
  inline def apply(max: FontSizeFontWeight, xlg: FontWeight): MaxFontSizeFontWeight = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxFontSizeFontWeight]
  }
  
  extension [Self <: MaxFontSizeFontWeight](x: Self) {
    
    inline def setMax(value: FontSizeFontWeight): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: FontWeight): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
