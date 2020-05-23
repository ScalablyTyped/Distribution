package typings.chartJs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.mod.ChartConfiguration
import typings.chartJs.mod.ChartTooltipsStaticConfiguration
import typings.chartJs.mod.PluginServiceStatic
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofChart
  extends Instantiable2[
      (/* context */ ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]) | (/* context */ CanvasRenderingContext2D) | (/* context */ HTMLCanvasElement) | (/* context */ String), 
      /* options */ ChartConfiguration, 
      typings.chartJs.mod.Chart
    ] {
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: Dictkey = js.native
  var helpers: StringDictionary[js.Any] = js.native
  val instances: StringDictionary[typings.chartJs.mod.Chart] = js.native
  var platform: DisableCSSInjection = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

