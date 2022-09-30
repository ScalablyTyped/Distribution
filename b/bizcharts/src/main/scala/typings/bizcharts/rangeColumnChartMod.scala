package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.columnChartMod.ColumnOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeColumnChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/RangeColumnChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RangeColumnOptions & RefAttributes[Any]] = js.native
  
  type RangeColumnOptions = ColumnOptions
  
  type _To = ForwardRefExoticComponent[RangeColumnOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rangeColumnChartMod.foo` */
  override def _to: ForwardRefExoticComponent[RangeColumnOptions & RefAttributes[Any]] = default
}
