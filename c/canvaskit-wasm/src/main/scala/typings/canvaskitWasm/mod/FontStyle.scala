package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyle extends StObject {
  
  var slant: js.UndefOr[FontSlant] = js.undefined
  
  var weight: js.UndefOr[FontWeight] = js.undefined
  
  var width: js.UndefOr[FontWidth] = js.undefined
}
object FontStyle {
  
  inline def apply(): FontStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyle]
  }
  
  extension [Self <: FontStyle](x: Self) {
    
    inline def setSlant(value: FontSlant): Self = StObject.set(x, "slant", value.asInstanceOf[js.Any])
    
    inline def setSlantUndefined: Self = StObject.set(x, "slant", js.undefined)
    
    inline def setWeight(value: FontWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    inline def setWidth(value: FontWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
