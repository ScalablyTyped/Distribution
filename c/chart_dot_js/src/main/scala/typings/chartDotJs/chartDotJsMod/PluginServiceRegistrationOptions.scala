package typings.chartDotJs.chartDotJsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceRegistrationOptions extends js.Object {
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
  /** @deprecated since version 2.5.0. Use `afterLayout` instead. */
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
  @scala.inline
  def apply(
    afterDatasetDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterDatasetUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterDatasetsDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterDatasetsUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterEvent: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterInit: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterLayout: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterRender: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterScaleUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterTooltipDraw: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeDatasetDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeDatasetUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeDatasetsDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeDatasetsUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeDraw: (/* chartInstance */ Chart, /* easing */ Easing, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeEvent: (/* chartInstance */ Chart, /* event */ Event, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeInit: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeLayout: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeRender: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeTooltipDraw: (/* chartInstance */ Chart, /* tooltipData */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    beforeUpdate: (/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any]) => Unit = null,
    destroy: /* chartInstance */ Chart => Unit = null,
    resize: (/* chartInstance */ Chart, /* newChartSize */ ChartSize, /* options */ js.UndefOr[js.Any]) => Unit = null
  ): PluginServiceRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (afterDatasetDraw != null) __obj.updateDynamic("afterDatasetDraw")(js.Any.fromFunction3(afterDatasetDraw))
    if (afterDatasetUpdate != null) __obj.updateDynamic("afterDatasetUpdate")(js.Any.fromFunction2(afterDatasetUpdate))
    if (afterDatasetsDraw != null) __obj.updateDynamic("afterDatasetsDraw")(js.Any.fromFunction3(afterDatasetsDraw))
    if (afterDatasetsUpdate != null) __obj.updateDynamic("afterDatasetsUpdate")(js.Any.fromFunction2(afterDatasetsUpdate))
    if (afterDraw != null) __obj.updateDynamic("afterDraw")(js.Any.fromFunction3(afterDraw))
    if (afterEvent != null) __obj.updateDynamic("afterEvent")(js.Any.fromFunction3(afterEvent))
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction2(afterInit))
    if (afterLayout != null) __obj.updateDynamic("afterLayout")(js.Any.fromFunction2(afterLayout))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction2(afterRender))
    if (afterScaleUpdate != null) __obj.updateDynamic("afterScaleUpdate")(js.Any.fromFunction2(afterScaleUpdate))
    if (afterTooltipDraw != null) __obj.updateDynamic("afterTooltipDraw")(js.Any.fromFunction3(afterTooltipDraw))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction2(afterUpdate))
    if (beforeDatasetDraw != null) __obj.updateDynamic("beforeDatasetDraw")(js.Any.fromFunction3(beforeDatasetDraw))
    if (beforeDatasetUpdate != null) __obj.updateDynamic("beforeDatasetUpdate")(js.Any.fromFunction2(beforeDatasetUpdate))
    if (beforeDatasetsDraw != null) __obj.updateDynamic("beforeDatasetsDraw")(js.Any.fromFunction3(beforeDatasetsDraw))
    if (beforeDatasetsUpdate != null) __obj.updateDynamic("beforeDatasetsUpdate")(js.Any.fromFunction2(beforeDatasetsUpdate))
    if (beforeDraw != null) __obj.updateDynamic("beforeDraw")(js.Any.fromFunction3(beforeDraw))
    if (beforeEvent != null) __obj.updateDynamic("beforeEvent")(js.Any.fromFunction3(beforeEvent))
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction2(beforeInit))
    if (beforeLayout != null) __obj.updateDynamic("beforeLayout")(js.Any.fromFunction2(beforeLayout))
    if (beforeRender != null) __obj.updateDynamic("beforeRender")(js.Any.fromFunction2(beforeRender))
    if (beforeTooltipDraw != null) __obj.updateDynamic("beforeTooltipDraw")(js.Any.fromFunction3(beforeTooltipDraw))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction2(beforeUpdate))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3(resize))
    __obj.asInstanceOf[PluginServiceRegistrationOptions]
  }
}

