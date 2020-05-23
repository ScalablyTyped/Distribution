package typings.chartJs.anon

import typings.chartJs.mod.ChartAnimationOptions
import typings.chartJs.mod.ChartColor
import typings.chartJs.mod.ChartElementsOptions
import typings.chartJs.mod.ChartHoverOptions
import typings.chartJs.mod.ChartLayoutOptions
import typings.chartJs.mod.ChartLegendOptions
import typings.chartJs.mod.ChartPluginsOptions
import typings.chartJs.mod.ChartScales
import typings.chartJs.mod.ChartSize
import typings.chartJs.mod.ChartTitleOptions
import typings.chartJs.mod.ChartTooltipOptions
import typings.chartJs.mod.LinearScale
import typings.chartJs.mod.LogarithmicScale
import typings.chartJs.mod.RadialLinearScale
import typings.chartJs.mod.TimeScale
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined chart.js.chart.js.ChartOptions & chart.js.chart.js.ChartFontOptions & {  tooltips  :chart.js.chart.js.ChartTooltipOptions} */
trait ChartOptionsChartFontOpti extends js.Object {
  var animation: js.UndefOr[ChartAnimationOptions] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var circumference: js.UndefOr[Double] = js.undefined
  var cutoutPercentage: js.UndefOr[Double] = js.undefined
  var defaultFontColor: js.UndefOr[ChartColor] = js.undefined
  var defaultFontFamily: js.UndefOr[String] = js.undefined
  var defaultFontSize: js.UndefOr[Double] = js.undefined
  var defaultFontStyle: js.UndefOr[String] = js.undefined
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  var elements: js.UndefOr[ChartElementsOptions] = js.undefined
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var hover: js.UndefOr[ChartHoverOptions] = js.undefined
  var layout: js.UndefOr[ChartLayoutOptions] = js.undefined
  var legend: js.UndefOr[ChartLegendOptions] = js.undefined
  var legendCallback: js.UndefOr[js.Function1[/* chart */ typings.chartJs.mod.Chart, String]] = js.undefined
  var maintainAspectRatio: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[MouseEvent], 
      /* activeElements */ js.UndefOr[js.Array[js.Object]], 
      _
    ]
  ] = js.undefined
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ typings.chartJs.mod.Chart, 
      /* event */ MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.undefined
  var onResize: js.UndefOr[
    js.ThisFunction1[/* this */ typings.chartJs.mod.Chart, /* newSize */ ChartSize, Unit]
  ] = js.undefined
  var plugins: js.UndefOr[ChartPluginsOptions] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var responsiveAnimationDuration: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[RadialLinearScale] = js.undefined
  var scales: js.UndefOr[ChartScales | LinearScale | LogarithmicScale | TimeScale] = js.undefined
  var showLines: js.UndefOr[Boolean] = js.undefined
  var spanGaps: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[ChartTitleOptions] = js.undefined
  var tooltips: js.UndefOr[ChartTooltipOptions] = js.undefined
}

object ChartOptionsChartFontOpti {
  @scala.inline
  def apply(
    animation: ChartAnimationOptions = null,
    aspectRatio: js.UndefOr[Double] = js.undefined,
    circumference: js.UndefOr[Double] = js.undefined,
    cutoutPercentage: js.UndefOr[Double] = js.undefined,
    defaultFontColor: ChartColor = null,
    defaultFontFamily: String = null,
    defaultFontSize: js.UndefOr[Double] = js.undefined,
    defaultFontStyle: String = null,
    devicePixelRatio: js.UndefOr[Double] = js.undefined,
    elements: ChartElementsOptions = null,
    events: js.Array[String] = null,
    hover: ChartHoverOptions = null,
    layout: ChartLayoutOptions = null,
    legend: ChartLegendOptions = null,
    legendCallback: /* chart */ typings.chartJs.mod.Chart => String = null,
    maintainAspectRatio: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ js.UndefOr[MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _ = null,
    onHover: js.ThisFunction2[
      /* this */ typings.chartJs.mod.Chart, 
      /* event */ MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ] = null,
    onResize: js.ThisFunction1[/* this */ typings.chartJs.mod.Chart, /* newSize */ ChartSize, Unit] = null,
    plugins: ChartPluginsOptions = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    responsiveAnimationDuration: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: RadialLinearScale = null,
    scales: ChartScales | LinearScale | LogarithmicScale | TimeScale = null,
    showLines: js.UndefOr[Boolean] = js.undefined,
    spanGaps: js.UndefOr[Boolean] = js.undefined,
    title: ChartTitleOptions = null,
    tooltips: ChartTooltipOptions = null
  ): ChartOptionsChartFontOpti = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circumference)) __obj.updateDynamic("circumference")(circumference.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cutoutPercentage)) __obj.updateDynamic("cutoutPercentage")(cutoutPercentage.get.asInstanceOf[js.Any])
    if (defaultFontColor != null) __obj.updateDynamic("defaultFontColor")(defaultFontColor.asInstanceOf[js.Any])
    if (defaultFontFamily != null) __obj.updateDynamic("defaultFontFamily")(defaultFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFontSize)) __obj.updateDynamic("defaultFontSize")(defaultFontSize.get.asInstanceOf[js.Any])
    if (defaultFontStyle != null) __obj.updateDynamic("defaultFontStyle")(defaultFontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(devicePixelRatio)) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio.get.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendCallback != null) __obj.updateDynamic("legendCallback")(js.Any.fromFunction1(legendCallback))
    if (!js.isUndefined(maintainAspectRatio)) __obj.updateDynamic("maintainAspectRatio")(maintainAspectRatio.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(onHover.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(onResize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveAnimationDuration)) __obj.updateDynamic("responsiveAnimationDuration")(responsiveAnimationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (!js.isUndefined(showLines)) __obj.updateDynamic("showLines")(showLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spanGaps)) __obj.updateDynamic("spanGaps")(spanGaps.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptionsChartFontOpti]
  }
}

