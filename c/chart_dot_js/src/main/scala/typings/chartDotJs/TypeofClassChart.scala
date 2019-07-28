package typings.chartDotJs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.chartDotJs.chartDotJsMod.Chart
import typings.chartDotJs.chartDotJsMod.ChartConfiguration
import typings.chartDotJs.chartDotJsMod.ChartTooltipsStaticConfiguration
import typings.chartDotJs.chartDotJsMod.PluginServiceStatic
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassChart extends Instantiable2[
      (/* context */ ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement]) | (/* context */ CanvasRenderingContext2D) | (/* context */ HTMLCanvasElement) | (/* context */ String), 
      /* options */ ChartConfiguration, 
      Chart
    ] {
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: Anon_Global = js.native
  var helpers: StringDictionary[js.Any] = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

