package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.createPlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterfallChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/WaterfallChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]] = js.native
  
  trait WaterfallOptions
    extends StObject
       with typings.antvG2plot.waterfallTypesMod.WaterfallOptions
       with BasePlotOptions
  object WaterfallOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): WaterfallOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaterfallOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `waterfallChartMod.foo` */
  override def _to: ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]] = default
}
