package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var lg: `1`
  
  var max: FontSizeLineHeight
  
  var md: FontSize
  
  var xlg: `2`
}
object Max {
  
  inline def apply(lg: `1`, max: FontSizeLineHeight, md: FontSize, xlg: `2`): Max = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setLg(value: `1`): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: FontSizeLineHeight): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMd(value: FontSize): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: `2`): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
