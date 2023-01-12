package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginOptionsByType[TType /* <: ChartType */] extends StObject {
  
  var decimation: DecimationOptions
  
  var filler: FillerOptions
  
  var legend: LegendOptions[TType]
  
  var subtitle: TitleOptions
  
  var title: TitleOptions
  
  var tooltip: TooltipOptions[TType]
}
object PluginOptionsByType {
  
  inline def apply[TType /* <: ChartType */](
    decimation: DecimationOptions,
    filler: FillerOptions,
    legend: LegendOptions[TType],
    subtitle: TitleOptions,
    title: TitleOptions,
    tooltip: TooltipOptions[TType]
  ): PluginOptionsByType[TType] = {
    val __obj = js.Dynamic.literal(decimation = decimation.asInstanceOf[js.Any], filler = filler.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptionsByType[TType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginOptionsByType[?], TType /* <: ChartType */] (val x: Self & PluginOptionsByType[TType]) extends AnyVal {
    
    inline def setDecimation(value: DecimationOptions): Self = StObject.set(x, "decimation", value.asInstanceOf[js.Any])
    
    inline def setFiller(value: FillerOptions): Self = StObject.set(x, "filler", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: LegendOptions[TType]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: TitleOptions): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: TitleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: TooltipOptions[TType]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
