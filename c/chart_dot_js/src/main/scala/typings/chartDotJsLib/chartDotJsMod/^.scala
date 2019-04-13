package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chart.js", JSImport.Namespace)
@js.native
class ^ protected () extends Chart {
  def this(context: java.lang.String, options: ChartConfiguration) = this()
  def this(context: stdLib.ArrayLike[stdLib.CanvasRenderingContext2D | stdLib.HTMLCanvasElement], options: ChartConfiguration) = this()
  def this(context: stdLib.CanvasRenderingContext2D, options: ChartConfiguration) = this()
  def this(context: stdLib.HTMLCanvasElement, options: ChartConfiguration) = this()
}

@JSImport("chart.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Chart: chartDotJsLib.Anon_Chart = js.native
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var defaults: chartDotJsLib.Anon_Global = js.native
  var helpers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

