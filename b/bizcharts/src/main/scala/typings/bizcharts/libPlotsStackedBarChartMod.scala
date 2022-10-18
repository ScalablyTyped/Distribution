package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.libPlotsBarChartMod.BarOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsStackedBarChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/StackedBarChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StackedBarOptions & RefAttributes[Any]] = js.native
  
  type StackedBarOptions = BarOptions
  
  type _To = ForwardRefExoticComponent[StackedBarOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsStackedBarChartMod.foo` */
  override def _to: ForwardRefExoticComponent[StackedBarOptions & RefAttributes[Any]] = default
}
