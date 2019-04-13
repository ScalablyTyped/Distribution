package typings
package botvsLib.botvsMod.Global.botvsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions
  extends highchartsLib.highstockMod.Options {
  var __isStock: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    __isStock: js.UndefOr[scala.Boolean] = js.undefined,
    accessibility: highchartsLib.highchartsMod.AccessibilityOptions = null,
    annotations: js.Array[highchartsLib.highchartsMod.AnnotationsOptions] = null,
    chart: highchartsLib.highchartsMod.ChartOptions = null,
    colorAxis: highchartsLib.highchartsMod.ColorAxisOptions | js.Array[highchartsLib.highchartsMod.ColorAxisOptions] = null,
    colors: js.Array[highchartsLib.highchartsMod.Color] = null,
    credits: highchartsLib.highchartsMod.CreditsOptions = null,
    data: highchartsLib.highchartsMod.DataOptions = null,
    defs: js.Any = null,
    drilldown: highchartsLib.highchartsMod.DrilldownOptions = null,
    exporting: highchartsLib.highchartsMod.ExportingOptions = null,
    labels: highchartsLib.highchartsMod.LabelsOptions = null,
    lang: highchartsLib.highchartsMod.LangObject = null,
    legend: highchartsLib.highchartsMod.LegendOptions = null,
    loading: highchartsLib.highchartsMod.LoadingOptions = null,
    navigation: highchartsLib.highchartsMod.NavigationOptions = null,
    navigator: highchartsLib.highstockMod.NavigatorOptions = null,
    noData: highchartsLib.highchartsMod.NoDataOptions = null,
    pane: highchartsLib.highchartsMod.PaneOptions = null,
    plotOptions: highchartsLib.highchartsMod.PlotOptions = null,
    rangeSelector: highchartsLib.highstockMod.RangeSelectorOptions = null,
    responsive: highchartsLib.highchartsMod.ResponsiveOptions = null,
    scrollbar: highchartsLib.highstockMod.ScrollbarOptions = null,
    series: js.Array[highchartsLib.highchartsMod.IndividualSeriesOptions] = null,
    subtitle: highchartsLib.highchartsMod.SubtitleOptions = null,
    time: highchartsLib.highchartsMod.TimeOptions = null,
    title: highchartsLib.highchartsMod.TitleOptions = null,
    tooltip: highchartsLib.highchartsMod.TooltipOptions = null,
    xAxis: js.Array[highchartsLib.highchartsMod.AxisOptions] | highchartsLib.highchartsMod.AxisOptions = null,
    xAxis_Options: js.Array[highchartsLib.highstockMod.XAxisOptions] | highchartsLib.highstockMod.XAxisOptions = null,
    yAxis: js.Array[highchartsLib.highchartsMod.AxisOptions] | highchartsLib.highchartsMod.AxisOptions = null,
    yAxis_Options: js.Array[highchartsLib.highstockMod.YAxisOptions] | highchartsLib.highstockMod.YAxisOptions = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__isStock)) __obj.updateDynamic("__isStock")(__isStock)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (credits != null) __obj.updateDynamic("credits")(credits)
    if (data != null) __obj.updateDynamic("data")(data)
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (exporting != null) __obj.updateDynamic("exporting")(exporting)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (navigator != null) __obj.updateDynamic("navigator")(navigator)
    if (noData != null) __obj.updateDynamic("noData")(noData)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (plotOptions != null) __obj.updateDynamic("plotOptions")(plotOptions)
    if (rangeSelector != null) __obj.updateDynamic("rangeSelector")(rangeSelector)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar)
    if (series != null) __obj.updateDynamic("series")(series)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (time != null) __obj.updateDynamic("time")(time)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (xAxis_Options != null) __obj.updateDynamic("xAxis")(xAxis_Options.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (yAxis_Options != null) __obj.updateDynamic("yAxis")(yAxis_Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

