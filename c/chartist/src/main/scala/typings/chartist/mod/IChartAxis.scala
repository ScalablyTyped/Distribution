package typings.chartist.mod

import typings.chartist.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartAxis extends StObject {
  
  var axisLength: Double
  
  var chartRect: IChartRect
  
  var counterUnits: IChartUnits
  
  var divisor: Double
  
  var gridOffset: Double
  
  var options: js.Any
  
  var range: Max
  
  var stepLength: Double
  
  var ticks: js.Array[Double]
  
  var units: IChartUnits
}
object IChartAxis {
  
  @scala.inline
  def apply(
    axisLength: Double,
    chartRect: IChartRect,
    counterUnits: IChartUnits,
    divisor: Double,
    gridOffset: Double,
    options: js.Any,
    range: Max,
    stepLength: Double,
    ticks: js.Array[Double],
    units: IChartUnits
  ): IChartAxis = {
    val __obj = js.Dynamic.literal(axisLength = axisLength.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], counterUnits = counterUnits.asInstanceOf[js.Any], divisor = divisor.asInstanceOf[js.Any], gridOffset = gridOffset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], stepLength = stepLength.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartAxis]
  }
  
  @scala.inline
  implicit class IChartAxisMutableBuilder[Self <: IChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisLength(value: Double): Self = StObject.set(x, "axisLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartRect(value: IChartRect): Self = StObject.set(x, "chartRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUnits(value: IChartUnits): Self = StObject.set(x, "counterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisor(value: Double): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridOffset(value: Double): Self = StObject.set(x, "gridOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Max): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepLength(value: Double): Self = StObject.set(x, "stepLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setUnits(value: IChartUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
