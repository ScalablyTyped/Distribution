package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chart.js", JSImport.Namespace)
@js.native
class namespaced protected () extends Chart {
  def this(context: java.lang.String, options: chartDotJsLib.chartDotJsMod.ChartNs.ChartConfiguration) = this()
  def this(context: stdLib.ArrayLike[stdLib.CanvasRenderingContext2D | stdLib.HTMLCanvasElement], options: chartDotJsLib.chartDotJsMod.ChartNs.ChartConfiguration) = this()
  def this(context: stdLib.CanvasRenderingContext2D, options: chartDotJsLib.chartDotJsMod.ChartNs.ChartConfiguration) = this()
  def this(context: stdLib.HTMLCanvasElement, options: chartDotJsLib.chartDotJsMod.ChartNs.ChartConfiguration) = this()
}

@JSImport("chart.js", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  val Chart: org.scalablytyped.runtime.Instantiable2[
    /* context */ java.lang.String | stdLib.CanvasRenderingContext2D | stdLib.HTMLCanvasElement | (stdLib.ArrayLike[stdLib.CanvasRenderingContext2D | stdLib.HTMLCanvasElement]), 
    /* options */ chartDotJsLib.chartDotJsMod.ChartNs.ChartConfiguration, 
    chartDotJsLib.chartDotJsMod.Chart
  ] = js.native
  // Tooltip Static Options
  var Tooltip: chartDotJsLib.chartDotJsMod.ChartNs.ChartTooltipsStaticConfiguration = js.native
  var controllers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var defaults: chartDotJsLib.Anon_Key = js.native
  var helpers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var pluginService: chartDotJsLib.chartDotJsMod.PluginServiceStatic = js.native
  var plugins: chartDotJsLib.chartDotJsMod.PluginServiceStatic = js.native
}

