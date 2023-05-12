package typings.chartJs

import typings.chartJs.anon.Ctx
import typings.chartJs.anon.MaxWidth
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDottitleMod {
  
  object default {
    
    @JSImport("chart.js/dist/plugins/plugin.title", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaultRoutes {
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaultRoutes.color")
      @js.native
      val color: String = js.native
    }
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.align")
      @js.native
      val align: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.display")
      @js.native
      val display: Boolean = js.native
      
      object font {
        
        @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.font.weight")
        @js.native
        val weight: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.fullSize")
      @js.native
      val fullSize: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.padding")
      @js.native
      val padding: Double = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.text")
      @js.native
      val text: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.defaults.weight_1")
      @js.native
      val weight1: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.descriptors._indexable")
      @js.native
      val indexable: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.title", "default.descriptors._scriptable")
      @js.native
      val scriptable: Boolean = js.native
    }
    
    @JSImport("chart.js/dist/plugins/plugin.title", "default.id")
    @js.native
    val id: String = js.native
    
    inline def start(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stop(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("chart.js/dist/plugins/plugin.title", "Title")
  @js.native
  open class Title protected () extends default[AnyObject, AnyObject] {
    /**
      * @param {{ ctx: any; options: any; chart: any; }} config
      */
    def this(config: Ctx) = this()
    
    def _drawArgs(offset: Any): MaxWidth = js.native
    
    var _padding: ChartArea = js.native
    
    var bottom: Any = js.native
    
    var chart: Any = js.native
    
    var ctx: Any = js.native
    
    def draw(): Unit = js.native
    
    var fullSize: Any = js.native
    
    var height: Any = js.native
    
    def isHorizontal(): Boolean = js.native
    
    var left: Double = js.native
    
    var position: Any = js.native
    
    var right: Any = js.native
    
    var top: Double = js.native
    
    def update(maxWidth: Any, maxHeight: Any): Unit = js.native
    
    var weight: Any = js.native
    
    var width: Any = js.native
  }
}
