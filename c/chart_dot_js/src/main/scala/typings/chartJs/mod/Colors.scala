package typings.chartJs.mod

import typings.chartJs.distPluginsPluginDotcolorsMod.ColorsPluginOptions
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Colors {
  
  @JSImport("chart.js", "Colors")
  @js.native
  val ^ : js.Any = js.native
  
  inline def beforeLayout(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    _args: Any,
    options: ColorsPluginOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeLayout")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("chart.js", "Colors.defaults")
  @js.native
  def defaults: ColorsPluginOptions = js.native
  inline def defaults_=(x: ColorsPluginOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "Colors.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
