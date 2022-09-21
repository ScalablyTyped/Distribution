package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontMetrics extends StObject {
  
  var ascent: Double
  
  // suggested spacing between descent of previous line and ascent of next line.
  var bounds: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  
  // suggested space above the baseline. < 0
  var descent: Double
  
  // suggested space below the baseline. > 0
  var leading: Double
}
object FontMetrics {
  
  inline def apply(ascent: Double, descent: Double, leading: Double): FontMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontMetrics]
  }
  
  extension [Self <: FontMetrics](x: Self) {
    
    inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: js.typedarray.Float32Array): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
  }
}
