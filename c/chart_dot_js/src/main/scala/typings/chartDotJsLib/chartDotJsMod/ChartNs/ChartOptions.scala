package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartOptions extends js.Object {
  var animation: js.UndefOr[ChartAnimationOptions] = js.undefined
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  var circumference: js.UndefOr[scala.Double] = js.undefined
  var cutoutPercentage: js.UndefOr[scala.Double] = js.undefined
  var devicePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var elements: js.UndefOr[ChartElementsOptions] = js.undefined
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hover: js.UndefOr[ChartHoverOptions] = js.undefined
  var layout: js.UndefOr[ChartLayoutOptions] = js.undefined
  var legend: js.UndefOr[ChartLegendOptions] = js.undefined
  var legendCallback: js.UndefOr[js.Function1[/* chart */ chartDotJsLib.chartDotJsMod.Chart, java.lang.String]] = js.undefined
  var maintainAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[stdLib.MouseEvent], 
      /* activeElements */ js.UndefOr[js.Array[js.Object]], 
      _
    ]
  ] = js.undefined
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ chartDotJsLib.chartDotJsMod.Chart, 
      /* event */ stdLib.MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.undefined
  var onResize: js.UndefOr[
    js.ThisFunction1[/* this */ chartDotJsLib.chartDotJsMod.Chart, /* newSize */ ChartSize, scala.Unit]
  ] = js.undefined
  // Plugins can require any options
  var plugins: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var responsiveAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scales: js.UndefOr[ChartScales] = js.undefined
  var showLines: js.UndefOr[scala.Boolean] = js.undefined
  var spanGaps: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[ChartTitleOptions] = js.undefined
  var tooltips: js.UndefOr[ChartTooltipOptions] = js.undefined
}

