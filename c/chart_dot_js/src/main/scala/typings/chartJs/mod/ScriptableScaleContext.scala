package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableScaleContext extends StObject {
  
  var chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
  
  var index: Double
  
  var scale: Scale[CoreScaleOptions]
  
  var tick: Tick
}
object ScriptableScaleContext {
  
  inline def apply(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    index: Double,
    scale: Scale[CoreScaleOptions],
    tick: Tick
  ): ScriptableScaleContext = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptableScaleContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptableScaleContext] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Scale[CoreScaleOptions]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTick(value: Tick): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
  }
}
