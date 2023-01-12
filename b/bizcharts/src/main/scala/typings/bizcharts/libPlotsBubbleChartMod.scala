package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.libPlotsScatterTypesMod.ScatterOptions
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.bizcharts.libPlotsCoreInterfaceMod.LabelAPIOptions
import typings.bizcharts.libPlotsCoreInterfaceMod.LengendAPIOptions
import typings.bizcharts.libPlotsCoreInterfaceMod.TooltipAPIOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBubbleChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/BubbleChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[BubbleOptions & RefAttributes[Any]] = js.native
  
  trait BubbleOptions
    extends StObject
       with ScatterOptions
       with BasePlotOptions {
    
    @JSName("label")
    var label_BubbleOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    @JSName("legend")
    var legend_BubbleOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** 该属性已废弃，请使用size替代 */
    var pointSize: js.UndefOr[Any] = js.undefined
    
    @JSName("tooltip")
    var tooltip_BubbleOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
    
    /**
      * 该属性已废弃，请使用regressionLine替代,
      * 文档查看：https://g2plot.antv.vision/zh/examples/scatter/basic/#regressionLine
      */
    var trendLine: js.UndefOr[Any] = js.undefined
  }
  object BubbleOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): BubbleOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[BubbleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BubbleOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setPointSize(value: Any): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTrendLine(value: Any): Self = StObject.set(x, "trendLine", value.asInstanceOf[js.Any])
      
      inline def setTrendLineUndefined: Self = StObject.set(x, "trendLine", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[BubbleOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsBubbleChartMod.foo` */
  override def _to: ForwardRefExoticComponent[BubbleOptions & RefAttributes[Any]] = default
}
