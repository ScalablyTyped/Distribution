package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotfillerMod {
  
  object default {
    
    @JSImport("chart.js/dist/plugins/plugin.filler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterDatasetsUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDatasetsUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDatasetDraw(chart: Any, args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDatasetDraw")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDatasetsDraw(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDatasetsDraw")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDraw(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDraw")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins/plugin.filler", "default.defaults.drawTime")
      @js.native
      val drawTime: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.filler", "default.defaults.propagate")
      @js.native
      val propagate: Boolean = js.native
    }
    
    @JSImport("chart.js/dist/plugins/plugin.filler", "default.id")
    @js.native
    val id: String = js.native
  }
}
