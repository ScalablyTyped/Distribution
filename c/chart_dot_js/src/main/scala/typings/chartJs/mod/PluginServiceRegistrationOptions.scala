package typings.chartJs.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginServiceRegistrationOptions extends StObject {
  
  var afterDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var afterDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var afterDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var afterEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var afterInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** Deprecated since version 2.5.0. Use `afterLayout` instead. */
  var afterScaleUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  // Called after drawing the `tooltip`. Note that this hook will not,
  // be called if the tooltip drawing has been previously cancelled.
  var afterTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var afterUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var beforeDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  // Before the datasets are drawn but after scales are drawn
  var beforeDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var beforeDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  // Easing is for animation
  var beforeDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  // Called when an event occurs on the chart
  var beforeEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var beforeInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  // This is called at the start of a render. It is only called once, even if the animation will run for a number of frames. Use beforeDraw or afterDraw
  // to do something on each animation frame
  var beforeRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  // Called before drawing the `tooltip`. If any plugin returns `false`,
  // the tooltip drawing is cancelled until another `render` is triggered.
  var beforeTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var beforeUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var destroy: js.UndefOr[js.Function1[/* chartInstance */ Chart, Unit]] = js.undefined
  
  var resize: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* newChartSize */ ChartSize, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}
object PluginServiceRegistrationOptions {
  
  inline def apply(): PluginServiceRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginServiceRegistrationOptions]
  }
  
  extension [Self <: PluginServiceRegistrationOptions](x: Self) {
    
    inline def setAfterDatasetDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterDatasetDraw", js.Any.fromFunction3(value))
    
    inline def setAfterDatasetDrawUndefined: Self = StObject.set(x, "afterDatasetDraw", js.undefined)
    
    inline def setAfterDatasetUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterDatasetUpdate", js.Any.fromFunction2(value))
    
    inline def setAfterDatasetUpdateUndefined: Self = StObject.set(x, "afterDatasetUpdate", js.undefined)
    
    inline def setAfterDatasetsDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterDatasetsDraw", js.Any.fromFunction3(value))
    
    inline def setAfterDatasetsDrawUndefined: Self = StObject.set(x, "afterDatasetsDraw", js.undefined)
    
    inline def setAfterDatasetsUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterDatasetsUpdate", js.Any.fromFunction2(value))
    
    inline def setAfterDatasetsUpdateUndefined: Self = StObject.set(x, "afterDatasetsUpdate", js.undefined)
    
    inline def setAfterDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterDraw", js.Any.fromFunction3(value))
    
    inline def setAfterDrawUndefined: Self = StObject.set(x, "afterDraw", js.undefined)
    
    inline def setAfterEvent(value: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterEvent", js.Any.fromFunction3(value))
    
    inline def setAfterEventUndefined: Self = StObject.set(x, "afterEvent", js.undefined)
    
    inline def setAfterInit(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction2(value))
    
    inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    inline def setAfterLayout(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterLayout", js.Any.fromFunction2(value))
    
    inline def setAfterLayoutUndefined: Self = StObject.set(x, "afterLayout", js.undefined)
    
    inline def setAfterRender(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    inline def setAfterScaleUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterScaleUpdate", js.Any.fromFunction2(value))
    
    inline def setAfterScaleUpdateUndefined: Self = StObject.set(x, "afterScaleUpdate", js.undefined)
    
    inline def setAfterTooltipDraw(
      value: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterTooltipDraw", js.Any.fromFunction3(value))
    
    inline def setAfterTooltipDrawUndefined: Self = StObject.set(x, "afterTooltipDraw", js.undefined)
    
    inline def setAfterUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction2(value))
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setBeforeDatasetDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeDatasetDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetDrawUndefined: Self = StObject.set(x, "beforeDatasetDraw", js.undefined)
    
    inline def setBeforeDatasetUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeDatasetUpdate", js.Any.fromFunction2(value))
    
    inline def setBeforeDatasetUpdateUndefined: Self = StObject.set(x, "beforeDatasetUpdate", js.undefined)
    
    inline def setBeforeDatasetsDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeDatasetsDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetsDrawUndefined: Self = StObject.set(x, "beforeDatasetsDraw", js.undefined)
    
    inline def setBeforeDatasetsUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeDatasetsUpdate", js.Any.fromFunction2(value))
    
    inline def setBeforeDatasetsUpdateUndefined: Self = StObject.set(x, "beforeDatasetsUpdate", js.undefined)
    
    inline def setBeforeDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDrawUndefined: Self = StObject.set(x, "beforeDraw", js.undefined)
    
    inline def setBeforeEvent(value: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeEvent", js.Any.fromFunction3(value))
    
    inline def setBeforeEventUndefined: Self = StObject.set(x, "beforeEvent", js.undefined)
    
    inline def setBeforeInit(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeInit", js.Any.fromFunction2(value))
    
    inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    inline def setBeforeLayout(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeLayout", js.Any.fromFunction2(value))
    
    inline def setBeforeLayoutUndefined: Self = StObject.set(x, "beforeLayout", js.undefined)
    
    inline def setBeforeRender(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeRender", js.Any.fromFunction2(value))
    
    inline def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
    
    inline def setBeforeTooltipDraw(
      value: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeTooltipDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeTooltipDrawUndefined: Self = StObject.set(x, "beforeTooltipDraw", js.undefined)
    
    inline def setBeforeUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction2(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setDestroy(value: /* chartInstance */ Chart => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setResize(
      value: (/* chartInstance */ Chart, /* newChartSize */ ChartSize, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
