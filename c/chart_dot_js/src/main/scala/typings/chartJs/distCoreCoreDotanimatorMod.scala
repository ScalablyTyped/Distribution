package typings.chartJs

import org.scalablytyped.runtime.Shortcut
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotanimatorMod extends Shortcut {
  
  @JSImport("chart.js/dist/core/core.animator", JSImport.Default)
  @js.native
  val default: Animator = js.native
  
  @JSImport("chart.js/dist/core/core.animator", "Animator")
  @js.native
  open class Animator () extends StObject {
    
    var _charts: Map[Any, Any] = js.native
    
    /**
      * @private
      */
    /* private */ var _getAnims: Any = js.native
    
    var _lastDate: Double = js.native
    
    /**
      * @private
      */
    /* private */ var _notify: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _refresh: Any = js.native
    
    var _request: Any = js.native
    
    var _running: Boolean = js.native
    
    /**
      * @private
      */
    /* private */ var _update: Any = js.native
    
    /**
      * Add animations
      * @param {Chart} chart
      * @param {Animation[]} items - animations
      */
    def add(chart: Chart, items: js.Array[Animation]): Unit = js.native
    
    /**
      * Counts number of active animations for the chart
      * @param {Chart} chart
      */
    def has(chart: Chart): Boolean = js.native
    
    /**
      * @param {Chart} chart
      * @param {string} event - event name
      * @param {Function} cb - callback
      */
    def listen(chart: Chart, event: String, cb: js.Function): Unit = js.native
    
    /**
      * Remove chart from Animator
      * @param {Chart} chart
      */
    def remove(chart: Chart): Boolean = js.native
    
    def running(chart: Any): Boolean = js.native
    
    /**
      * Start animating (all charts)
      * @param {Chart} chart
      */
    def start(chart: Chart): Unit = js.native
    
    /**
      * Stop all animations for the chart
      * @param {Chart} chart
      */
    def stop(chart: Chart): Unit = js.native
  }
  
  type Animation = typings.chartJs.distCoreCoreDotanimationMod.default
  
  type Chart = typings.chartJs.distCoreCoreDotcontrollerMod.default
  
  type _To = Animator
  
  /* This means you don't have to write `default`, but can instead just say `distCoreCoreDotanimatorMod.foo` */
  override def _to: Animator = default
}
