package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.ScaleOptionsByType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js/dist/chunks/helpers.core.ScaleType ]: chart.js.chart.js/dist/chunks/helpers.core.ScaleOptionsByType<key>} */
trait keyinScaleTypeScaleOption extends StObject {
  
  var category: ScaleOptionsByType["category"]
  
  var linear: ScaleOptionsByType["linear"]
  
  var logarithmic: ScaleOptionsByType["logarithmic"]
  
  var radialLinear: ScaleOptionsByType["radialLinear"]
  
  var time: ScaleOptionsByType["time"]
  
  var timeseries: ScaleOptionsByType["timeseries"]
}
object keyinScaleTypeScaleOption {
  
  inline def apply(
    category: ScaleOptionsByType["category"],
    linear: ScaleOptionsByType["linear"],
    logarithmic: ScaleOptionsByType["logarithmic"],
    radialLinear: ScaleOptionsByType["radialLinear"],
    time: ScaleOptionsByType["time"],
    timeseries: ScaleOptionsByType["timeseries"]
  ): keyinScaleTypeScaleOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], logarithmic = logarithmic.asInstanceOf[js.Any], radialLinear = radialLinear.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeseries = timeseries.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinScaleTypeScaleOption]
  }
  
  extension [Self <: keyinScaleTypeScaleOption](x: Self) {
    
    inline def setCategory(value: ScaleOptionsByType["category"]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: ScaleOptionsByType["linear"]): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLogarithmic(value: ScaleOptionsByType["logarithmic"]): Self = StObject.set(x, "logarithmic", value.asInstanceOf[js.Any])
    
    inline def setRadialLinear(value: ScaleOptionsByType["radialLinear"]): Self = StObject.set(x, "radialLinear", value.asInstanceOf[js.Any])
    
    inline def setTime(value: ScaleOptionsByType["time"]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeseries(value: ScaleOptionsByType["timeseries"]): Self = StObject.set(x, "timeseries", value.asInstanceOf[js.Any])
  }
}
