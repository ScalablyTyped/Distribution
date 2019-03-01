package typings
package botvsLib.botvsMod.Global.botvsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions
  extends highchartsLib.highstockMod.HighstockNs.Options {
  var __isStock: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    __isStock: js.UndefOr[scala.Boolean] = js.undefined,
    accessibility: highchartsLib.highchartsMod.HighchartsNs.AccessibilityOptions = null,
    annotations: js.Array[highchartsLib.highchartsMod.HighchartsNs.AnnotationsOptions] = null,
    chart: highchartsLib.highchartsMod.HighchartsNs.ChartOptions = null,
    colorAxis: highchartsLib.highchartsMod.HighchartsNs.ColorAxisOptions | js.Array[highchartsLib.highchartsMod.HighchartsNs.ColorAxisOptions] = null,
    colors: js.Array[highchartsLib.highchartsMod.HighchartsNs.Color] = null,
    credits: highchartsLib.highchartsMod.HighchartsNs.CreditsOptions = null,
    data: highchartsLib.highchartsMod.HighchartsNs.DataOptions = null,
    defs: js.Any = null,
    drilldown: highchartsLib.highchartsMod.HighchartsNs.DrilldownOptions = null,
    exporting: highchartsLib.highchartsMod.HighchartsNs.ExportingOptions = null,
    labels: highchartsLib.highchartsMod.HighchartsNs.LabelsOptions = null,
    lang: highchartsLib.highchartsMod.HighchartsNs.LangObject = null,
    legend: highchartsLib.highchartsMod.HighchartsNs.LegendOptions = null,
    loading: highchartsLib.highchartsMod.HighchartsNs.LoadingOptions = null,
    navigation: highchartsLib.highchartsMod.HighchartsNs.NavigationOptions = null,
    navigator: highchartsLib.highstockMod.HighstockNs.NavigatorOptions = null,
    noData: highchartsLib.highchartsMod.HighchartsNs.NoDataOptions = null,
    pane: highchartsLib.highchartsMod.HighchartsNs.PaneOptions = null,
    plotOptions: highchartsLib.highchartsMod.HighchartsNs.PlotOptions = null,
    rangeSelector: highchartsLib.highstockMod.HighstockNs.RangeSelectorOptions = null,
    responsive: highchartsLib.highchartsMod.HighchartsNs.ResponsiveOptions = null,
    scrollbar: highchartsLib.highstockMod.HighstockNs.ScrollbarOptions = null,
    series: js.Array[highchartsLib.highchartsMod.HighchartsNs.IndividualSeriesOptions] = null,
    subtitle: highchartsLib.highchartsMod.HighchartsNs.SubtitleOptions = null,
    time: highchartsLib.highchartsMod.HighchartsNs.TimeOptions = null,
    title: highchartsLib.highchartsMod.HighchartsNs.TitleOptions = null,
    tooltip: highchartsLib.highchartsMod.HighchartsNs.TooltipOptions = null,
    xAxis: js.Array[highchartsLib.highchartsMod.HighchartsNs.AxisOptions] | highchartsLib.highchartsMod.HighchartsNs.AxisOptions = null,
    xAxis_Options: js.Array[highchartsLib.highstockMod.HighstockNs.XAxisOptions] | highchartsLib.highstockMod.HighstockNs.XAxisOptions = null,
    yAxis: js.Array[highchartsLib.highchartsMod.HighchartsNs.AxisOptions] | highchartsLib.highchartsMod.HighchartsNs.AxisOptions = null,
    yAxis_Options: js.Array[highchartsLib.highstockMod.HighstockNs.YAxisOptions] | highchartsLib.highstockMod.HighstockNs.YAxisOptions = null
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

