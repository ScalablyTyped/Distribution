package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.areaChartMod.AreaOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object percentStackedAreaChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/PercentStackedAreaChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PercentStackedAreaOptions & RefAttributes[Any]] = js.native
  
  type PercentStackedAreaOptions = AreaOptions
  
  type _To = ForwardRefExoticComponent[PercentStackedAreaOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `percentStackedAreaChartMod.foo` */
  override def _to: ForwardRefExoticComponent[PercentStackedAreaOptions & RefAttributes[Any]] = default
}
