package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.createPlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/ProgressChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]] = js.native
  
  trait ProgressOptions
    extends StObject
       with BasePlotOptions
       with typings.antvG2plot.progressTypesMod.ProgressOptions
  object ProgressOptions {
    
    inline def apply(percent: Double): ProgressOptions = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `progressChartMod.foo` */
  override def _to: ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]] = default
}
