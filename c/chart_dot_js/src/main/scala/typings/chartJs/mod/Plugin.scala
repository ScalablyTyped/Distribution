package typings.chartJs.mod

import typings.chartJs.anon.Cancelable
import typings.chartJs.anon.Changed
import typings.chartJs.anon.Event
import typings.chartJs.anon.Index
import typings.chartJs.anon.IndexMeta
import typings.chartJs.anon.Meta
import typings.chartJs.anon.Mode
import typings.chartJs.anon.Size
import typings.chartJs.anon.`2`
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.typesBasicMod.EmptyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin[TType /* <: ChartType */, O]
  extends StObject
     with ExtendedPlugin[TType, O, TooltipModel[TType]] {
  
  /**
    * @desc Called after scale has build its ticks. This hook is called separately for each scale in the chart.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {Scale} args.scale - The scale.
    * @param {object} options - The plugin options.
    */
  var afterBuildTicks: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ typings.chartJs.anon.Scale, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after scale data limits are calculated. This hook is called separately for each scale in the chart.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {Scale} args.scale - The scale.
    * @param {object} options - The plugin options.
    */
  var afterDataLimits: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ typings.chartJs.anon.Scale, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `chart` datasets at the given `args.index` have been drawn
    * (datasets are drawn in the reverse order). Note that this hook will not be called
    * if the datasets drawing has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {number} args.index - The dataset index.
    * @param {object} args.meta - The dataset metadata.
    * @param {object} options - The plugin options.
    */
  var afterDatasetDraw: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ IndexMeta, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `chart` datasets at the given `args.index` has been updated. Note
    * that this hook will not be called if the datasets update has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {number} args.index - The dataset index.
    * @param {object} args.meta - The dataset metadata.
    * @param {UpdateMode} args.mode - The update mode.
    * @param {object} options - The plugin options.
    */
  var afterDatasetUpdate: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Meta, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `chart` datasets have been drawn. Note that this hook
    * will not be called if the datasets drawing has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var afterDatasetsDraw: js.UndefOr[
    js.Function4[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      `false`, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `chart` datasets have been updated. Note that this hook
    * will not be called if the datasets update has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {UpdateMode} args.mode - The update mode.
    * @param {object} options - The plugin options.
    * @since version 2.1.5
    */
  var afterDatasetsUpdate: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Cancelable, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Called after the chart has been destroyed.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var afterDestroy: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `chart` has been drawn. Note that this hook will not be called
    * if the drawing has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var afterDraw: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `event` has been consumed. Note that this hook
    * will not be called if the `event` has been previously discarded.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {ChartEvent} args.event - The event object.
    * @param {boolean} args.replay - True if this event is replayed from `Chart.update`
    * @param {boolean} args.inChartArea - The event position is inside chartArea
    * @param {boolean} [args.changed] - Set to true if the plugin needs a render. Should only be changed to true, because this args object is passed through all plugins.
    * @param {object} options - The plugin options.
    */
  var afterEvent: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Changed, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after `chart` has been initialized and before the first update.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var afterInit: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `chart` has been laid out. Note that this hook will not
    * be called if the layout update has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var afterLayout: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the `chart` has been fully rendered (and animation completed). Note
    * that this hook will not be called if the rendering has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var afterRender: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after `chart` has been updated and before rendering. Note that this
    * hook will not be called if the chart update has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {UpdateMode} args.mode - The update mode
    * @param {object} options - The plugin options.
    */
  var afterUpdate: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Mode, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before scale builds its ticks. This hook is called separately for each scale in the chart.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {Scale} args.scale - The scale.
    * @param {object} options - The plugin options.
    */
  var beforeBuildTicks: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ typings.chartJs.anon.Scale, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before scale data limits are calculated. This hook is called separately for each scale in the chart.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {Scale} args.scale - The scale.
    * @param {object} options - The plugin options.
    */
  var beforeDataLimits: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ typings.chartJs.anon.Scale, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before drawing the `chart` dataset at the given `args.index` (datasets
    * are drawn in the reverse order). If any plugin returns `false`, the datasets drawing
    * is cancelled until another `render` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {number} args.index - The dataset index.
    * @param {object} args.meta - The dataset metadata.
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart datasets drawing.
    */
  var beforeDatasetDraw: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ IndexMeta, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before updating the `chart` dataset at the given `args.index`. If any plugin
    * returns `false`, the datasets update is cancelled until another `update` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {number} args.index - The dataset index.
    * @param {object} args.meta - The dataset metadata.
    * @param {UpdateMode} args.mode - The update mode.
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart datasets drawing.
    */
  var beforeDatasetUpdate: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Index, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before drawing the `chart` datasets. If any plugin returns `false`,
    * the datasets drawing is cancelled until another `render` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart datasets drawing.
    */
  var beforeDatasetsDraw: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ `2`, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before updating the `chart` datasets. If any plugin returns `false`,
    * the datasets update is cancelled until another `update` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {UpdateMode} args.mode - The update mode.
    * @param {object} options - The plugin options.
    * @returns {boolean} false to cancel the datasets update.
    * @since version 2.1.5
    */
  var beforeDatasetsUpdate: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Mode, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * Called before the chart is being destroyed.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var beforeDestroy: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before drawing `chart` at every animation frame. If any plugin returns `false`,
    * the frame drawing is cancelled untilanother `render` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart drawing.
    */
  var beforeDraw: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ `2`, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called during the update process, before any chart elements have been created.
    * This can be used for data decimation by changing the data array inside a dataset.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var beforeElementsUpdate: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before processing the specified `event`. If any plugin returns `false`,
    * the event will be discarded.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {ChartEvent} args.event - The event object.
    * @param {boolean} args.replay - True if this event is replayed from `Chart.update`
    * @param {boolean} args.inChartArea - The event position is inside chartArea
    * @param {object} options - The plugin options.
    */
  var beforeEvent: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Event, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before initializing `chart`.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    */
  var beforeInit: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before laying out `chart`. If any plugin returns `false`,
    * the layout update is cancelled until another `update` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart layout.
    */
  var beforeLayout: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ `2`, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before rendering `chart`. If any plugin returns `false`,
    * the rendering is cancelled until another `render` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart rendering.
    */
  var beforeRender: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ `2`, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before updating `chart`. If any plugin returns `false`, the update
    * is cancelled (and thus subsequent render(s)) until another `update` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {UpdateMode} args.mode - The update mode
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart update.
    */
  var beforeUpdate: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Cancelable, 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /**
    * Called after the chart has been destroyed.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @deprecated since version 3.7.0 in favour of afterDestroy
    */
  var destroy: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  var id: String
  
  /**
    * @desc Called when plugin is installed for this chart instance. This hook is also invoked for disabled plugins (options === false).
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @since 3.0.0
    */
  var install: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called during chart reset
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @since version 3.0.0
    */
  var reset: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called after the chart as been resized.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {number} args.size - The new canvas display size (eq. canvas.style width & height).
    * @param {object} options - The plugin options.
    */
  var resize: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ Size, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called when a plugin is starting. This happens when chart is created or plugin is enabled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @since 3.0.0
    */
  var start: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called when a plugin stopping. This happens when chart is destroyed or plugin is disabled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @since 3.0.0
    */
  var stop: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Called after chart is destroyed on all plugins that were installed for that chart. This hook is also invoked for disabled plugins (options === false).
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {object} options - The plugin options.
    * @since 3.0.0
    */
  var uninstall: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ EmptyObject, 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
}
object Plugin {
  
  inline def apply[TType /* <: ChartType */, O](id: String): Plugin[TType, O] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin[TType, O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plugin[?, ?], TType /* <: ChartType */, O] (val x: Self & (Plugin[TType, O])) extends AnyVal {
    
    inline def setAfterBuildTicks(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ typings.chartJs.anon.Scale, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction3(value))
    
    inline def setAfterBuildTicksUndefined: Self = StObject.set(x, "afterBuildTicks", js.undefined)
    
    inline def setAfterDataLimits(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ typings.chartJs.anon.Scale, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction3(value))
    
    inline def setAfterDataLimitsUndefined: Self = StObject.set(x, "afterDataLimits", js.undefined)
    
    inline def setAfterDatasetDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ IndexMeta, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterDatasetDraw", js.Any.fromFunction3(value))
    
    inline def setAfterDatasetDrawUndefined: Self = StObject.set(x, "afterDatasetDraw", js.undefined)
    
    inline def setAfterDatasetUpdate(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Meta, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterDatasetUpdate", js.Any.fromFunction3(value))
    
    inline def setAfterDatasetUpdateUndefined: Self = StObject.set(x, "afterDatasetUpdate", js.undefined)
    
    inline def setAfterDatasetsDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O, `false`) => Unit
    ): Self = StObject.set(x, "afterDatasetsDraw", js.Any.fromFunction4(value))
    
    inline def setAfterDatasetsDrawUndefined: Self = StObject.set(x, "afterDatasetsDraw", js.undefined)
    
    inline def setAfterDatasetsUpdate(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Cancelable, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterDatasetsUpdate", js.Any.fromFunction3(value))
    
    inline def setAfterDatasetsUpdateUndefined: Self = StObject.set(x, "afterDatasetsUpdate", js.undefined)
    
    inline def setAfterDestroy(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterDestroy", js.Any.fromFunction3(value))
    
    inline def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
    
    inline def setAfterDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterDraw", js.Any.fromFunction3(value))
    
    inline def setAfterDrawUndefined: Self = StObject.set(x, "afterDraw", js.undefined)
    
    inline def setAfterEvent(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Changed, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterEvent", js.Any.fromFunction3(value))
    
    inline def setAfterEventUndefined: Self = StObject.set(x, "afterEvent", js.undefined)
    
    inline def setAfterInit(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterInit", js.Any.fromFunction3(value))
    
    inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    inline def setAfterLayout(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterLayout", js.Any.fromFunction3(value))
    
    inline def setAfterLayoutUndefined: Self = StObject.set(x, "afterLayout", js.undefined)
    
    inline def setAfterRender(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterRender", js.Any.fromFunction3(value))
    
    inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    inline def setAfterUpdate(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Mode, /* options */ O) => Unit
    ): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction3(value))
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setBeforeBuildTicks(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ typings.chartJs.anon.Scale, /* options */ O) => Unit
    ): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction3(value))
    
    inline def setBeforeBuildTicksUndefined: Self = StObject.set(x, "beforeBuildTicks", js.undefined)
    
    inline def setBeforeDataLimits(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ typings.chartJs.anon.Scale, /* options */ O) => Unit
    ): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction3(value))
    
    inline def setBeforeDataLimitsUndefined: Self = StObject.set(x, "beforeDataLimits", js.undefined)
    
    inline def setBeforeDatasetDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ IndexMeta, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeDatasetDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetDrawUndefined: Self = StObject.set(x, "beforeDatasetDraw", js.undefined)
    
    inline def setBeforeDatasetUpdate(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Index, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeDatasetUpdate", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetUpdateUndefined: Self = StObject.set(x, "beforeDatasetUpdate", js.undefined)
    
    inline def setBeforeDatasetsDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ `2`, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeDatasetsDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetsDrawUndefined: Self = StObject.set(x, "beforeDatasetsDraw", js.undefined)
    
    inline def setBeforeDatasetsUpdate(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Mode, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeDatasetsUpdate", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetsUpdateUndefined: Self = StObject.set(x, "beforeDatasetsUpdate", js.undefined)
    
    inline def setBeforeDestroy(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction3(value))
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ `2`, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDrawUndefined: Self = StObject.set(x, "beforeDraw", js.undefined)
    
    inline def setBeforeElementsUpdate(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "beforeElementsUpdate", js.Any.fromFunction3(value))
    
    inline def setBeforeElementsUpdateUndefined: Self = StObject.set(x, "beforeElementsUpdate", js.undefined)
    
    inline def setBeforeEvent(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Event, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeEvent", js.Any.fromFunction3(value))
    
    inline def setBeforeEventUndefined: Self = StObject.set(x, "beforeEvent", js.undefined)
    
    inline def setBeforeInit(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "beforeInit", js.Any.fromFunction3(value))
    
    inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    inline def setBeforeLayout(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ `2`, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeLayout", js.Any.fromFunction3(value))
    
    inline def setBeforeLayoutUndefined: Self = StObject.set(x, "beforeLayout", js.undefined)
    
    inline def setBeforeRender(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ `2`, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeRender", js.Any.fromFunction3(value))
    
    inline def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
    
    inline def setBeforeUpdate(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Cancelable, /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction3(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setDestroy(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstall(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "install", js.Any.fromFunction3(value))
    
    inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
    
    inline def setReset(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "reset", js.Any.fromFunction3(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setResize(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ Size, /* options */ O) => Unit
    ): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setStart(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "stop", js.Any.fromFunction3(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setUninstall(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ EmptyObject, /* options */ O) => Unit
    ): Self = StObject.set(x, "uninstall", js.Any.fromFunction3(value))
    
    inline def setUninstallUndefined: Self = StObject.set(x, "uninstall", js.undefined)
  }
}
