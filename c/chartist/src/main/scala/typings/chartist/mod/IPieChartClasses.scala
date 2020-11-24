package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPieChartClasses extends js.Object {
  
  var chartDonut: js.UndefOr[String] = js.native
  
  var chartPie: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var series: js.UndefOr[String] = js.native
  
  var sliceDonut: js.UndefOr[String] = js.native
  
  var slicePie: js.UndefOr[String] = js.native
}
object IPieChartClasses {
  
  @scala.inline
  def apply(): IPieChartClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieChartClasses]
  }
  
  @scala.inline
  implicit class IPieChartClassesOps[Self <: IPieChartClasses] (val x: Self) extends AnyVal {
    
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
    def setChartDonut(value: String): Self = this.set("chartDonut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartDonut: Self = this.set("chartDonut", js.undefined)
    
    @scala.inline
    def setChartPie(value: String): Self = this.set("chartPie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartPie: Self = this.set("chartPie", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSliceDonut(value: String): Self = this.set("sliceDonut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliceDonut: Self = this.set("sliceDonut", js.undefined)
    
    @scala.inline
    def setSlicePie(value: String): Self = this.set("slicePie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicePie: Self = this.set("slicePie", js.undefined)
  }
}
