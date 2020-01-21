package typings.chartJs.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialChartOptions extends ChartOptions

object RadialChartOptions {
  @scala.inline
  def apply(
    animation: ChartAnimationOptions = null,
    aspectRatio: Int | Double = null,
    circumference: Int | Double = null,
    cutoutPercentage: Int | Double = null,
    devicePixelRatio: Int | Double = null,
    elements: ChartElementsOptions = null,
    events: js.Array[String] = null,
    hover: ChartHoverOptions = null,
    layout: ChartLayoutOptions = null,
    legend: ChartLegendOptions = null,
    legendCallback: /* chart */ Chart => String = null,
    maintainAspectRatio: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ js.UndefOr[MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _ = null,
    onHover: js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _] = null,
    onResize: js.ThisFunction1[/* this */ Chart, /* newSize */ ChartSize, Unit] = null,
    plugins: ChartPluginsOptions = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    responsiveAnimationDuration: Int | Double = null,
    rotation: Int | Double = null,
    scale: RadialLinearScale = null,
    scales: ChartScales | LinearScale | LogarithmicScale | TimeScale = null,
    showLines: js.UndefOr[Boolean] = js.undefined,
    spanGaps: js.UndefOr[Boolean] = js.undefined,
    title: ChartTitleOptions = null,
    tooltips: ChartTooltipOptions = null
  ): RadialChartOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (circumference != null) __obj.updateDynamic("circumference")(circumference.asInstanceOf[js.Any])
    if (cutoutPercentage != null) __obj.updateDynamic("cutoutPercentage")(cutoutPercentage.asInstanceOf[js.Any])
    if (devicePixelRatio != null) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendCallback != null) __obj.updateDynamic("legendCallback")(js.Any.fromFunction1(legendCallback))
    if (!js.isUndefined(maintainAspectRatio)) __obj.updateDynamic("maintainAspectRatio")(maintainAspectRatio.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(onHover.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(onResize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (responsiveAnimationDuration != null) __obj.updateDynamic("responsiveAnimationDuration")(responsiveAnimationDuration.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (!js.isUndefined(showLines)) __obj.updateDynamic("showLines")(showLines.asInstanceOf[js.Any])
    if (!js.isUndefined(spanGaps)) __obj.updateDynamic("spanGaps")(spanGaps.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialChartOptions]
  }
}

