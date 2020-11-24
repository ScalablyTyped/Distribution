package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistFixedScaleAxis extends ILineChartAxis {
  
  var divisor: js.UndefOr[Double] = js.native
  
  var high: js.UndefOr[Double] = js.native
  
  var low: js.UndefOr[Double] = js.native
  
  var ticks: js.UndefOr[js.Array[Double | String]] = js.native
  
  var `type`: js.UndefOr[IFixedScaleAxisStatic] = js.native
}
object IChartistFixedScaleAxis {
  
  @scala.inline
  def apply(): IChartistFixedScaleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistFixedScaleAxis]
  }
  
  @scala.inline
  implicit class IChartistFixedScaleAxisOps[Self <: IChartistFixedScaleAxis] (val x: Self) extends AnyVal {
    
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
    def setDivisor(value: Double): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisor: Self = this.set("divisor", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: (Double | String)*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[Double | String]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setType(value: IFixedScaleAxisStatic): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
