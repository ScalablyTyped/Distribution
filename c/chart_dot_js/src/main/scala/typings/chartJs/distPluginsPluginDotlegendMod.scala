package typings.chartJs

import typings.chartJs.anon.Ctx
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotlegendMod {
  
  object default {
    
    @JSImport("chart.js/dist/plugins/plugin.legend", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterEvent(chart: Any, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEvent")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterUpdate(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterUpdate")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object defaults {
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.align")
      @js.native
      val align: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.display")
      @js.native
      val display: Boolean = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.fullSize")
      @js.native
      val fullSize: Boolean = js.native
      
      object labels {
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.labels")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.labels.boxWidth")
        @js.native
        val boxWidth: Double = js.native
        
        inline def color(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
        
        inline def generateLabels(chart: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLabels")(chart.asInstanceOf[js.Any]).asInstanceOf[Any]
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.labels.padding")
        @js.native
        val padding: Double = js.native
      }
      
      inline def onClick(e: Any, legendItem: Any, legend: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onClick")(e.asInstanceOf[js.Any], legendItem.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.onHover")
      @js.native
      val onHover: Any = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.onLeave")
      @js.native
      val onLeave: Any = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.position")
      @js.native
      val position: String = js.native
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.reverse")
      @js.native
      val reverse: Boolean = js.native
      
      object title {
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.title")
        @js.native
        val ^ : js.Any = js.native
        
        inline def color1(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color_1")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.title.display_1")
        @js.native
        val display1: Boolean = js.native
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.title.position_1")
        @js.native
        val position1: String = js.native
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.title.text")
        @js.native
        val text: String = js.native
      }
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.defaults.weight")
      @js.native
      val weight: Double = js.native
    }
    
    object descriptors {
      
      @JSImport("chart.js/dist/plugins/plugin.legend", "default.descriptors")
      @js.native
      val ^ : js.Any = js.native
      
      object labels1 {
        
        @JSImport("chart.js/dist/plugins/plugin.legend", "default.descriptors.labels_1")
        @js.native
        val ^ : js.Any = js.native
        
        inline def scriptable1(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable_1")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      }
      
      inline def scriptable(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSImport("chart.js/dist/plugins/plugin.legend", "default.id")
    @js.native
    val id: String = js.native
    
    inline def start(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stop(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("chart.js/dist/plugins/plugin.legend", "Legend")
  @js.native
  open class Legend protected () extends default[AnyObject, AnyObject] {
    /**
      * @param {{ ctx: any; options: any; chart: any; }} config
      */
    def this(config: Ctx) = this()
    
    var _added: Boolean = js.native
    
    /**
      * @private
      */
    /* private */ var _computeTitleHeight: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _draw: Any = js.native
    
    def _fitCols(titleHeight: Any, labelFont: Any, boxWidth: Any, _itemHeight: Any): Any = js.native
    
    /**
      * @private
      */
    /* private */ var _fitRows: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _getLegendItemAt: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _hoveredItem: Any = js.native
    
    var _margins: Any = js.native
    
    def adjustHitBoxes(): Unit = js.native
    
    var bottom: Any = js.native
    
    def buildLabels(): Unit = js.native
    
    var chart: Any = js.native
    
    var columnSizes: js.Array[Any] = js.native
    
    var ctx: Any = js.native
    
    var doughnutMode: Boolean = js.native
    
    def draw(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawTitle(): Unit = js.native
    
    def fit(): Unit = js.native
    
    var fullSize: Any = js.native
    
    /**
      * Handle an event
      * @param {ChartEvent} e - The event to handle
      */
    def handleEvent(e: ChartEvent): Unit = js.native
    
    var height: Any = js.native
    
    def isHorizontal(): Boolean = js.native
    
    var left: Any = js.native
    
    var legendHitBoxes: js.Array[Any] = js.native
    
    var legendItems: Any = js.native
    
    var lineWidths: js.Array[Double] = js.native
    
    var maxHeight: Any = js.native
    
    var maxWidth: Any = js.native
    
    var position: Any = js.native
    
    var right: Any = js.native
    
    def setDimensions(): Unit = js.native
    
    var top: Any = js.native
    
    def update(maxWidth: Any, maxHeight: Any, margins: Any): Unit = js.native
    
    var weight: Any = js.native
    
    var width: Any = js.native
  }
  
  type ChartEvent = typings.chartJs.distTypesIndexMod.ChartEvent
}
