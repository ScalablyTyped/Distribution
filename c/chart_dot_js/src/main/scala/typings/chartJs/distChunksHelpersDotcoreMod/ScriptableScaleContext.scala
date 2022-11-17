package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableScaleContext extends StObject {
  
  var chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]
  
  var index: Double
  
  var scale: Scale2[CoreScaleOptions]
  
  var tick: Tick1
}
object ScriptableScaleContext {
  
  inline def apply(
    chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any],
    index: Double,
    scale: Scale2[CoreScaleOptions],
    tick: Tick1
  ): ScriptableScaleContext = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptableScaleContext]
  }
  
  extension [Self <: ScriptableScaleContext](x: Self) {
    
    inline def setChart(value: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Scale2[CoreScaleOptions]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTick(value: Tick1): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
  }
}
