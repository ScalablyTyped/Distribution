package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.libPlotsColumnTypesMod.ColumnOptions
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

object libPlotsGroupedColumnChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/GroupedColumnChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[GroupedColumnOptions & RefAttributes[Any]] = js.native
  
  trait GroupedColumnOptions
    extends StObject
       with ColumnOptions
       with BasePlotOptions {
    
    /** 柱子的宽度，如设置该属性值，则宽度固定不自动调整 */
    var columnSize: js.UndefOr[Double] = js.undefined
    
    /** 数据标注label */
    @JSName("label")
    var label_GroupedColumnOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    /** 图例 */
    @JSName("legend")
    var legend_GroupedColumnOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** 图表提示框 */
    @JSName("tooltip")
    var tooltip_GroupedColumnOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
  }
  object GroupedColumnOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): GroupedColumnOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupedColumnOptions]
    }
    
    extension [Self <: GroupedColumnOptions](x: Self) {
      
      inline def setColumnSize(value: Double): Self = StObject.set(x, "columnSize", value.asInstanceOf[js.Any])
      
      inline def setColumnSizeUndefined: Self = StObject.set(x, "columnSize", js.undefined)
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[GroupedColumnOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsGroupedColumnChartMod.foo` */
  override def _to: ForwardRefExoticComponent[GroupedColumnOptions & RefAttributes[Any]] = default
}
