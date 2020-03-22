package typings.chartJs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.mod.Chart
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
trait TypeofChart extends Instantiable2[
      (/* context */ ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]) | (/* context */ CanvasRenderingContext2D) | (/* context */ HTMLCanvasElement) | (/* context */ String), 
      /* options */ ChartConfiguration, 
      Chart
    ] {
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: AnonDictkey = js.native
  var helpers: StringDictionary[js.Any] = js.native
  val instances: StringDictionary[Chart] = js.native
  var platform: AnonDisableCSSInjection = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

