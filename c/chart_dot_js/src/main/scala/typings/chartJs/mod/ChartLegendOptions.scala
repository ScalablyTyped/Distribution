package typings.chartJs.mod

import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.end
import typings.chartJs.chartJsStrings.start
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendOptions extends StObject {
  
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
  implicit class ChartLegendOptionsMutableBuilder[Self <: ChartLegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: center | end | start): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartLegendLabelOptions): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    @scala.inline
    def setOnLeave(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
  }
}
