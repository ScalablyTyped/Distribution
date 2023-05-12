package typings.chartJs

import typings.chartJs.anon.Attach
import typings.chartJs.anon.Height
import typings.chartJs.anon.Type
import typings.chartJs.distCoreCoreDotdefaultsMod.Defaults
import typings.chartJs.distCoreCoreDotpluginsMod.filterCallback
import typings.chartJs.distCoreCoreDotregistryMod.Registry
import typings.chartJs.distTypesIndexMod.ActiveElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotcontrollerMod {
  
  @JSImport("chart.js/dist/core/core.controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Chart {
    def this(item: Any, userConfig: Any) = this()
  }
  object default {
    
    @JSImport("chart.js/dist/core/core.controller", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("chart.js/dist/core/core.controller", "default.defaults")
    @js.native
    def defaults: Defaults = js.native
    inline def defaults_=(x: Defaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("chart.js/dist/core/core.controller", "default.getChart")
    @js.native
    def getChart: js.Function1[/* key */ Any, Any] = js.native
    inline def getChart_=(x: js.Function1[/* key */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getChart")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("chart.js/dist/core/core.controller", "default.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def register(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("chart.js/dist/core/core.controller", "default.registry")
    @js.native
    def registry: Registry = js.native
    inline def registry_=(x: Registry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registry")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def unregister(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("chart.js/dist/core/core.controller", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Chart extends StObject {
    
    @JSName("$context")
    var $context: Type = js.native
    
    var _active: js.Array[Any] = js.native
    
    var _animationsDisabled: Boolean = js.native
    
    var _aspectRatio: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _checkEventBindings: Any = js.native
    
    var _dataChanges: js.Array[Any] = js.native
    
    /**
      * @private
      */
    /* private */ var _destroyDatasetMeta: Any = js.native
    
    def _doResize(): Double = js.native
    def _doResize(mode: Any): Double = js.native
    
    /**
      * Draws dataset at index unless a plugin returns `false` to the `beforeDatasetDraw`
      * hook, in which case, plugins will not be called on `afterDatasetDraw`.
      * @private
      */
    /* private */ var _drawDataset: Any = js.native
    
    /**
      * Draws all datasets unless a plugin returns `false` to the `beforeDatasetsDraw`
      * hook, in which case, plugins will not be called on `afterDatasetsDraw`.
      * @private
      */
    /* private */ var _drawDatasets: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _eventHandler: Any = js.native
    
    /**
      * @param {ChartEvent} e - The event
      * @param {import('../types/index.js').ActiveElement[]} lastActive - Previously active elements
      * @param {boolean} inChartArea - Is the envent inside chartArea
      * @param {boolean} useFinalPosition - Should the evaluation be done with current or final (after animation) element positions
      * @returns {import('../types/index.js').ActiveElement[]} - The active elements
      * @pravate
      */
    def _getActiveElements(
      e: ChartEvent,
      lastActive: js.Array[ActiveElement],
      inChartArea: Boolean,
      useFinalPosition: Boolean
    ): js.Array[ActiveElement] = js.native
    
    /**
      * @private
      */
    /* private */ var _getSortedDatasetMetas: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _getUniformDataChanges: Any = js.native
    
    /**
      * Handle an event
      * @param {ChartEvent} e the event to handle
      * @param {boolean} [replay] - true if the event was replayed by `update`
      * @param {boolean} [inChartArea] - true if the event is inside chartArea
      * @return {boolean} true if the chart needs to re-render
      * @private
      */
    /* private */ var _handleEvent: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _initialize: Any = js.native
    
    var _lastEvent: typings.chartJs.distTypesIndexMod.ChartEvent = js.native
    
    var _layers: js.Array[Any] = js.native
    
    var _metasets: js.Array[Any] = js.native
    
    var _minPadding: Double = js.native
    
    var _options: Any = js.native
    
    var _plugins: typings.chartJs.distCoreCoreDotpluginsMod.default = js.native
    
    /**
      * @private
      */
    /* private */ var _removeUnreferencedMetasets: Any = js.native
    
    /**
      * Reset the elements of all datasets
      * @private
      */
    /* private */ var _resetElements: Any = js.native
    
    def _resize(width: Any, height: Any): Unit = js.native
    
    var _resizeBeforeDraw: Height = js.native
    
    /** @type {?{attach?: function, detach?: function, resize?: function}} */
    var _responsiveListeners: Attach = js.native
    
    var _sortedMetasets: js.Array[Any] = js.native
    
    var _stacks: Any = js.native
    
    def _stop(): Unit = js.native
    
    /**
      * Updates dataset at index unless a plugin returns `false` to the `beforeDatasetUpdate`
      * hook, in which case, plugins will not be called on `afterDatasetUpdate`.
      * @private
      */
    /* private */ var _updateDataset: Any = js.native
    
    /**
      * Updates all datasets unless a plugin returns `false` to the `beforeDatasetsUpdate`
      * hook, in which case, plugins will not be called on `afterDatasetsUpdate`.
      * @private
      */
    /* private */ var _updateDatasets: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _updateHiddenIndices: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _updateHoverStyles: Any = js.native
    
    /**
      * Updates the chart layout unless a plugin returns `false` to the `beforeLayout`
      * hook, in which case, plugins will not be called on `afterLayout`.
      * @private
      */
    /* private */ var _updateLayout: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _updateMetasets: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _updateScales: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _updateVisibility: Any = js.native
    
    def aspectRatio: Any = js.native
    
    var attached: Boolean = js.native
    
    /**
      * @private
      */
    /* private */ var bindEvents: Any = js.native
    
    /**
      * @private
      */
    /* private */ var bindResponsiveEvents: Any = js.native
    
    /**
      * @private
      */
    /* private */ var bindUserEvents: Any = js.native
    
    var boxes: js.Array[Any] = js.native
    
    def buildOrUpdateControllers(): js.Array[Any] = js.native
    
    /**
      * Builds a map of scale ID to scale object for future lookup.
      */
    def buildOrUpdateScales(): Unit = js.native
    
    var canvas: Any = js.native
    
    var chartArea: Any = js.native
    
    def clear(): Chart = js.native
    
    var config: typings.chartJs.distCoreCoreDotconfigMod.default = js.native
    
    var ctx: Any = js.native
    
    var currentDevicePixelRatio: Any = js.native
    
    def data: Any = js.native
    def data_=(arg: Any): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def draw(): Unit = js.native
    
    def ensureScalesHaveIDs(): Unit = js.native
    
    /**
      * Get active (hovered) elements
      * @returns array
      */
    def getActiveElements(): js.Array[Any] = js.native
    
    def getContext(): Type = js.native
    
    def getDataVisibility(index: Any): Boolean = js.native
    
    def getDatasetMeta(datasetIndex: Any): Any = js.native
    
    def getElementsAtEventForMode(e: Any, mode: Any, options: Any, useFinalPosition: Any): Any = js.native
    
    /**
      * Gets the visible dataset metas in drawing order
      * @return {object[]}
      */
    def getSortedVisibleDatasetMetas(): js.Array[js.Object] = js.native
    
    def getVisibleDatasetCount(): Double = js.native
    
    var height: Any = js.native
    
    def hide(datasetIndex: Any, dataIndex: Any): Unit = js.native
    
    var id: Double = js.native
    
    def isDatasetVisible(datasetIndex: Any): Boolean = js.native
    
    /**
      * Check if a plugin with the specific ID is registered and enabled
      * @param {string} pluginId - The ID of the plugin of which to check if it is enabled
      * @returns {boolean}
      */
    def isPluginEnabled(pluginId: String): Boolean = js.native
    
    /**
      * Checks whether the given point is in the chart area.
      * @param {Point} point - in relative coordinates (see, e.g., getRelativePosition)
      * @returns {boolean}
      */
    def isPointInArea(point: Point): Boolean = js.native
    
    /**
      * Calls enabled plugins on the specified hook and with the given args.
      * This method immediately returns as soon as a plugin explicitly returns false. The
      * returned value can be used, for instance, to interrupt the current action.
      * @param {string} hook - The name of the plugin method to call (e.g. 'beforeUpdate').
      * @param {Object} [args] - Extra arguments to apply to the hook call.
      * @param {import('./core.plugins.js').filterCallback} [filter] - Filtering function for limiting which plugins are notified
      * @returns {boolean} false if any of the plugins return false, else returns true.
      */
    def notifyPlugins(hook: String): Boolean = js.native
    def notifyPlugins(hook: String, args: Any): Boolean = js.native
    def notifyPlugins(hook: String, args: Any, filter: filterCallback): Boolean = js.native
    def notifyPlugins(hook: String, args: Unit, filter: filterCallback): Boolean = js.native
    
    def options: Any = js.native
    def options_=(arg: Any): Unit = js.native
    
    var platform: Any = js.native
    
    def registry: Registry = js.native
    
    def render(): Unit = js.native
    
    /**
      * Resets the chart back to its state before the initial animation
      */
    def reset(): Unit = js.native
    
    /**
      * Resize the chart to its container or to explicit dimensions.
      * @param {number} [width]
      * @param {number} [height]
      */
    def resize(): Unit = js.native
    def resize(width: Double): Unit = js.native
    def resize(width: Double, height: Double): Unit = js.native
    def resize(width: Unit, height: Double): Unit = js.native
    
    /**
      * Set active (hovered) elements
      * @param {array} activeElements New active data points
      */
    def setActiveElements(activeElements: js.Array[Any]): Unit = js.native
    
    def setDatasetVisibility(datasetIndex: Any, visible: Any): Unit = js.native
    
    def show(datasetIndex: Any, dataIndex: Any): Unit = js.native
    
    def stop(): Chart = js.native
    
    def toBase64Image(args: Any*): Any = js.native
    
    def toggleDataVisibility(index: Any): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var unbindEvents: Any = js.native
    
    def update(mode: Any): Unit = js.native
    
    def updateHoverStyle(items: Any, mode: Any, enabled: Any): Unit = js.native
    
    var width: Any = js.native
  }
  
  type ChartEvent = typings.chartJs.distTypesIndexMod.ChartEvent
  
  type Point = typings.chartJs.distTypesGeometricMod.Point
}
