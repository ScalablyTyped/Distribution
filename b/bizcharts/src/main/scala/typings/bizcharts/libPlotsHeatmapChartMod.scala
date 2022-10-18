package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsHeatmapChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/HeatmapChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HeatmapOptions & RefAttributes[Any]] = js.native
  
  trait HeatmapOptions
    extends StObject
       with typings.antvG2plot.libPlotsHeatmapTypesMod.HeatmapOptions
       with BasePlotOptions {
    
    /** 该属性是g2plot@1.0的属性，即将废弃，请使用 `heatmapStyle` 替代 */
    var shapeType: js.UndefOr[Any] = js.undefined
  }
  object HeatmapOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): HeatmapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapOptions]
    }
    
    extension [Self <: HeatmapOptions](x: Self) {
      
      inline def setShapeType(value: Any): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
      
      inline def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[HeatmapOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsHeatmapChartMod.foo` */
  override def _to: ForwardRefExoticComponent[HeatmapOptions & RefAttributes[Any]] = default
}
