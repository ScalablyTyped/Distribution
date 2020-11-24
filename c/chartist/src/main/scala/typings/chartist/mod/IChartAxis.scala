package typings.chartist.mod

import typings.chartist.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartAxis extends js.Object {
  
  var axisLength: Double = js.native
  
  var chartRect: IChartRect = js.native
  
  var counterUnits: IChartUnits = js.native
  
  var divisor: Double = js.native
  
  var gridOffset: Double = js.native
  
  var options: js.Any = js.native
  
  var range: Max = js.native
  
  var stepLength: Double = js.native
  
  var ticks: js.Array[Double] = js.native
  
  var units: IChartUnits = js.native
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
  implicit class IChartAxisOps[Self <: IChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxisLength(value: Double): Self = this.set("axisLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartRect(value: IChartRect): Self = this.set("chartRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUnits(value: IChartUnits): Self = this.set("counterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisor(value: Double): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridOffset(value: Double): Self = this.set("gridOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Max): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepLength(value: Double): Self = this.set("stepLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksVarargs(value: Double*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[Double]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnits(value: IChartUnits): Self = this.set("units", value.asInstanceOf[js.Any])
  }
}
