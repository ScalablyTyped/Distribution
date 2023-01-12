package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRoseChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/RoseChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RoseOptions & RefAttributes[Any]] = js.native
  
  trait RoseOptions
    extends StObject
       with typings.antvG2plot.libPlotsRoseTypesMod.RoseOptions
       with BasePlotOptions {
    
    /** 请使用xField替代 */
    var categoryField: js.UndefOr[String] = js.undefined
    
    /** 请使用seriesField替代 */
    var colorField: js.UndefOr[String] = js.undefined
    
    /** 请使用yFeild替代 */
    var radiusField: js.UndefOr[String] = js.undefined
  }
  object RoseOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): RoseOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoseOptions] (val x: Self) extends AnyVal {
      
      inline def setCategoryField(value: String): Self = StObject.set(x, "categoryField", value.asInstanceOf[js.Any])
      
      inline def setCategoryFieldUndefined: Self = StObject.set(x, "categoryField", js.undefined)
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setRadiusField(value: String): Self = StObject.set(x, "radiusField", value.asInstanceOf[js.Any])
      
      inline def setRadiusFieldUndefined: Self = StObject.set(x, "radiusField", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RoseOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsRoseChartMod.foo` */
  override def _to: ForwardRefExoticComponent[RoseOptions & RefAttributes[Any]] = default
}
