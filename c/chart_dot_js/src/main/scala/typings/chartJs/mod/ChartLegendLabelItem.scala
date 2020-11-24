package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendLabelItem extends ChartLegendItem {
  
  var datasetIndex: js.UndefOr[Double] = js.native
}
object ChartLegendLabelItem {
  
  @scala.inline
  def apply(): ChartLegendLabelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendLabelItem]
  }
  
  @scala.inline
  implicit class ChartLegendLabelItemOps[Self <: ChartLegendLabelItem] (val x: Self) extends AnyVal {
    
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
    def setDatasetIndex(value: Double): Self = this.set("datasetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetIndex: Self = this.set("datasetIndex", js.undefined)
  }
}
