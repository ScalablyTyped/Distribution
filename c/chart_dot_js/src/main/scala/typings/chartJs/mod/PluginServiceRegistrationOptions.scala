package typings.chartJs.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginServiceRegistrationOptions extends StObject {
  
  var afterDatasetDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* easing */ Easing, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterDatasetUpdate: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterDatasetsDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* easing */ Easing, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterDatasetsUpdate: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* easing */ Easing, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterEvent: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* event */ Event, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterInit: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterLayout: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterRender: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** Deprecated since version 2.5.0. Use `afterLayout` instead. */
  var afterScaleUpdate: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  // Called after drawing the `tooltip`. Note that this hook will not,
  // be called if the tooltip drawing has been previously cancelled.
  var afterTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterUpdate: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var beforeDatasetDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* easing */ Easing, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var beforeDatasetUpdate: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  // Before the datasets are drawn but after scales are drawn
  var beforeDatasetsDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* easing */ Easing, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var beforeDatasetsUpdate: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  // Easing is for animation
  var beforeDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* easing */ Easing, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  // Called when an event occurs on the chart
  var beforeEvent: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* event */ Event, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var beforeInit: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var beforeLayout: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  // This is called at the start of a render. It is only called once, even if the animation will run for a number of frames. Use beforeDraw or afterDraw
  // to do something on each animation frame
  var beforeRender: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  // Called before drawing the `tooltip`. If any plugin returns `false`,
  // the tooltip drawing is cancelled until another `render` is triggered.
  var beforeTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var beforeUpdate: js.UndefOr[
    js.Function2[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var destroy: js.UndefOr[js.Function1[/* chartInstance */ typings.chartJs.mod.Chart, Unit]] = js.native
  
  var resize: js.UndefOr[
    js.Function3[
      /* chartInstance */ typings.chartJs.mod.Chart, 
      /* newChartSize */ ChartSize, 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object PluginServiceRegistrationOptions {
  
  @scala.inline
  def apply(): PluginServiceRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginServiceRegistrationOptions]
  }
  
  @scala.inline
  implicit class PluginServiceRegistrationOptionsMutableBuilder[Self <: PluginServiceRegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterDatasetDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterDatasetDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDatasetDrawUndefined: Self = StObject.set(x, "afterDatasetDraw", js.undefined)
    
    @scala.inline
    def setAfterDatasetUpdate(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterDatasetUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterDatasetUpdateUndefined: Self = StObject.set(x, "afterDatasetUpdate", js.undefined)
    
    @scala.inline
    def setAfterDatasetsDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterDatasetsDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDatasetsDrawUndefined: Self = StObject.set(x, "afterDatasetsDraw", js.undefined)
    
    @scala.inline
    def setAfterDatasetsUpdate(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterDatasetsUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterDatasetsUpdateUndefined: Self = StObject.set(x, "afterDatasetsUpdate", js.undefined)
    
    @scala.inline
    def setAfterDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDrawUndefined: Self = StObject.set(x, "afterDraw", js.undefined)
    
    @scala.inline
    def setAfterEvent(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterEventUndefined: Self = StObject.set(x, "afterEvent", js.undefined)
    
    @scala.inline
    def setAfterInit(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    @scala.inline
    def setAfterLayout(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterLayoutUndefined: Self = StObject.set(x, "afterLayout", js.undefined)
    
    @scala.inline
    def setAfterRender(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setAfterScaleUpdate(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterScaleUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterScaleUpdateUndefined: Self = StObject.set(x, "afterScaleUpdate", js.undefined)
    
    @scala.inline
    def setAfterTooltipDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterTooltipDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterTooltipDrawUndefined: Self = StObject.set(x, "afterTooltipDraw", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setBeforeDatasetDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeDatasetDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDatasetDrawUndefined: Self = StObject.set(x, "beforeDatasetDraw", js.undefined)
    
    @scala.inline
    def setBeforeDatasetUpdate(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeDatasetUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeDatasetUpdateUndefined: Self = StObject.set(x, "beforeDatasetUpdate", js.undefined)
    
    @scala.inline
    def setBeforeDatasetsDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeDatasetsDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDatasetsDrawUndefined: Self = StObject.set(x, "beforeDatasetsDraw", js.undefined)
    
    @scala.inline
    def setBeforeDatasetsUpdate(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeDatasetsUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeDatasetsUpdateUndefined: Self = StObject.set(x, "beforeDatasetsUpdate", js.undefined)
    
    @scala.inline
    def setBeforeDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDrawUndefined: Self = StObject.set(x, "beforeDraw", js.undefined)
    
    @scala.inline
    def setBeforeEvent(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeEventUndefined: Self = StObject.set(x, "beforeEvent", js.undefined)
    
    @scala.inline
    def setBeforeInit(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    @scala.inline
    def setBeforeLayout(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeLayoutUndefined: Self = StObject.set(x, "beforeLayout", js.undefined)
    
    @scala.inline
    def setBeforeRender(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
    
    @scala.inline
    def setBeforeTooltipDraw(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeTooltipDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeTooltipDrawUndefined: Self = StObject.set(x, "beforeTooltipDraw", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: (/* chartInstance */ typings.chartJs.mod.Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* chartInstance */ typings.chartJs.mod.Chart => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setResize(
      value: (/* chartInstance */ typings.chartJs.mod.Chart, /* newChartSize */ ChartSize, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
