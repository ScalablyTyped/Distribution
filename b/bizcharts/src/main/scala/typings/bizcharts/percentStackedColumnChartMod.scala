package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.columnChartMod.ColumnOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object percentStackedColumnChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/PercentStackedColumnChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]] = js.native
  
  type PercentStackedColumnOptions = ColumnOptions
  
  type _To = ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `percentStackedColumnChartMod.foo` */
  override def _to: ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]] = default
}
