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

