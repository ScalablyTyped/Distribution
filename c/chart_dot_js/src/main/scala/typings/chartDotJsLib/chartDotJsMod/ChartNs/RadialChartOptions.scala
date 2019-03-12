package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialChartOptions extends ChartOptions {
  var scale: js.UndefOr[RadialLinearScale] = js.undefined
}

object RadialChartOptions {
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
    legendCallback: /* chart */ chartDotJsLib.chartDotJsMod.Chart => java.lang.String = null,
    maintainAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: (/* event */ js.UndefOr[stdLib.MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _ = null,
    onHover: js.ThisFunction2[
      /* this */ chartDotJsLib.chartDotJsMod.Chart, 
      /* event */ stdLib.MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ] = null,
    onResize: js.ThisFunction1[/* this */ chartDotJsLib.chartDotJsMod.Chart, /* newSize */ ChartSize, scala.Unit] = null,
    plugins: ChartPluginsOptions = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveAnimationDuration: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    scale: RadialLinearScale = null,
    scales: ChartScales = null,
    showLines: js.UndefOr[scala.Boolean] = js.undefined,
    spanGaps: js.UndefOr[scala.Boolean] = js.undefined,
    title: ChartTitleOptions = null,
    tooltips: ChartTooltipOptions = null
  ): RadialChartOptions = {
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
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (!js.isUndefined(showLines)) __obj.updateDynamic("showLines")(showLines)
    if (!js.isUndefined(spanGaps)) __obj.updateDynamic("spanGaps")(spanGaps)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    __obj.asInstanceOf[RadialChartOptions]
  }
}

