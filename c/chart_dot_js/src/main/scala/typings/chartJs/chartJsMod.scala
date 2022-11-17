package typings.chartJs

import org.scalablytyped.runtime.Instantiable0
import typings.chartJs.anon.Enabled
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint
import typings.chartJs.distChunksHelpersDotcoreMod.d
import typings.chartJs.mod.Animator_
import typings.chartJs.mod.BasicPlatform
import typings.chartJs.mod.ColorsPluginOptions
import typings.chartJs.mod.DomPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object chartJsMod {
  
  @JSImport("chart/js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Colors {
    
    @JSImport("chart/js", "Colors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeLayout(chart: d[ChartType, DefaultDataPoint[ChartType], Any], _args: Any, options: ColorsPluginOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeLayout")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("chart/js", "Colors.defaults")
    @js.native
    def defaults: Enabled = js.native
    inline def defaults_=(x: Enabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart/js", "Colors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart/js", "animator")
  @js.native
  val animator: Animator_ = js.native
  
  inline def detectPlatform(canvas: Any): Instantiable0[BasicPlatform | DomPlatform] = ^.asInstanceOf[js.Dynamic].applyDynamic("_detectPlatform")(canvas.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[BasicPlatform | DomPlatform]]
}
