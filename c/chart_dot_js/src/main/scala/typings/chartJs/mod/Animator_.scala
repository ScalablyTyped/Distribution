package typings.chartJs.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef { import("./core.animation").default } Animation
  * @typedef { import("./core.controller").default } Chart
  */
/**
  * Please use the module's default export which provides a singleton instance
  * Note: class is export for typedoc
  */
trait Animator_ extends StObject {
  
  var _charts: Map[Any, Any]
  
  /**
    * @private
    */
  /* private */ var _getAnims: Any
  
  var _lastDate: Double
  
  /**
    * @private
    */
  /* private */ var _notify: Any
  
  /**
    * @private
    */
  /* private */ var _refresh: Any
  
  var _request: Any
  
  var _running: Boolean
  
  /**
    * @private
    */
  /* private */ var _update: Any
  
  /**
    * Add animations
    * @param {Chart} chart
    * @param {Animation[]} items - animations
    */
  def add(chart: Chart2, items: js.Array[Animation]): scala.Unit
  
  /**
    * Counts number of active animations for the chart
    * @param {Chart} chart
    */
  def has(chart: Chart2): Boolean
  
  /**
    * @param {Chart} chart
    * @param {string} event - event name
    * @param {Function} cb - callback
    */
  def listen(chart: Chart2, event: String, cb: js.Function): scala.Unit
  
  /**
    * Remove chart from Animator
    * @param {Chart} chart
    */
  def remove(chart: Chart2): Boolean
  
  def running(chart: Any): Boolean
  
  /**
    * Start animating (all charts)
    * @param {Chart} chart
    */
  def start(chart: Chart2): scala.Unit
  
  /**
    * Stop all animations for the chart
    * @param {Chart} chart
    */
  def stop(chart: Chart2): scala.Unit
}
object Animator_ {
  
  inline def apply(
    _charts: Map[Any, Any],
    _getAnims: Any,
    _lastDate: Double,
    _notify: Any,
    _refresh: Any,
    _request: Any,
    _running: Boolean,
    _update: Any,
    add: (Chart2, js.Array[Animation]) => scala.Unit,
    has: Chart2 => Boolean,
    listen: (Chart2, String, js.Function) => scala.Unit,
    remove: Chart2 => Boolean,
    running: Any => Boolean,
    start: Chart2 => scala.Unit,
    stop: Chart2 => scala.Unit
  ): Animator_ = {
    val __obj = js.Dynamic.literal(_charts = _charts.asInstanceOf[js.Any], _getAnims = _getAnims.asInstanceOf[js.Any], _lastDate = _lastDate.asInstanceOf[js.Any], _notify = _notify.asInstanceOf[js.Any], _refresh = _refresh.asInstanceOf[js.Any], _request = _request.asInstanceOf[js.Any], _running = _running.asInstanceOf[js.Any], _update = _update.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), has = js.Any.fromFunction1(has), listen = js.Any.fromFunction3(listen), remove = js.Any.fromFunction1(remove), running = js.Any.fromFunction1(running), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[Animator_]
  }
  
  extension [Self <: Animator_](x: Self) {
    
    inline def setAdd(value: (Chart2, js.Array[Animation]) => scala.Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setHas(value: Chart2 => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setListen(value: (Chart2, String, js.Function) => scala.Unit): Self = StObject.set(x, "listen", js.Any.fromFunction3(value))
    
    inline def setRemove(value: Chart2 => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRunning(value: Any => Boolean): Self = StObject.set(x, "running", js.Any.fromFunction1(value))
    
    inline def setStart(value: Chart2 => scala.Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: Chart2 => scala.Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def set_charts(value: Map[Any, Any]): Self = StObject.set(x, "_charts", value.asInstanceOf[js.Any])
    
    inline def set_getAnims(value: Any): Self = StObject.set(x, "_getAnims", value.asInstanceOf[js.Any])
    
    inline def set_lastDate(value: Double): Self = StObject.set(x, "_lastDate", value.asInstanceOf[js.Any])
    
    inline def set_notify(value: Any): Self = StObject.set(x, "_notify", value.asInstanceOf[js.Any])
    
    inline def set_refresh(value: Any): Self = StObject.set(x, "_refresh", value.asInstanceOf[js.Any])
    
    inline def set_request(value: Any): Self = StObject.set(x, "_request", value.asInstanceOf[js.Any])
    
    inline def set_running(value: Boolean): Self = StObject.set(x, "_running", value.asInstanceOf[js.Any])
    
    inline def set_update(value: Any): Self = StObject.set(x, "_update", value.asInstanceOf[js.Any])
  }
}
