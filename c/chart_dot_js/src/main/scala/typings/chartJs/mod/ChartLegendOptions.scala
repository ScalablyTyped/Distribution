package typings.chartJs.mod

import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.end
import typings.chartJs.chartJsStrings.start
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendOptions extends StObject {
  
  var align: js.UndefOr[center | end | start] = js.undefined
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var labels: js.UndefOr[ChartLegendLabelOptions] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.undefined
  
  var onHover: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.undefined
  
  var onLeave: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.undefined
  
  var position: js.UndefOr[PositionType] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var textDirection: js.UndefOr[String] = js.undefined
}
object ChartLegendOptions {
  
  inline def apply(): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendOptions]
  }
  
  extension [Self <: ChartLegendOptions](x: Self) {
    
    inline def setAlign(value: center | end | start): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setLabels(value: ChartLegendLabelOptions): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOnClick(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    inline def setOnLeave(value: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction2(value))
    
    inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
  }
}
