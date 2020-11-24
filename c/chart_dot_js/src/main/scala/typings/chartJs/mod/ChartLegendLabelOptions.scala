package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendLabelOptions extends js.Object {
  
  var boxWidth: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[js.Function2[/* legendItem */ ChartLegendLabelItem, /* data */ ChartData, _]] = js.native
  
  var fontColor: js.UndefOr[ChartColor] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var generateLabels: js.UndefOr[js.Function1[/* chart */ Chart, js.Array[ChartLegendLabelItem]]] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var usePointStyle: js.UndefOr[Boolean] = js.native
}
object ChartLegendLabelOptions {
  
  @scala.inline
  def apply(): ChartLegendLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendLabelOptions]
  }
  
  @scala.inline
  implicit class ChartLegendLabelOptionsOps[Self <: ChartLegendLabelOptions] (val x: Self) extends AnyVal {
    
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
    def setBoxWidth(value: Double): Self = this.set("boxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxWidth: Self = this.set("boxWidth", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* legendItem */ ChartLegendLabelItem, /* data */ ChartData) => _): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFontColorVarargs(value: String*): Self = this.set("fontColor", js.Array(value :_*))
    
    @scala.inline
    def setFontColor(value: ChartColor): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setGenerateLabels(value: /* chart */ Chart => js.Array[ChartLegendLabelItem]): Self = this.set("generateLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenerateLabels: Self = this.set("generateLabels", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setUsePointStyle(value: Boolean): Self = this.set("usePointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePointStyle: Self = this.set("usePointStyle", js.undefined)
  }
}
