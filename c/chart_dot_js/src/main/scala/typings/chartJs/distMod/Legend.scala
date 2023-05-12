package typings.chartJs.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Legend {
  
  @JSImport("chart.js/dist", "Legend")
  @js.native
  val ^ : js.Any = js.native
  
  inline def afterEvent(chart: Any, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEvent")(chart.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterUpdate(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterUpdate")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def beforeUpdate(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object defaults {
    
    @JSImport("chart.js/dist", "Legend.defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist", "Legend.defaults.align")
    @js.native
    val align: String = js.native
    
    @JSImport("chart.js/dist", "Legend.defaults.display")
    @js.native
    val display: Boolean = js.native
    
    @JSImport("chart.js/dist", "Legend.defaults.fullSize")
    @js.native
    val fullSize: Boolean = js.native
    
    object labels {
      
      @JSImport("chart.js/dist", "Legend.defaults.labels")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("chart.js/dist", "Legend.defaults.labels.boxWidth")
      @js.native
      val boxWidth: Double = js.native
      
      inline def color(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def generateLabels(chart: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLabels")(chart.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      @JSImport("chart.js/dist", "Legend.defaults.labels.padding")
      @js.native
      val padding: Double = js.native
    }
    
    inline def onClick(e: Any, legendItem: Any, legend: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onClick")(e.asInstanceOf[js.Any], legendItem.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("chart.js/dist", "Legend.defaults.onHover")
    @js.native
    val onHover: Any = js.native
    
    @JSImport("chart.js/dist", "Legend.defaults.onLeave")
    @js.native
    val onLeave: Any = js.native
    
    @JSImport("chart.js/dist", "Legend.defaults.position")
    @js.native
    val position: String = js.native
    
    @JSImport("chart.js/dist", "Legend.defaults.reverse")
    @js.native
    val reverse: Boolean = js.native
    
    object title {
      
      @JSImport("chart.js/dist", "Legend.defaults.title")
      @js.native
      val ^ : js.Any = js.native
      
      inline def color1(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color_1")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      @JSImport("chart.js/dist", "Legend.defaults.title.display_1")
      @js.native
      val display1: Boolean = js.native
      
      @JSImport("chart.js/dist", "Legend.defaults.title.position_1")
      @js.native
      val position1: String = js.native
      
      @JSImport("chart.js/dist", "Legend.defaults.title.text")
      @js.native
      val text: String = js.native
    }
    
    @JSImport("chart.js/dist", "Legend.defaults.weight")
    @js.native
    val weight: Double = js.native
  }
  
  object descriptors {
    
    @JSImport("chart.js/dist", "Legend.descriptors")
    @js.native
    val ^ : js.Any = js.native
    
    object labels1 {
      
      @JSImport("chart.js/dist", "Legend.descriptors.labels_1")
      @js.native
      val ^ : js.Any = js.native
      
      inline def scriptable1(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable_1")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    inline def scriptable(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scriptable")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("chart.js/dist", "Legend.id")
  @js.native
  val id: String = js.native
  
  inline def start(chart: Any, _args: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stop(chart: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
