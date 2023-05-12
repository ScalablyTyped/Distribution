package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotdecimationMod {
  
  object default {
    
    @JSImport("chart.js/dist/plugins/plugin.decimation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeElementsUpdate(chart: Any, args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeElementsUpdate")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins/plugin.decimation", "default.defaults.algorithm")
      @js.native
      val algorithm: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.decimation", "default.defaults.enabled")
      @js.native
      val enabled: Boolean = js.native
    }
    
    inline def destroy(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("chart.js/dist/plugins/plugin.decimation", "default.id")
    @js.native
    val id: String = js.native
  }
}
