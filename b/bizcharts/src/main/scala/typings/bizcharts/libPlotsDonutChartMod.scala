package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.libPlotsPieTypesMod.PieOptions
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

object libPlotsDonutChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/DonutChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]] = js.native
  
  trait DonutOptions
    extends StObject
       with PieOptions
       with BasePlotOptions {
    
    /** 数据标注label */
    @JSName("label")
    var label_DonutOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    /** 图例 */
    @JSName("legend")
    var legend_DonutOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** 图表提示框 */
    @JSName("tooltip")
    var tooltip_DonutOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
  }
  object DonutOptions {
    
    inline def apply(angleField: String, colorField: String, data: js.Array[Record[String, Any]]): DonutOptions = {
      val __obj = js.Dynamic.literal(angleField = angleField.asInstanceOf[js.Any], colorField = colorField.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DonutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DonutOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsDonutChartMod.foo` */
  override def _to: ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]] = default
}
