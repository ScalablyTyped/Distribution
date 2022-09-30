package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.areaChartMod.AreaOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackedAreaChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/StackedAreaChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StackedAreaOptions & RefAttributes[Any]] = js.native
  
  type StackedAreaOptions = AreaOptions
  
  type _To = ForwardRefExoticComponent[StackedAreaOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `stackedAreaChartMod.foo` */
  override def _to: ForwardRefExoticComponent[StackedAreaOptions & RefAttributes[Any]] = default
}
