package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.libPlotsBarTypesMod.BarOptions
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

object libPlotsGroupedBarChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/GroupedBarChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[GroupedBarOptions & RefAttributes[Any]] = js.native
  
  trait GroupedBarOptions
    extends StObject
       with BarOptions
       with BasePlotOptions {
    
    /** 条形的宽度，如设置该属性值，则宽度固定不自动调整 */
    var barSize: js.UndefOr[Double] = js.undefined
    
    /** 数据标注label */
    @JSName("label")
    var label_GroupedBarOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    /** 图例 */
    @JSName("legend")
    var legend_GroupedBarOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** 图表提示框 */
    @JSName("tooltip")
    var tooltip_GroupedBarOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
  }
  object GroupedBarOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): GroupedBarOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupedBarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupedBarOptions] (val x: Self) extends AnyVal {
      
      inline def setBarSize(value: Double): Self = StObject.set(x, "barSize", value.asInstanceOf[js.Any])
      
      inline def setBarSizeUndefined: Self = StObject.set(x, "barSize", js.undefined)
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[GroupedBarOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsGroupedBarChartMod.foo` */
  override def _to: ForwardRefExoticComponent[GroupedBarOptions & RefAttributes[Any]] = default
}
