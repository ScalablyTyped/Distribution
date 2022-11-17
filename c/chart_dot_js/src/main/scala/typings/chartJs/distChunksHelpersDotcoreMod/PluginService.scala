package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef { import("./core.controller").default } Chart
  * @typedef { import("../../types").ChartEvent } ChartEvent
  * @typedef { import("../plugins/plugin.tooltip").default } Tooltip
  */
/**
  * @callback filterCallback
  * @param {{plugin: object, options: object}} value
  * @param {number} [index]
  * @param {array} [array]
  * @param {object} [thisArg]
  * @return {boolean}
  */
@js.native
trait PluginService extends StObject {
  
  var _cache: js.Array[typings.chartJs.anon.Plugin] = js.native
  
  def _createDescriptors(chart: Any, all: Any): js.Array[typings.chartJs.anon.Plugin] = js.native
  
  /**
    * @param {Chart} chart
    * @private
    */
  /* private */ var _descriptors: Any = js.native
  
  var _init: js.Array[Any] = js.native
  
  /**
    * @private
    */
  /* private */ var _notify: Any = js.native
  
  /**
    * @param {Chart} chart
    * @private
    */
  /* private */ var _notifyStateChanges: Any = js.native
  
  var _oldCache: js.Array[typings.chartJs.anon.Plugin] = js.native
  
  def invalidate(): Unit = js.native
  
  /**
    * Calls enabled plugins for `chart` on the specified hook and with the given args.
    * This method immediately returns as soon as a plugin explicitly returns false. The
    * returned value can be used, for instance, to interrupt the current action.
    * @param {Chart} chart - The chart instance for which plugins should be called.
    * @param {string} hook - The name of the plugin method to call (e.g. 'beforeUpdate').
    * @param {object} [args] - Extra arguments to apply to the hook call.
    * @param {filterCallback} [filter] - Filtering function for limiting which plugins are notified
    * @returns {boolean} false if any of the plugins return false, else returns true.
    */
  def notify(chart: Chart3, hook: String): Boolean = js.native
  def notify(chart: Chart3, hook: String, args: js.Object): Boolean = js.native
  def notify(chart: Chart3, hook: String, args: js.Object, filter: filterCallback): Boolean = js.native
  def notify(chart: Chart3, hook: String, args: Unit, filter: filterCallback): Boolean = js.native
}
