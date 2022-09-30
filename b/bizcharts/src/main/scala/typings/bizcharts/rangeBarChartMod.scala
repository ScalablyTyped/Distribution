package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.barChartMod.BarOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeBarChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/RangeBarChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RangeBarOptions & RefAttributes[Any]] = js.native
  
  type RangeBarOptions = BarOptions
  
  type _To = ForwardRefExoticComponent[RangeBarOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rangeBarChartMod.foo` */
  override def _to: ForwardRefExoticComponent[RangeBarOptions & RefAttributes[Any]] = default
}
