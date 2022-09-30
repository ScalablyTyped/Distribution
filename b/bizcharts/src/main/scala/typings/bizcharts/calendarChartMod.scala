package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.attrMod.ColorAttr
import typings.antvG2plot.heatmapTypesMod.HeatmapOptions
import typings.antvG2plot.typesCommonMod.Datum
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

object calendarChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/CalendarChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CalendarOptions & RefAttributes[Any]] = js.native
  
  trait CalendarOptions
    extends StObject
       with HeatmapOptions
       with BasePlotOptions {
    
    /** colors 是 g2Plot@1.0 的属性，即将废弃， 请使用 color 属性替代 */
    var colors: js.UndefOr[ColorAttr] = js.undefined
    
    var dateField: js.UndefOr[String] = js.undefined
    
    var dateRange: js.UndefOr[js.Array[String]] = js.undefined
    
    /** 数据标注label */
    @JSName("label")
    var label_CalendarOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    /** 图例 */
    @JSName("legend")
    var legend_CalendarOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** 图表提示框 */
    @JSName("tooltip")
    var tooltip_CalendarOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
    
    /** valueField 是 g2@1.0的属性，即将废弃，请使用colorField替代 */
    var valueField: js.UndefOr[String] = js.undefined
  }
  object CalendarOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): CalendarOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarOptions]
    }
    
    extension [Self <: CalendarOptions](x: Self) {
      
      inline def setColors(value: ColorAttr): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "colors", js.Any.fromFunction2(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDateField(value: String): Self = StObject.set(x, "dateField", value.asInstanceOf[js.Any])
      
      inline def setDateFieldUndefined: Self = StObject.set(x, "dateField", js.undefined)
      
      inline def setDateRange(value: js.Array[String]): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
      
      inline def setDateRangeVarargs(value: String*): Self = StObject.set(x, "dateRange", js.Array(value*))
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[CalendarOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `calendarChartMod.foo` */
  override def _to: ForwardRefExoticComponent[CalendarOptions & RefAttributes[Any]] = default
}
