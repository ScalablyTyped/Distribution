package typings
package chartDotJsLib.chartDotJsMod

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
  var legendCallback: js.UndefOr[js.Function1[/* chart */ Chart, java.lang.String]] = js.undefined
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
      /* this */ Chart, 
      /* event */ stdLib.MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.undefined
  var onResize: js.UndefOr[js.ThisFunction1[/* this */ Chart, /* newSize */ ChartSize, scala.Unit]] = js.undefined
  var plugins: js.UndefOr[ChartPluginsOptions] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var responsiveAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scales: js.UndefOr[ChartScales] = js.undefined
  var showLines: js.UndefOr[scala.Boolean] = js.undefined
  var spanGaps: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[ChartTitleOptions] = js.undefined
  var tooltips: js.UndefOr[ChartTooltipOptions] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    animation: ChartAnimationOptions = null,
    aspectRatio: scala.Int | scala.Double = null,
    circumference: scala.Int | scala.Double = null,
    cutoutPercentage: scala.Int | scala.Double = null,
    devicePixelRatio: scala.Int | scala.Double = null,
    elements: ChartElementsOptions = null,
    events: js.Array[java.lang.String] = null,
    hover: ChartHoverOptions = null,
    layout: ChartLayoutOptions = null,
    legend: ChartLegendOptions = null,
    legendCallback: /* chart */ Chart => java.lang.String = null,
    maintainAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: (/* event */ js.UndefOr[stdLib.MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _ = null,
    onHover: js.ThisFunction2[
      /* this */ Chart, 
      /* event */ stdLib.MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ] = null,
    onResize: js.ThisFunction1[/* this */ Chart, /* newSize */ ChartSize, scala.Unit] = null,
    plugins: ChartPluginsOptions = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveAnimationDuration: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    scales: ChartScales = null,
    showLines: js.UndefOr[scala.Boolean] = js.undefined,
    spanGaps: js.UndefOr[scala.Boolean] = js.undefined,
    title: ChartTitleOptions = null,
    tooltips: ChartTooltipOptions = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (circumference != null) __obj.updateDynamic("circumference")(circumference.asInstanceOf[js.Any])
    if (cutoutPercentage != null) __obj.updateDynamic("cutoutPercentage")(cutoutPercentage.asInstanceOf[js.Any])
    if (devicePixelRatio != null) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (events != null) __obj.updateDynamic("events")(events)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendCallback != null) __obj.updateDynamic("legendCallback")(js.Any.fromFunction1(legendCallback))
    if (!js.isUndefined(maintainAspectRatio)) __obj.updateDynamic("maintainAspectRatio")(maintainAspectRatio)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (responsiveAnimationDuration != null) __obj.updateDynamic("responsiveAnimationDuration")(responsiveAnimationDuration.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (!js.isUndefined(showLines)) __obj.updateDynamic("showLines")(showLines)
    if (!js.isUndefined(spanGaps)) __obj.updateDynamic("spanGaps")(spanGaps)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    __obj.asInstanceOf[ChartOptions]
  }
}

