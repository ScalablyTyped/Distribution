package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.libPlotsRoseTypesMod.RoseOptions
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

object libPlotsStackedRoseChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/StackedRoseChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StackedRoseOptions & RefAttributes[Any]] = js.native
  
  trait StackedRoseOptions
    extends StObject
       with RoseOptions
       with BasePlotOptions {
    
    /** 请使用xField替代 */
    var categoryField: js.UndefOr[String] = js.undefined
    
    @JSName("label")
    var label_StackedRoseOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    @JSName("legend")
    var legend_StackedRoseOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** 请使用yFeild替代 */
    var radiusField: js.UndefOr[String] = js.undefined
    
    /** 请使用seriesField替代 */
    var stackField: js.UndefOr[String] = js.undefined
    
    @JSName("tooltip")
    var tooltip_StackedRoseOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
  }
  object StackedRoseOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): StackedRoseOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackedRoseOptions]
    }
    
    extension [Self <: StackedRoseOptions](x: Self) {
      
      inline def setCategoryField(value: String): Self = StObject.set(x, "categoryField", value.asInstanceOf[js.Any])
      
      inline def setCategoryFieldUndefined: Self = StObject.set(x, "categoryField", js.undefined)
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setRadiusField(value: String): Self = StObject.set(x, "radiusField", value.asInstanceOf[js.Any])
      
      inline def setRadiusFieldUndefined: Self = StObject.set(x, "radiusField", js.undefined)
      
      inline def setStackField(value: String): Self = StObject.set(x, "stackField", value.asInstanceOf[js.Any])
      
      inline def setStackFieldUndefined: Self = StObject.set(x, "stackField", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[StackedRoseOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsStackedRoseChartMod.foo` */
  override def _to: ForwardRefExoticComponent[StackedRoseOptions & RefAttributes[Any]] = default
}
