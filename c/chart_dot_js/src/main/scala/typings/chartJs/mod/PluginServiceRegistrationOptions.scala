package typings.chartJs.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginServiceRegistrationOptions extends js.Object {
  
  var afterDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var afterDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var afterDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var afterEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var afterInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** Deprecated since version 2.5.0. Use `afterLayout` instead. */
  var afterScaleUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  // Called after drawing the `tooltip`. Note that this hook will not,
  // be called if the tooltip drawing has been previously cancelled.
  var afterTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var afterUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeDatasetDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var beforeDatasetUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  // Before the datasets are drawn but after scales are drawn
  var beforeDatasetsDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var beforeDatasetsUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  // Easing is for animation
  var beforeDraw: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  // Called when an event occurs on the chart
  var beforeEvent: js.UndefOr[
    js.Function3[/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var beforeInit: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeLayout: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  // This is called at the start of a render. It is only called once, even if the animation will run for a number of frames. Use beforeDraw or afterDraw
  // to do something on each animation frame
  var beforeRender: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  // Called before drawing the `tooltip`. If any plugin returns `false`,
  // the tooltip drawing is cancelled until another `render` is triggered.
  var beforeTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var beforeUpdate: js.UndefOr[js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  var destroy: js.UndefOr[js.Function1[/* chartInstance */ Chart, Unit]] = js.native
  
  var resize: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
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
  implicit class PluginServiceRegistrationOptionsOps[Self <: PluginServiceRegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterDatasetDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterDatasetDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterDatasetDraw: Self = this.set("afterDatasetDraw", js.undefined)
    
    @scala.inline
    def setAfterDatasetUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterDatasetUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterDatasetUpdate: Self = this.set("afterDatasetUpdate", js.undefined)
    
    @scala.inline
    def setAfterDatasetsDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterDatasetsDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterDatasetsDraw: Self = this.set("afterDatasetsDraw", js.undefined)
    
    @scala.inline
    def setAfterDatasetsUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterDatasetsUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterDatasetsUpdate: Self = this.set("afterDatasetsUpdate", js.undefined)
    
    @scala.inline
    def setAfterDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterDraw: Self = this.set("afterDraw", js.undefined)
    
    @scala.inline
    def setAfterEvent(value: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterEvent: Self = this.set("afterEvent", js.undefined)
    
    @scala.inline
    def setAfterInit(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    
    @scala.inline
    def setAfterLayout(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterLayout: Self = this.set("afterLayout", js.undefined)
    
    @scala.inline
    def setAfterRender(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    
    @scala.inline
    def setAfterScaleUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterScaleUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterScaleUpdate: Self = this.set("afterScaleUpdate", js.undefined)
    
    @scala.inline
    def setAfterTooltipDraw(
      value: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("afterTooltipDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterTooltipDraw: Self = this.set("afterTooltipDraw", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    
    @scala.inline
    def setBeforeDatasetDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeDatasetDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeDatasetDraw: Self = this.set("beforeDatasetDraw", js.undefined)
    
    @scala.inline
    def setBeforeDatasetUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeDatasetUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeDatasetUpdate: Self = this.set("beforeDatasetUpdate", js.undefined)
    
    @scala.inline
    def setBeforeDatasetsDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeDatasetsDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeDatasetsDraw: Self = this.set("beforeDatasetsDraw", js.undefined)
    
    @scala.inline
    def setBeforeDatasetsUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeDatasetsUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeDatasetsUpdate: Self = this.set("beforeDatasetsUpdate", js.undefined)
    
    @scala.inline
    def setBeforeDraw(value: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeDraw: Self = this.set("beforeDraw", js.undefined)
    
    @scala.inline
    def setBeforeEvent(value: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeEvent: Self = this.set("beforeEvent", js.undefined)
    
    @scala.inline
    def setBeforeInit(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    
    @scala.inline
    def setBeforeLayout(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeLayout: Self = this.set("beforeLayout", js.undefined)
    
    @scala.inline
    def setBeforeRender(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeRender: Self = this.set("beforeRender", js.undefined)
    
    @scala.inline
    def setBeforeTooltipDraw(
      value: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("beforeTooltipDraw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeTooltipDraw: Self = this.set("beforeTooltipDraw", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("beforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* chartInstance */ Chart => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setResize(
      value: (/* chartInstance */ Chart, /* newChartSize */ ChartSize, /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("resize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
  }
}
