package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.createPlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/PieChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PieOptions & RefAttributes[Any]] = js.native
  
  trait PieOptions
    extends StObject
       with typings.antvG2plot.pieTypesMod.PieOptions
       with BasePlotOptions
  object PieOptions {
    
    inline def apply(angleField: String, colorField: String, data: js.Array[Record[String, Any]]): PieOptions = {
      val __obj = js.Dynamic.literal(angleField = angleField.asInstanceOf[js.Any], colorField = colorField.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[PieOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `pieChartMod.foo` */
  override def _to: ForwardRefExoticComponent[PieOptions & RefAttributes[Any]] = default
}
