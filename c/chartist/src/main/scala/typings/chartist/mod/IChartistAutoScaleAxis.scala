package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistAutoScaleAxis extends ILineChartAxis {
  
  var high: js.UndefOr[Double] = js.native
  
  var low: js.UndefOr[Double] = js.native
  
  var onlyInteger: js.UndefOr[Boolean] = js.native
  
  var referenceValue: js.UndefOr[Double] = js.native
  
  var scaleMinSpace: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[IAutoScaleAxisStatic] = js.native
}
object IChartistAutoScaleAxis {
  
  @scala.inline
  def apply(): IChartistAutoScaleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistAutoScaleAxis]
  }
  
  @scala.inline
  implicit class IChartistAutoScaleAxisOps[Self <: IChartistAutoScaleAxis] (val x: Self) extends AnyVal {
    
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
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setOnlyInteger(value: Boolean): Self = this.set("onlyInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyInteger: Self = this.set("onlyInteger", js.undefined)
    
    @scala.inline
    def setReferenceValue(value: Double): Self = this.set("referenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceValue: Self = this.set("referenceValue", js.undefined)
    
    @scala.inline
    def setScaleMinSpace(value: Double): Self = this.set("scaleMinSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleMinSpace: Self = this.set("scaleMinSpace", js.undefined)
    
    @scala.inline
    def setType(value: IAutoScaleAxisStatic): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
