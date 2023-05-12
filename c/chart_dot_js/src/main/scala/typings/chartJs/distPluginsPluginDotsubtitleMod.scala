package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotsubtitleMod {
  
  object default {
    
    @JSImport("chart.js/dist/plugins/plugin.subtitle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaultRoutes {
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaultRoutes.color")
      @js.native
      val color: String = js.native
    }
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.align")
      @js.native
      val align: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.display")
      @js.native
      val display: Boolean = js.native
      
      object font {
        
        @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.font.weight")
        @js.native
        val weight: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.fullSize")
      @js.native
      val fullSize: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.padding")
      @js.native
      val padding: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.text")
      @js.native
      val text: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.defaults.weight_1")
      @js.native
      val weight1: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.descriptors._indexable")
      @js.native
      val indexable: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.descriptors._scriptable")
      @js.native
      val scriptable: Boolean = js.native
    }
    
    @JSImport("chart.js/dist/plugins/plugin.subtitle", "default.id")
    @js.native
    val id: String = js.native
    
    inline def start(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stop(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
