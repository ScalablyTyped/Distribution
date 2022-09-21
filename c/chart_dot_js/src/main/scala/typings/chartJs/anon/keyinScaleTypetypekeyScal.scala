package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js.ScaleType ]: {  type :key} & chart.js.chart.js.ScaleTypeRegistry[key]['options']} */
trait keyinScaleTypetypekeyScal extends StObject {
  
  var category: typecategoryCategoryScale
  
  var linear: typelinearLinearScaleOpti
  
  var logarithmic: typelogarithmicLogarithmi
  
  var radialLinear: typeradialLinearRadialLin
  
  var time: typetimeTimeScaleOptions
  
  var timeseries: typetimeseriesTimeScaleOp
}
object keyinScaleTypetypekeyScal {
  
  inline def apply(
    category: typecategoryCategoryScale,
    linear: typelinearLinearScaleOpti,
    logarithmic: typelogarithmicLogarithmi,
    radialLinear: typeradialLinearRadialLin,
    time: typetimeTimeScaleOptions,
    timeseries: typetimeseriesTimeScaleOp
  ): keyinScaleTypetypekeyScal = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], logarithmic = logarithmic.asInstanceOf[js.Any], radialLinear = radialLinear.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeseries = timeseries.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinScaleTypetypekeyScal]
  }
  
  extension [Self <: keyinScaleTypetypekeyScal](x: Self) {
    
    inline def setCategory(value: typecategoryCategoryScale): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: typelinearLinearScaleOpti): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLogarithmic(value: typelogarithmicLogarithmi): Self = StObject.set(x, "logarithmic", value.asInstanceOf[js.Any])
    
    inline def setRadialLinear(value: typeradialLinearRadialLin): Self = StObject.set(x, "radialLinear", value.asInstanceOf[js.Any])
    
    inline def setTime(value: typetimeTimeScaleOptions): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeseries(value: typetimeseriesTimeScaleOp): Self = StObject.set(x, "timeseries", value.asInstanceOf[js.Any])
  }
}
