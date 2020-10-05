package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.Dictkey
import typings.chartJs.anon.DisableCSSInjection
import typings.chartJs.anon.TypeofChart
import typings.chartJs.anon.UpdateScaleDefaults
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js", JSImport.Namespace)
@js.native
class ^ protected () extends Chart {
  def this(context: String, options: ChartConfiguration) = this()
  def this(context: ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement], options: ChartConfiguration) = this()
  def this(context: CanvasRenderingContext2D, options: ChartConfiguration) = this()
  def this(context: HTMLCanvasElement, options: ChartConfiguration) = this()
}

@JSImport("chart.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Chart: TypeofChart = js.native
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: Dictkey = js.native
  var helpers: StringDictionary[js.Any] = js.native
  val instances: StringDictionary[typings.chartJs.mod.Chart] = js.native
  var platform: DisableCSSInjection = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
  var scaleService: UpdateScaleDefaults = js.native
}

