package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.heatmapTypesMod.HeatmapOptions
import typings.bizcharts.coreInterfaceMod.LabelAPIOptions
import typings.bizcharts.coreInterfaceMod.LengendAPIOptions
import typings.bizcharts.coreInterfaceMod.TooltipAPIOptions
import typings.bizcharts.createPlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densityHeatmapChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/DensityHeatmapChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DensityHeatmapOptions & RefAttributes[Any]] = js.native
  
  trait DensityHeatmapOptions
    extends StObject
       with HeatmapOptions
       with BasePlotOptions {
    
    /** 数据标注label */
    @JSName("label")
    var label_DensityHeatmapOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    /** 图例 */
    @JSName("legend")
    var legend_DensityHeatmapOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** g2Plot@1.0的api，即将废弃，请使用 `sizeRatio` 替代 */
    var radius: js.UndefOr[(Record[String, Any]) | Double] = js.undefined
    
    /** 图表提示框 */
    @JSName("tooltip")
    var tooltip_DensityHeatmapOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
  }
  object DensityHeatmapOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): DensityHeatmapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[DensityHeatmapOptions]
    }
    
    extension [Self <: DensityHeatmapOptions](x: Self) {
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setRadius(value: (Record[String, Any]) | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[DensityHeatmapOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `densityHeatmapChartMod.foo` */
  override def _to: ForwardRefExoticComponent[DensityHeatmapOptions & RefAttributes[Any]] = default
}
