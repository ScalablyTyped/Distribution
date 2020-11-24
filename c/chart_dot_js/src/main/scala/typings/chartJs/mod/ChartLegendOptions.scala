package typings.chartJs.mod

import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.end
import typings.chartJs.chartJsStrings.start
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendOptions extends js.Object {
  
  var align: js.UndefOr[center | end | start] = js.native
  
  var display: js.UndefOr[Boolean] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var labels: js.UndefOr[ChartLegendLabelOptions] = js.native
  
  var onClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.native
  
  var onHover: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.native
  
  var onLeave: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.native
  
  var position: js.UndefOr[PositionType] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var rtl: js.UndefOr[Boolean] = js.native
  
  var textDirection: js.UndefOr[String] = js.native
}
object ChartLegendOptions {
  
  @scala.inline
  def apply(): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendOptions]
  }
  
  @scala.inline
  implicit class ChartLegendOptionsOps[Self <: ChartLegendOptions] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: center | end | start): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartLegendLabelOptions): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = this.set("onHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    
    @scala.inline
    def setOnLeave(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = this.set("onLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setTextDirection(value: String): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
  }
}
