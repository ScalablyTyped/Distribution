package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: `13`
  
  var xlg: FontSizeLineHeight
}
object Max {
  
  inline def apply(max: `13`, xlg: FontSizeLineHeight): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: `13`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: FontSizeLineHeight): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
