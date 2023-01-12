package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDefined extends StObject {
  
  var max: Double
  
  var maxDefined: Boolean
  
  var min: Double
  
  var minDefined: Boolean
}
object MaxDefined {
  
  inline def apply(max: Double, maxDefined: Boolean, min: Double, minDefined: Boolean): MaxDefined = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], maxDefined = maxDefined.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minDefined = minDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxDefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxDefined] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxDefined(value: Boolean): Self = StObject.set(x, "maxDefined", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinDefined(value: Boolean): Self = StObject.set(x, "minDefined", value.asInstanceOf[js.Any])
  }
}
