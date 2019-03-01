package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceRegistrationOptions extends js.Object {
  var afterDatasetDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var afterDatasetUpdate: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var afterDatasetsDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var afterDatasetsUpdate: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var afterDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var afterEvent: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* event */ stdLib.Event, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var afterInit: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var afterLayout: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var afterRender: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** @deprecated since version 2.5.0. Use `afterLayout` instead. */
  var afterScaleUpdate: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  // Called after drawing the `tooltip`. Note that this hook will not,
  // be called if the tooltip drawing has been previously cancelled.
  var afterTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var afterUpdate: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var beforeDatasetDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeDatasetUpdate: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  // Before the datasets are drawn but after scales are drawn
  var beforeDatasetsDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeDatasetsUpdate: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  // Easing is for animation
  var beforeDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  // Called when an event occurs on the chart
  var beforeEvent: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* event */ stdLib.Event, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeInit: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var beforeLayout: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  // This is called at the start of a render. It is only called once, even if the animation will run for a number of frames. Use beforeDraw or afterDraw
  // to do something on each animation frame
  var beforeRender: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  // Called before drawing the `tooltip`. If any plugin returns `false`,
  // the tooltip drawing is cancelled until another `render` is triggered.
  var beforeTooltipDraw: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeUpdate: js.UndefOr[
    js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var destroy: js.UndefOr[js.Function1[/* chartInstance */ Chart, scala.Unit]] = js.undefined
  var resize: js.UndefOr[
    js.Function3[
      /* chartInstance */ Chart, 
      /* newChartSize */ chartDotJsLib.chartDotJsMod.ChartNs.ChartSize, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object PluginServiceRegistrationOptions {
  @scala.inline
  def apply(
    afterDatasetDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    afterDatasetUpdate: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    afterDatasetsDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    afterDatasetsUpdate: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    afterDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    afterEvent: js.Function3[
      /* chartInstance */ Chart, 
      /* event */ stdLib.Event, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    afterInit: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    afterLayout: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    afterRender: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    afterScaleUpdate: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    afterTooltipDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    afterUpdate: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeDatasetDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    beforeDatasetUpdate: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeDatasetsDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    beforeDatasetsUpdate: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* easing */ java.lang.String, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    beforeEvent: js.Function3[
      /* chartInstance */ Chart, 
      /* event */ stdLib.Event, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    beforeInit: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeLayout: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeRender: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeTooltipDraw: js.Function3[
      /* chartInstance */ Chart, 
      /* tooltipData */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    beforeUpdate: js.Function2[/* chartInstance */ Chart, /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    destroy: js.Function1[/* chartInstance */ Chart, scala.Unit] = null,
    resize: js.Function3[
      /* chartInstance */ Chart, 
      /* newChartSize */ chartDotJsLib.chartDotJsMod.ChartNs.ChartSize, 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null
  ): PluginServiceRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (afterDatasetDraw != null) __obj.updateDynamic("afterDatasetDraw")(afterDatasetDraw)
    if (afterDatasetUpdate != null) __obj.updateDynamic("afterDatasetUpdate")(afterDatasetUpdate)
    if (afterDatasetsDraw != null) __obj.updateDynamic("afterDatasetsDraw")(afterDatasetsDraw)
    if (afterDatasetsUpdate != null) __obj.updateDynamic("afterDatasetsUpdate")(afterDatasetsUpdate)
    if (afterDraw != null) __obj.updateDynamic("afterDraw")(afterDraw)
    if (afterEvent != null) __obj.updateDynamic("afterEvent")(afterEvent)
    if (afterInit != null) __obj.updateDynamic("afterInit")(afterInit)
    if (afterLayout != null) __obj.updateDynamic("afterLayout")(afterLayout)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (afterScaleUpdate != null) __obj.updateDynamic("afterScaleUpdate")(afterScaleUpdate)
    if (afterTooltipDraw != null) __obj.updateDynamic("afterTooltipDraw")(afterTooltipDraw)
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(afterUpdate)
    if (beforeDatasetDraw != null) __obj.updateDynamic("beforeDatasetDraw")(beforeDatasetDraw)
    if (beforeDatasetUpdate != null) __obj.updateDynamic("beforeDatasetUpdate")(beforeDatasetUpdate)
    if (beforeDatasetsDraw != null) __obj.updateDynamic("beforeDatasetsDraw")(beforeDatasetsDraw)
    if (beforeDatasetsUpdate != null) __obj.updateDynamic("beforeDatasetsUpdate")(beforeDatasetsUpdate)
    if (beforeDraw != null) __obj.updateDynamic("beforeDraw")(beforeDraw)
    if (beforeEvent != null) __obj.updateDynamic("beforeEvent")(beforeEvent)
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(beforeInit)
    if (beforeLayout != null) __obj.updateDynamic("beforeLayout")(beforeLayout)
    if (beforeRender != null) __obj.updateDynamic("beforeRender")(beforeRender)
    if (beforeTooltipDraw != null) __obj.updateDynamic("beforeTooltipDraw")(beforeTooltipDraw)
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(beforeUpdate)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[PluginServiceRegistrationOptions]
  }
}

