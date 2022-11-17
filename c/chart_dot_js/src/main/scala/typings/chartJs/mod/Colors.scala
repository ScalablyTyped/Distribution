package typings.chartJs.mod

import typings.chartJs.anon.Enabled
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint
import typings.chartJs.distChunksHelpersDotcoreMod.d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Colors {
  
  @JSImport("chart.js", "Colors")
  @js.native
  val ^ : js.Any = js.native
  
  inline def beforeLayout(chart: d[ChartType, DefaultDataPoint[ChartType], Any], _args: Any, options: ColorsPluginOptions): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeLayout")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @JSImport("chart.js", "Colors.defaults")
  @js.native
  def defaults: Enabled = js.native
  inline def defaults_=(x: Enabled): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "Colors.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
