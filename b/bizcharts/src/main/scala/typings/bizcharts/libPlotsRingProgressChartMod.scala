package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRingProgressChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/RingProgressChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RingProgressOptions & RefAttributes[Any]] = js.native
  
  trait RingProgressOptions
    extends StObject
       with BasePlotOptions
       with typings.antvG2plot.libPlotsRingProgressTypesMod.RingProgressOptions
  object RingProgressOptions {
    
    inline def apply(percent: Double): RingProgressOptions = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RingProgressOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[RingProgressOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsRingProgressChartMod.foo` */
  override def _to: ForwardRefExoticComponent[RingProgressOptions & RefAttributes[Any]] = default
}
