package typings.bizcharts

import typings.bizcharts.createPlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartMod {
  
  @JSImport("bizcharts/lib/plots/BarChart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/plots/BarChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[BarOptions & RefAttributes[Any]] = js.native
  
  inline def polyfill(opt: BarOptions): BarOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(opt.asInstanceOf[js.Any]).asInstanceOf[BarOptions]
  
  trait BarOptions
    extends StObject
       with typings.antvG2plot.barTypesMod.BarOptions
       with BasePlotOptions {
    
    /** 条形的宽度，如设置该属性值，则宽度固定不自动调整 */
    var barSize: js.UndefOr[Double] = js.undefined
    
    /** 请使用seriesField替代 */
    var colorField: js.UndefOr[Any] = js.undefined
    
    /** 旧版api，即将废弃 请使用seriesField替代 */
    var stackField: js.UndefOr[String] = js.undefined
  }
  object BarOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): BarOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarOptions]
    }
    
    extension [Self <: BarOptions](x: Self) {
      
      inline def setBarSize(value: Double): Self = StObject.set(x, "barSize", value.asInstanceOf[js.Any])
      
      inline def setBarSizeUndefined: Self = StObject.set(x, "barSize", js.undefined)
      
      inline def setColorField(value: Any): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setStackField(value: String): Self = StObject.set(x, "stackField", value.asInstanceOf[js.Any])
      
      inline def setStackFieldUndefined: Self = StObject.set(x, "stackField", js.undefined)
    }
  }
}
