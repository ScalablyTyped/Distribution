package typings.bizcharts

import typings.bizcharts.progressChartMod.ProgressOptions
import typings.bizcharts.ringProgressChartMod.RingProgressOptions
import typings.bizcharts.tinyAreaChartMod.TinyAreaOptions
import typings.bizcharts.tinyColumnChartMod.TinyColumnOptions
import typings.bizcharts.tinyLineChartMod.TinyLineOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparklineMod {
  
  @JSImport("bizcharts/lib/plots/sparkline", "ProgressChart")
  @js.native
  val ProgressChart: ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/plots/sparkline", "RingProgressChart")
  @js.native
  val RingProgressChart: ForwardRefExoticComponent[RingProgressOptions & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/plots/sparkline", "TinyAreaChart")
  @js.native
  val TinyAreaChart: ForwardRefExoticComponent[TinyAreaOptions & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/plots/sparkline", "TinyColumnChart")
  @js.native
  val TinyColumnChart: ForwardRefExoticComponent[TinyColumnOptions & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/plots/sparkline", "TinyLineChart")
  @js.native
  val TinyLineChart: ForwardRefExoticComponent[TinyLineOptions & RefAttributes[Any]] = js.native
}
