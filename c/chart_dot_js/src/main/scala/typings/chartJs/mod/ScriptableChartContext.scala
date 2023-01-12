package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableChartContext extends StObject {
  
  var chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
  
  var `type`: String
}
object ScriptableChartContext {
  
  inline def apply(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], `type`: String): ScriptableChartContext = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptableChartContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptableChartContext] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
